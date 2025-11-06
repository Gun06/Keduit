/*
	[외래키로 연결되어 있는 테이블 조작하기]
    - 관계형 데이터베이스는 데이터의 무결성을 유지해야 하므로
    - 부모 테이블에 없는 데이터가 자식 테이블에 있으면 안 되는 것이 원칙이다.
    - 이 원칙을 유지하면 데이터가 잘못 입력되거나 삭제되는 것을 방지할 수 있다.
*/

CREATE DATABASE foreign_db;

USE foreign_db;

# 상위(부모) 테이블
CREATE TABLE parent_table (
	col INT PRIMARY KEY
);
# 하위(자식) 테이블
CREATE TABLE child_table (
	col INT
);

# 하위 테이블이 상위 테이블의 col 컬럼에 대해서 외래키 설정
ALTER TABLE child_table 
ADD FOREIGN KEY (col) REFERENCES parent_table(col);

/*
    [외래키로 연결되어 있는 테이블에 데이터 입력하기]
    -----------------------------------------------------------
	- 하위 테이블(자식 테이블)에 데이터를 입력할 때 
      상위 테이블(부모 테이블)에 해당 데이터가 없으면 데이터 입력에 실패한다.
	- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`foreign_db`.`child_table`, CONSTRAINT `child_table_ibfk_1` FOREIGN KEY (`col`) REFERENCES `parent_table` (`col`))
    - 이 오류는 부모 테이블에 데이터를 먼저 입력해야 해결할 수 있다.
*/
INSERT INTO child_table VALUES(1);

# 해결
INSERT INTO parent_table VALUES(1);
INSERT INTO child_table VALUES(1);

SELECT * FROM parent_table;
SELECT * FROM child_table;

/*
    [외래키로 연결되어 있는 테이블에 데이터 삭제하기]
    -----------------------------------------------------------
	- 상위 테이블에서만 데이터를 삭제하려는 경우,
    - 이 역시도 외래키 때문에 오류가 발생하며 데이터 삭제에 실패한다.
    - Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`foreign_db`.`child_table`, CONSTRAINT `child_table_ibfk_1` FOREIGN KEY (`col`) REFERENCES `parent_table` (`col`))
    - 이 오류는 자식 테이블의 데이터를 먼저 삭제하고 부모 테이블의 데이터를 삭제해야 정상적으로 데이터를 삭제할 수 있다.
*/
DELETE FROM parent_table WHERE col = 1;

# 해결
DELETE FROM child_table WHERE col = 1;
DELETE FROM parent_table WHERE col = 1;

SELECT * FROM parent_table;
SELECT * FROM child_table;


/*
    [외래키로 연결되어 있는 테이블 삭제하기]
    -----------------------------------------------------------
	- 부모 테이블을 먼저 삭제하려고 하면 오류가 발생한다.
    - Error Code: 3730. Cannot drop table 'parent_table' referenced by a foreign key constraint 'child_table_ibfk_1' on table 'child_table'.
	- 해결1) 외래키가 설정되어 있는 테이블을 삭제하려면 자식 테이블 → 부모 테이블 순서로 삭제해야 한다.
    - 해결2) 만약 자식 테이블의 데이터는 유지하면서 부모 테이블을 삭제하고 싶다면 제약 조건을 제거하여 부모 테이블 삭제를 진행하는 방법도 있다.
*/
DROP TABLE parent_table;

# 해결1) 자식 테이블을 먼저 삭제하고, 부모 테이블을 삭제
DROP TABLE child_table;
DROP TABLE parent_table;

# 해결2) 제약 조건을 제거하여 부모 테이블만 삭제하고 자식 테이블을 유지
CREATE TABLE parent_table (col INT PRIMARY KEY);
CREATE TABLE child_table (col INT);
ALTER TABLE child_table 
ADD FOREIGN KEY (col) REFERENCES parent_table(col);

# 생성된 제약 조건 확인하기
# 'child_table', 'CREATE TABLE `child_table` (\n  `col` int(11) DEFAULT NULL,\n  KEY `col` (`col`),\n  CONSTRAINT `child_table_ibfk_1` FOREIGN KEY (`col`) REFERENCES `parent_table` (`col`)\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'
# 외래키 : child_table_ibfk_1
SHOW CREATE TABLE child_table;

# 제약 조건 제거하기
ALTER TABLE child_table 
DROP FOREIGN KEY child_table_ibfk_1;

# 제약 조건 삭제 후, 상위 테이블 삭제 가능
DROP TABLE parent_table;
DESC child_table;
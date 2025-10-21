// 서버 세팅 
var express = require("express");
var app = express();
var port = 3100;
var server = app.listen(port, function(){
	console.log("서버가 가동되었습니다" + port);
});

// ejs 세팅(views)
var ejs = require("ejs");
app.set("views", __dirname + "/views");
app.set("view engine", "ejs");
app.engine("ejs", ejs.renderFile);
//---------------------------------------------------------------------------------------

// img폴더 경로 셋팅
app.use(express.static('./img'));			
//---------------------------------------------------------------------------------------

// session 세팅
var session = require("express-session");
app.use(session({							// session에는 옵션3가지를 설정해야줘야 한다. 
	secret : "abcdefg",						// secret에는 아무 내용이나 작성해주고,
	resave : false,							// 나머지는 false로 설정한다.
	saveUninitialized : false
}));

//----------------------------
// 폼에서 post를 사용하기위함 
app.use(express.urlencoded({ extended: true })); 
app.use(express.json()); 

//-----------------------------

// 라우터 연결
require("./router/boardController")(app);


// 라우터 세팅
app.get("/" , (req, res) => {

	// 샘플 데이터
    var boardDB = [
		{"boardNo" :  1, "boardWriter" : "qwer", "boardSubject" :  "제목1", "boardContent" :  "내용1", "boardReadCount" : 5},
		{"boardNo" :  2, "boardWriter" : "asdf", "boardSubject" :  "제목2", "boardContent" :  "내용2", "boardReadCount" : 1},
		{"boardNo" :  3, "boardWriter" : "qwer", "boardSubject" :  "제목3", "boardContent" :  "내용3", "boardReadCount" : 2},
		{"boardNo" :  4, "boardWriter" : "qwer", "boardSubject" :  "제목4", "boardContent" :  "내용4", "boardReadCount" : 0},	
	];

	req.session.boardDB = boardDB;

    res.redirect("index"); 
});

app.get("/index", (req, res) => { 
    
    res.render("board/02main.ejs"); 
});




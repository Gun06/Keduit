
// 평범한 함수 (자주 사용하는 내용은 만들어두면 편하다)
function getMaxBoardNo(boardDB) {
    var maxNo = 0;
    for(var i=0; i<boardDB.length; i++) {
        if(maxNo < boardDB[i]["boardNo"]) {
            maxNo = boardDB[i]["boardNo"];
        }
    }
    return maxNo;
}

module.exports = function(app){
    
    app.get("/boardList", function(req, res){     

        var boardDB = req.session.boardDB;       
        console.log(boardDB);
        var renderData = {	          
            "boardDB" : boardDB,          
        };
        res.render("board/03boardList.ejs", renderData); 

    });

    app.get("/addTestPro", function(req, res){     
        var boardDB = req.session.boardDB;      
        for(let i = 0; i < 10; i++){
            let maxNo = getMaxBoardNo(boardDB);
            maxNo += 1;
            let newBoard = {
                "boardNo" :  maxNo , 
                "boardWriter" : "작성자" + maxNo , 
                "boardSubject" :  "제목" + maxNo, 
                "boardContent" :  "내용" + maxNo , 
                "boardReadCount" : 0};
            
            boardDB.push(newBoard);
        }
        var renderData = {	          
            "boardDB" : boardDB,          
        };
        res.render("board/03boardList.ejs", renderData); 
    });

    app.get("/addBoard", function(req, res){
        var boardDB = req.session.boardDB;

        var maxBoardNo = getMaxBoardNo(boardDB);
        maxBoardNo += 1;

        var renderData = {	
            "boardNo" : maxBoardNo
        };
        res.render("board/05addBoard.ejs", renderData); 
    });    

    
    app.post("/addBoardPro", function(req, res){
        var boardDB = req.session.boardDB;
        console.log(req.body);
        var boardNo = req.body.no;
        var boardWriter = req.body.writer;
        var boardSubject = req.body.subject;
        var boardContent = req.body.contents;
        var board = {
            "boardNo" :  boardNo, 
            "boardWriter" : boardWriter, 
            "boardSubject" :  boardSubject, 
            "boardContent" :  boardContent, 
            "boardReadCount" : 0};
        console.log(board);
        boardDB.push(board);
        res.redirect("boardList");
    });    

    app.get("/deleteBoardPro", function(req, res){

        var boardDB = req.session.boardDB;

        var index = req.query.index;
        boardDB.splice(index, 1)
       
        res.redirect("boardList");
    });

    app.get("/boardInfo", function(req, res){
        var boardDB = req.session.boardDB;

        var index = req.query.index;
       

        boardDB[index]["boardReadCount"] += 1;
        var board = boardDB[index];

        var renderData = {	     
            "board" : board,     
        };
        res.render("board/07boardInfo.ejs", renderData); 
     });

     app.get("/updateBoard", function(req, res){
        var boardDB = req.session.boardDB;
        var index = req.query.index;
        var board = boardDB[index];
        var renderData = {	     
            "board" : board,     
        };
        res.render("board/09updateBoard.ejs", renderData); 
     });


     app.post("/updateBoardPro", function(req, res){
        var boardDB = req.session.boardDB;
        console.log(req.body);
        var boardNo = req.body.no;
        var boardWriter = req.body.writer;
        var boardSubject = req.body.subject;
        var boardContent = req.body.contents;
        var board = {
            "boardNo" :  boardNo, 
            "boardWriter" : boardWriter, 
            "boardSubject" :  boardSubject, 
            "boardContent" :  boardContent, 
            "boardReadCount" : 0};
        for(let i = 0; i < boardDB.length; i++){
            if(boardDB[i].boardNo == boardNo){
                boardDB[i] = board;
            }
        }
        res.redirect("boardList");
    });    
};
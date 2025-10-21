// # 서버 세팅 
var express = require("express");
var app = express();
var port = 3100;
var server = app.listen(port, function(){
	console.log("서버가 가동되었습니다" + port);
});

// # ejs 세팅(views)
// [1] ejs import
var ejs = require("ejs");    
// [2] ejs view 파일의 경로 설정(__dirname은 기본 폴더를 의미)
app.set("views", __dirname);
// [3] ejse 기본셋팅1 : 항상 고정
app.set("view engine", "ejs"); 
// [4] ejse 기본셋팅2 : 항상 고정
app.engine("ejs", ejs.renderFile);


// # 라우터 세팅
// [1] res.render 하나당 ejs파일을 하나씩 추가한다. 

app.get("/", function(req, res){ 
    // [2] res.render => ejs 파일을 출력한다. 
    res.render("test_main.ejs"); 
});

app.get("/main", function(req, res){ 
    // [2] res.render => ejs 파일을 출력한다. 
    res.render("test_main.ejs"); 
});

app.get("/var01", function(req, res){ 
    res.render("test_var01.ejs"); 
});

app.get("/var01Pro", function(req, res){ 
    res.render("test_var01Pro.ejs"); 
});

app.get("/var02", function(req, res){ 
    res.render("test_var02.ejs"); 
});

app.get("/var02Pro", function(req, res){ 
    res.render("test_var02Pro.ejs"); 
});

app.get("/var03", function(req, res){ 
    res.render("test_var03.ejs"); 
});

app.get("/var03Pro", function(req, res){ 
    res.render("test_var03Pro.ejs"); 
});




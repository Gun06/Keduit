// # 서버 세팅 
var express = require("express");
var app = express();
var port = 3100;
var server = app.listen(port, function(){
	console.log("서버가 가동되었습니다" + port);
});

// # ejs 세팅(views)
var ejs = require("ejs");
// 여기가 변경되었다. 관리를 편리하게 하기위해 views 폴더를 생성한다
app.set("views", __dirname + "/views");
app.set("view engine", "ejs");
app.engine("ejs", ejs.renderFile);

// 라우터 세팅
app.get("/", function(req, res){ 
    res.redirect("main"); // res.redirect() 는 라우터이동.
});

// res.render 하나당 ejs파일을 하나씩 추가한다. 
app.get("/main", function(req, res){ 
    res.render("main.ejs"); // res.render() 는 ejs 파일을 출력한다. 
});

// 라우터 폴더 세팅
require("./router/_01_loop")(app);
require("./router/_02_array")(app);
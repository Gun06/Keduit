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


// # 라우터 세팅
app.get("/", function(req, res){ 
    // res.redirect() 는 라우터상에서 이동한다.
    res.redirect("main"); 
});

app.get("/main", function(req, res){ 
    res.render("_0100_main_if.ejs"); 
});

app.get("/if01", function(req, res){ 
    res.render("_0101_if_test.ejs");
});
app.get("/if01Pro", function(req, res){ 
    res.render("_0101_if_testPro.ejs");
});

app.get("/if02", function(req, res){
    res.render("_0102_if_test.ejs");
});
app.get("/if02Pro", function(req, res){
    res.render("_0102_if_testPro.ejs");
});

app.get("/if03", function(req, res){
    res.render("_0103_if_test.ejs");
});
app.get("/if03Pro", function(req, res){
    res.render("_0103_if_testPro.ejs");
});


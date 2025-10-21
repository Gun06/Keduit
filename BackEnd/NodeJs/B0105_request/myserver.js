// # 서버 세팅 
var express = require("express");
var app = express();
var port = 3100;
var server = app.listen(port, function(){
    console.log("서버가 가동되었습니다" + port);
});

// # ejs 세팅(views)
var ejs = require("ejs");
app.set("views", __dirname + "/views");
app.set("view engine", "ejs");
app.engine("ejs", ejs.renderFile);

// 라우터 세팅
app.get("/", function(req, res){ 
    res.redirect("main");
});

app.get("/main", function(req, res){ 
    res.render("main.ejs");
});

// 라우터 폴더 세팅
require("./router/formTest")(app);
require("./router/hiddenTest")(app);
require("./router/aTagTest")(app);
require("./router/radioTest")(app);
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
require("./router/atmController")(app);

app.get("/" , (req, res) => {
    res.redirect("index"); 
});

app.get("/index", (req, res) => { 
    res.redirect("ATM"); 
});




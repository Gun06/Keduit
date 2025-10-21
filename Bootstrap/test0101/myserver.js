// 서버 세팅 

// [1] express import
var express = require("express"); 

// [2] express객체를 생성해 app에 저장
var app = express();              

// [3] 포트번호 저장
var port = 3100; // 0~60000

// [4] server 가동
var server = app.listen(port, function(){
	console.log("서버가 가동되었습니다" + port);
});

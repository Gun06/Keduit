module.exports = function(app){

    // formTest
    app.get("/formTest", function(req, res){ 
        
        res.render("formTest/_0101_formTest.ejs"); // res.render() 는 ejs 파일을 출력한다. 
    });


    app.get("/formTestPro", function(req, res){ 
        //console.log(req.query.age)

        // request 에서 입력받은 변수를 저장해서 다음페이지로 이동한다. 
        var renderData = {
            "age" : req.query.age
        };
        res.render("formTest/_0101_formTestPro.ejs" , renderData); 
    });

    // oddEven
    app.get("/oddEven", function(req, res){ 
        
        res.render("formTest/_0102_oddEven.ejs"); 
    });

    app.get("/oddEvenPro", function(req, res){ 
        //console.log(req.query.number)
        var renderData = {
            "number" : req.query.number
        };
        res.render("formTest/_0102_oddEvenPro.ejs" , renderData); 
    });

    // compareNumber
    app.get("/compareNumber", function(req, res){ 
        
        res.render("formTest/_0103_compareNumber.ejs"); 
    });

    app.get("/compareNumberPro", function(req, res){ 
        //console.log(req.query.num1)
        //console.log(req.query.num2)
        var renderData = {
            "num1" : req.query.num1,
            "num2" : req.query.num2
        };
        res.render("formTest/_0103_compareNumberPro.ejs" , renderData); 
    });


};
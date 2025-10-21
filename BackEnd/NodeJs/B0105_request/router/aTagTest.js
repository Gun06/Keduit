module.exports = function(app){
    
    // aTag
    app.get("/aTagTest", function(req, res){ 
        
        res.render("aTagTest/_0301_aTagTest.ejs"); 
    });

    app.get("/aTagTest1Pro", function(req, res){ 
        //console.log(req.query.x)
        var renderData = {
            "x" : req.query.x,
        };
        res.render("aTagTest/_0301_aTagTest1Pro.ejs" , renderData); 
    });

    app.get("/aTagTest2Pro", function(req, res){ 
        //console.log(req.query.x)
        //console.log(req.query.y)
        //console.log(req.query.z)
        var renderData = {
            "x" : req.query.x,
            "y" : req.query.y,
            "z" : req.query.z
        };
        res.render("aTagTest/_0301_aTagTest2Pro.ejs" , renderData); 
    });

    app.get("/quizSelect", function(req, res){ 
        
        res.render("aTagTest/_0302_quizSelect.ejs"); 
    });

    app.get("/quizSelectPro", function(req, res){ 
        //console.log(req.query.ran)
        //console.log(req.query.select)
        var renderData = {
            "ran" : req.query.ran,
            "select" : req.query.select,
        };
        res.render("aTagTest/_0302_quizSelectPro.ejs" , renderData); 
    });

    app.get("/quizOperator", function(req, res){ 
        
        res.render("aTagTest/_0303_quizOperator.ejs"); 
    });

    app.get("/quizOperatorPro", function(req, res){ 
        //console.log(req.query.num1)
        //console.log(req.query.num2)
        //console.log(req.query.result)
        //console.log(req.query.op)
        //console.log(req.query.select)
        var renderData = {
            "num1" : req.query.num1,
            "num2" : req.query.num2,
            "result" : req.query.result,
            "op" : req.query.op,
            "select" : req.query.select,
        };
        res.render("aTagTest/_0303_quizOperatorPro.ejs" , renderData); 
    });


};
module.exports = function(app){
    
// hiddenTest
app.get("/hiddenTest", function(req, res){ 
    
    res.render("hiddenTest/_0201_hiddenTest.ejs"); 
});

app.get("/hiddenTestPro", function(req, res){ 
    //console.log(req.query.num1)
    //console.log(req.query.num2)
    var renderData = {
        "num1" : req.query.num1,
        "num2" : req.query.num2
    };
    res.render("hiddenTest/_0201_hiddenTestPro.ejs" , renderData); 
});

// quizUpDown
app.get("/quizUpDown", function(req, res){ 
    
    res.render("hiddenTest/_0202_quizUpDown.ejs"); 
});

app.get("/quizUpDownPro", function(req, res){ 
    //console.log(req.query.ran)
    //console.log(req.query.result)
    var renderData = {
        "ran" : req.query.ran,
        "result" : req.query.result
    };
    res.render("hiddenTest/_0202_quizUpDownPro.ejs" , renderData); 
});

// quiz99
app.get("/quiz99", function(req, res){ 
    
    res.render("hiddenTest/_0203_quiz99.ejs"); 
});

app.get("/quiz99Pro", function(req, res){ 
    //console.log(req.query.ran)
    //console.log(req.query.result)
    var renderData = {
        "num1" : req.query.num1,
        "num2" : req.query.num2,
        "result" : req.query.result
    };
    res.render("hiddenTest/_0203_quiz99Pro.ejs" , renderData); 
});
};
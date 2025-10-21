module.exports = function(app){

    // radioTest
    app.get("/radioTest", function(req, res){ 
        res.render("radioTest/_0401_radioTest.ejs"); 
    });

    app.get("/radioTestPro", function(req, res){ 
        var renderData = {
            "grade" : req.query.grade,   
        };
        res.render("radioTest/_0401_radioTestPro.ejs" , renderData); 
    });

    // selectTest
    app.get("/selectTest", function(req, res){  
        res.render("radioTest/_0402_selectTest.ejs"); 
    });

    app.get("/selectTestPro", function(req, res){   
        var renderData = {
            "subject" : req.query.subject,
            
        };
        res.render("radioTest/_0402_selectTestPro.ejs" , renderData); 
    });

    // checkboxTest
    app.get("/checkboxTest", function(req, res){ 
        res.render("radioTest/_0403_checkboxTest.ejs"); 
    });

    app.get("/checkboxTestPro", function(req, res){ 
        var renderData = {
            "hobbies" : req.query.hobbies, 
        };
        res.render("radioTest/_0403_checkboxTestPro.ejs" , renderData); 
    });


    // textareaTest
    app.get("/textareaTest", function(req, res){ 
        res.render("radioTest/_0404_textareaTest.ejs"); 
    });

    app.get("/textareaTestPro", function(req, res){ 
        var renderData = {
            "memo" : req.query.memo,    
        };
        res.render("radioTest/_0404_textareaTestPro.ejs" , renderData); 
    });

    // totalFormTest
    app.get("/totalFormTest", function(req, res){ 
        res.render("radioTest/_0405_totalFormTest.ejs"); 
    });

    app.get("/totalFormTestPro", function(req, res){ 
        var renderData = {
            "num" : req.query.num,    
            "name" : req.query.name,   
            "grade" : req.query.grade,   
            "subject" : req.query.subject,   
            "hobbies" : req.query.hobbies,   
            "memo" : req.query.memo,   
        };
        res.render("radioTest/_0405_totalFormTestPro.ejs" , renderData); 
    });

};
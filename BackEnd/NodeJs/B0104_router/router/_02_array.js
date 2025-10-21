//router 폴더 세팅
module.exports = function(app){

    app.get("/array01", function(req, res){
        res.render("array/_0301_array_test.ejs");
    });

    app.get("/array01Pro", function(req, res){
        res.render("array/_0301_array_testPro.ejs");
    });
    
    app.get("/array02", function(req, res){
        res.render("array/_0302_array_test.ejs");
    });
    app.get("/array02Pro", function(req, res){
        res.render("array/_0302_array_testPro.ejs");
    });
    
    app.get("/array03", function(req, res){
        res.render("array/_0303_array_test.ejs");
    });
    app.get("/array03Pro", function(req, res){
        res.render("array/_0303_array_testPro.ejs");
    });
    
    
};


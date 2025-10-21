//router 폴더 세팅
module.exports = function(app){

    app.get("/while01", function(req, res){
        res.render("loop/_0201_while_test.ejs");
    });

    app.get("/while01Pro", function(req, res){
        res.render("loop/_0201_while_testPro.ejs");
    });

    app.get("/while02", function(req, res){
        res.render("loop/_0202_while_test.ejs");
    });

    app.get("/while02Pro", function(req, res){
        res.render("loop/_0202_while_testPro.ejs");
    });

    app.get("/while03", function(req, res){
        res.render("loop/_0203_while_test.ejs");
    });

    app.get("/while03Pro", function(req, res){
        res.render("loop/_0203_while_testPro.ejs");
    });

};


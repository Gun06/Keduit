

module.exports = function(app){
    app.get("/adminMain", function(req, res){     
        
        var renderData = {	        
            "log" :  req.session.log,          
            
        };
        res.render("admin/02adminMain.ejs", renderData); 

    });

    app.get("/adminLoginForm", function(req, res){     
        
        var renderData = {	        
            "log" :  req.session.log,          
            
        };
        res.render("admin/03adminLoginForm.ejs", renderData); 

    });

    app.post("/adminLoginPro", function(req, res){     
        
        let id = req.body.id;
        let pw = req.body.pw;
        if(id == "admin" && pw == "admin"){
            req.session.log = id;
        }

        res.redirect("adminMain"); 

    });

    app.get("/adminLogoutPro", function(req, res){       
        req.session.log = null;
        res.redirect("adminMain"); 

    });


    app.get("/adminUserList", function(req, res){     
        var memberDB = req.session.memberDB;       
        console.log(memberDB);
        var renderData = {	        
            "log" :  req.session.log,          
            "memberDB" : memberDB,          
        };
        res.render("admin/05adminUserList.ejs", renderData); 

    });


    app.get("/adminUserDeletePro", function(req, res){      
        var memberDB = req.session.memberDB;       
        let index = req.query.index;

        memberDB.splice(index, 1);
        res.redirect("adminUserList"); 

    });
};
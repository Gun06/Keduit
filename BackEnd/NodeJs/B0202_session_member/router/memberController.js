
function getMaxMemberNo(memberDB) {
    var maxNo = 0;
    for(var i=0; i<memberDB.length; i++) {
        if(maxNo < memberDB[i]["memberNo"]) {
            maxNo = memberDB[i]["memberNo"];
        }
    }
    return maxNo;
}

function getCheckMember(memberDB, id){
    console.log(memberDB.length);
    let count = 0;
    for(var i=0; i<memberDB.length; i++) {
        if(id == memberDB[i]["memberId"]) {
            count += 1;
            break;
        }
    }
    return count;
}


module.exports = function(app){
    app.get("/memberList", function(req, res){     
        var memberDB = req.session.memberDB;       
        console.log(memberDB);
        var renderData = {	        
            "log" :  req.session.log,          
            "memberDB" : memberDB,          
        };
        res.render("member/03memberList.ejs", renderData); 

    });

    app.get("/addTestPro", function(req, res){     
        var memberDB = req.session.memberDB;      
        for(let i = 0; i < 10; i++){
            let maxNo = getMaxMemberNo(memberDB);
            maxNo += 1;
            let member = {"memberNo" : maxNo, "memberId" : "qwer" + maxNo, "memberPw" :  "1234" + maxNo, 
                "memberName" :  "테스트" + maxNo, "memberGender" : "남"};
            
            memberDB.push(member);
        }
        var renderData = {	          
            "log" :  req.session.log,          
            "memberDB" : memberDB,          
        };
        res.render("member/03memberList.ejs", renderData); 
    });

    app.get("/joinForm", function(req, res){
        var renderData = {	          
            "log" :  req.session.log,          
        };
        res.render("member/04joinForm.ejs", renderData); 
    });   
    
    app.post("/joinPro", function(req, res){
        
        var memberDB = req.session.memberDB;   
        console.log("joinPro");
        console.log(memberDB);

        var id = req.body.id;
        var pw = req.body.pw;
        var name = req.body.name;
        var gender = req.body.gender;

        let count = getCheckMember(memberDB, id);
        console.log(count);

        if(count == 0){
            let maxNo = getMaxMemberNo(memberDB);
            maxNo += 1;   
            let member = {"memberNo" :  maxNo, "memberId" : id, 
                 "memberPw" :  pw, "memberName" :  name, "memberGender" : gender};
            memberDB.push(member);
            
        }
        var renderData = {	          
            "log" :  req.session.log,        
            "count" :  count,            
        };
        res.render("member/05joinPro.ejs", renderData); 
    });   

    
    app.get("/loginForm", function(req, res){
        var renderData = {	          
            "log" :  req.session.log,          
        };
        res.render("member/06loginForm.ejs", renderData); 
    });   

    app.post("/loginPro", function(req, res){
        var memberDB = req.session.memberDB;   
        var id = req.body.id;
        var pw = req.body.pw;
        let count = 0;
        for(let i = 0; i < memberDB.length; i++){
            if(memberDB[i].memberId == id && memberDB[i].memberPw == pw){
                count += 1;
                break;
            }
        }
        if(count >= 1){
            req.session.log = id;
        }

        var renderData = {	        
            "count" :  count,            
            "log" :  req.session.log,          
        };
        res.render("member/07loginPro.ejs", renderData); 
    });
    
    app.get("/logout", function(req, res){
        req.session.log = null;
     
        res.redirect("index");
    });   

    app.get("/updateForm", function(req, res){
        let id = req.session.log;
        let memberDB = req.session.memberDB;
        let member = null;
        for(let i = 0; i < memberDB.length; i++){
            if(id == memberDB[i].memberId){
                member = memberDB[i];
            }
        }

        var renderData = {	        
            "member" :  member,            
            "log" :  req.session.log,          
        };
        res.render("member/09updateForm.ejs", renderData); 
     
    });   

    app.post("/updatePro", function(req, res){
        var memberDB = req.session.memberDB;   
        var no = req.body.no;
        var id = req.body.id;
        var pw = req.body.pw;
        var name = req.body.name;
        var gender = req.body.gender;
        let member = {"memberNo" :  no, "memberId" : id, 
            "memberPw" :  pw, "memberName" :  name, "memberGender" : gender};
        
        for(let i = 0; i < memberDB.length; i++){
            if(memberDB[i].memberId == id){
                memberDB[i] = member;
                break;
            }
        }
       
        res.redirect("index"); 
    });
    
    app.get("/deleteForm", function(req, res){
       

        var renderData = {	        
                
            "log" :  req.session.log,          
        };
        res.render("member/11deleteForm.ejs", renderData); 
     
    });   

    app.post("/deletePro", function(req, res){
        var memberDB = req.session.memberDB;   
        var id = req.session.log;
        var pw = req.body.pw;
        let count = 0;
        for(let i = 0; i < memberDB.length; i++){
            if(memberDB[i].memberId == id && memberDB[i].memberPw == pw){
                memberDB.splice(i, 1);
                req.session.log = null;
                count = 1;
                break;
            }
        }
       
        var renderData = {	        
            "count" : count,       
            "log" :  req.session.log,          
        };
        res.render("member/12deletePro.ejs", renderData); 
    });
};
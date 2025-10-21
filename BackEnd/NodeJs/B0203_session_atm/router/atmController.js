module.exports = (app) => {

    app.get("/ATM" , (req, res) =>{

        let atmTable = [
            { 
                "accountNumber" : '111-111' , 
                "accountId" : "qwer" , 
                "accountPassword" : 1234 ,
                 "accountName" : "김철수" , 
                 "balance" : 1000},
            {
                "accountNumber" : '222-222' , 
                "accountId" : "asdf" , 
                "accountPassword" : 1111 , 
                "accountName" : "송민수" , 
                "balance" : 2000},
        ];

        let atmLog = null;

        req.session.atmTable = atmTable;
        req.session.atmLog = atmLog;

        res.redirect("/ATM/atmMain"); 
    });

    app.get("/ATM/atmMain", (req, res)=>{ 

        let atmLog = req.session.atmLog;
        let renderData = {
            "atmLog" : atmLog,
        };

        res.render("ATM/atmMain.ejs", renderData); 
    });

    app.get("/ATM/atmList", (req, res)=>{ 

        let atmTable = req.session.atmTable;
        let atmLog = req.session.atmLog;
        let renderData = {
            "atmTable" : atmTable, 
            "atmLog" : atmLog,
        };

        res.render("ATM/atmList.ejs", renderData); 
    });

    app.get("/ATM/atmJoinForm" , (req, res) =>{
        let atmLog = req.session.atmLog;
        let renderData = {
           "atmLog" : atmLog,
        };
  
        res.render("ATM/atmJoinForm.ejs", renderData); 
    });

    app.get("/ATM/atmJoinPro" , (req, res) =>{
        let atmLog = req.session.atmLog;
        let atmTable = req.session.atmTable;

        let randAccountNumber = "";
        let a =  Math.floor(Math.random() * 889) + 111;
        let b =  Math.floor(Math.random() * 889) + 111;
        randAccountNumber = a + "-" + b;

        let accountId = req.query.accountId;
        let accountName = req.query.accountName;
        let accountPassword = req.query.accountPassword;
        let balance = 0;

        let memberInfo = {
            "accountNumber" : randAccountNumber,
            "accountId" : accountId,
            "accountPassword" : accountPassword, 
            "accountName" : accountName, 
            "balance" : balance
        };
            
        atmTable.push(memberInfo);

        let memberIndex = atmTable.length - 1;

        req.session.atmTable = atmTable;

        let renderData = {
            "atmLog" : atmLog,
            "atmTable" : atmTable,
            "memberIndex" : memberIndex,
            "msg" : "회원가입을 축하합니다."
        };
  
        res.render("ATM/atmMemberInfo.ejs", renderData); 
    });

    app.get("/ATM/atmLoginForm" , (req, res) =>{

        let atmLog = req.session.atmLog;
        let renderData = {
           "atmLog" : atmLog,
        };
  
        res.render("ATM/atmLoginForm.ejs", renderData); 
    });

    app.get("/ATM/atmLoginPro" , (req, res) =>{
        let accountId = req.query.accountId;
        let accountPassword = req.query.accountPassword;

        let atmLog = null;
        let atmTable = req.session.atmTable;

        for(let i = 0; i < atmTable.length; i++){
            let a = atmTable[i].accountId == accountId;
            let b = atmTable[i].accountPassword == accountPassword;
            if(a && b){

                atmLog = accountId;
                break;
            }
        }

        req.session.atmLog = atmLog;
        console.log(atmLog);
        
        res.redirect("/ATM/atmMain"); 
    });

    app.get("/ATM/atmLogout" , (req, res) =>{
       
        req.session.atmLog = null;

        res.redirect("/ATM/atmMain"); 
    });

    app.get("/ATM/atmBalance" , (req, res) =>{
       
        let atmLog = req.session.atmLog;
        let atmTable = req.session.atmTable;

        if(atmLog == null){
            res.redirect("/ATM/atmMain"); 
        }else{
            let memberIndex = null;
            for(let i = 0; i < atmTable.length; i++){
                if(atmTable[i].accountId == atmLog){
                    memberIndex =  i;
                    break;
                }
            }
    
            let renderData = {
               "atmLog" : atmLog,
               "memberIndex" : memberIndex,
               "atmTable" : atmTable,
               "msg" : "예금정보"
            };
      
            res.render("ATM/atmMemberInfo.ejs", renderData); 
        }
   
    });

    app.get("/ATM/atmDeposit" , (req, res) =>{
       
        let atmLog = req.session.atmLog;
        let renderData = {
            "atmLog" : atmLog,
         };
   
         res.render("ATM/atmDepositForm.ejs", renderData); 

    });

    app.get("/ATM/atmDepositPro" , (req, res) =>{
        
        let deposit = Number(req.query.deposit);
        let atmLog = req.session.atmLog;
        let atmTable = req.session.atmTable;

        if(atmLog == null){
            res.redirect("/ATM/atmMain"); 
        }else if(deposit < 0){
            res.redirect("/ATM/atmMain"); 
        }else {
            let memberIndex = null;
            for(let i = 0; i < atmTable.length; i++){
                console.log(atmTable[i].accountId + " " + atmLog);
                if(atmTable[i].accountId == atmLog){
                    atmTable[i].balance += deposit;
                    console.log(atmTable[i].balance);
                    memberIndex = i;
                    break;
                }
            }
            req.session.atmTable = atmTable;
            

            let renderData = {
                "atmLog" : atmLog,
                "memberIndex" : memberIndex,
                "atmTable" : atmTable,
                "msg" : "예금정보"
             };
       
             res.render("ATM/atmMemberInfo.ejs", renderData); 
        }



    });

    app.get("/ATM/atmWithdrawForm" , (req, res) =>{
       
        let atmLog = req.session.atmLog;
        if(atmLog == null){
            res.redirect("/ATM/atmMain"); 
        }else{
            let renderData = {
               "atmLog" : atmLog,
            };
      
            res.render("ATM/atmWithdrawForm.ejs", renderData); 

        }
    });

    app.get("/ATM/atmWithdrawPro" , (req, res) =>{
       
        let withdraw = Number(req.query.withdraw);
        let atmLog = req.session.atmLog;
        let atmTable = req.session.atmTable;

        if(atmLog == null){
            res.redirect("/ATM/atmMain"); 
        }else if(withdraw < 0){
            res.redirect("/ATM/atmMain"); 
        }else {
            let memberIndex = null;
            for(let i = 0; i < atmTable.length; i++){
                console.log(atmTable[i].accountId + " " + atmLog);
                if(atmTable[i].accountId == atmLog){
                    memberIndex = i;
                    if(atmTable[i].balance >= withdraw){
                        atmTable[i].balance -= withdraw;
                        console.log(atmTable[i].balance);
                    }         
                    break;
                }
            }
            req.session.atmTable = atmTable;
            

            let renderData = {
                "atmLog" : atmLog,
                "memberIndex" : memberIndex,
                "atmTable" : atmTable,
                "msg" : "예금정보"
             };
       
             res.render("ATM/atmMemberInfo.ejs", renderData); 
        }

    });

    app.get("/ATM/atmTransferForm" , (req, res) =>{
       
        let atmLog = req.session.atmLog;
        let renderData = {
           "atmLog" : atmLog,
        };
  
        res.render("ATM/atmTransferForm.ejs", renderData); 
    });

    app.get("/ATM/atmTransferPro" , (req, res) =>{
       
        let accountTrasfer = req.query.accountTrasfer;
        let transfer = Number(req.query.transfer);
        let atmLog = req.session.atmLog;
        let atmTable = req.session.atmTable;
        let memberIndex = null;
        let transferIndex = null;

        for(let i = 0; i < atmTable.length; i++){
            if(atmTable[i].accountNumber == accountTrasfer){
                transferIndex = i;              
                break;
            }
        }

        for(let i = 0; i < atmTable.length; i++){
            if(atmTable[i].accountId == atmLog){
                memberIndex = i;              
                break;
            }
        }

        console.log(atmLog);
        console.log(transfer);
        console.log(transferIndex);
        console.log(memberIndex);

        if(atmLog == null){
            res.redirect("/ATM/atmMain"); 
        }else if(transfer < 0){
            res.redirect("/ATM/atmMain"); 
        }else if(transferIndex == null){
            res.redirect("/ATM/atmMain"); 
        }else{        
            if(atmTable[memberIndex].balance >= transfer){
                atmTable[memberIndex].balance -= transfer;
                atmTable[transferIndex].balance += transfer;
            }
            req.session.atmTable = atmTable;
            let renderData = {
                "atmLog" : atmLog,
                "memberIndex" : memberIndex,
                "atmTable" : atmTable,
                "msg" : "예금정보"
             };
       
             res.render("ATM/atmMemberInfo.ejs", renderData); 
        }

    });

};


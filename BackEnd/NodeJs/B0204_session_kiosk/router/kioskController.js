


module.exports = (app) => {
    app.get("/KIOSK/kioskInit" , (req, res) =>{

        let kioskTable = [
            {
                "kioskNumber" : 1 , 
                "kioskName" : "와퍼" , 
                "kioskPrice" : 3500 , 
                "kioskCount" : 5
            },
            {
                "kioskNumber" : 2 , 
                "kioskName" : "치즈와퍼" , 
                "kioskPrice" : 4500 , 
                "kioskCount" : 1
            },
            {
                "kioskNumber" : 3 , 
                "kioskName" : "치즈버거" , 
                "kioskPrice" : 3000 , 
                "kioskCount" : 5
            },
            {
                "kioskNumber" : 4 , 
                "kioskName" : "불고기버거", 
                "kioskPrice" : 4000 , 
                "kioskCount" : 3
            },           
        ];

        let kioskLastNumber = 4;

        let orderTable = [

        ];

        req.session.orderTable = orderTable;
        req.session.kioskTable = kioskTable;
        req.session.kioskLastNumber = kioskLastNumber;

        let renderData = {
            
        };


        res.render("KIOSK/kioskInit.ejs", renderData); 
    });

    app.get("/KIOSK/kioskMain", (req, res)=>{ 
        
        let renderData = {
            
        };

        res.render("KIOSK/kioskMain.ejs", renderData); 
    });

    app.get("/KIOSK/kioskList", (req, res)=>{ 
        let kioskTable = req.session.kioskTable;
        let orderTable = req.session.orderTable;
        let allTotal = 0;

        for(let i = 0; i < orderTable.length; i++){
            allTotal += orderTable[i].orderTotal;
        }
        let renderData = {
            "kioskTable" : kioskTable,
            "orderTable" : orderTable,
            "allTotal" : allTotal
        };

        res.render("KIOSK/kioskList.ejs", renderData); 
    });

    app.get("/KIOSK/kioskItemInfo", (req, res)=>{ 
        let index = req.query.index;
        index = Number(index);
        let kioskTable = req.session.kioskTable;
        console.log(kioskTable);
        let renderData = {
            "kioskTable" : kioskTable,
            "index" : index,
        };

        res.render("KIOSK/kioskItemInfo.ejs", renderData); 
    });

    app.get("/KIOSK/kioskOrderPro", (req, res)=>{ 
        let kioskTable = req.session.kioskTable;
        let orderTable = req.session.orderTable;

        let index = req.query.index;
        index = Number(index);
        console.log(index);
        let orderCount = req.query.orderCount;
        orderCount= Number(orderCount);
        let count = kioskTable[index].kioskCount;
        let isSuccess = false;


        if(count >= orderCount){
            kioskTable[index].kioskCount -= orderCount;
            isSuccess = true;
            let price = kioskTable[index].kioskPrice;
            let total = orderCount * price;
            let order = {
                "orderName" : kioskTable[index].kioskName, 
                "orderPrice"  : price,
                "orderCount" : orderCount, 
                "orderTotal" : total,
            }
            orderTable.push(order);
            console.log(orderTable);

            req.session.kioskTable = kioskTable;
            req.session.orderTable = orderTable;
        }else{
            isSuccess = false;
        }
  
        let renderData = {
            "isSuccess" : isSuccess
        };

        res.render("KIOSK/kioskOrderPro.ejs", renderData); 
    });

   

    app.get("/KIOSK/kioskAdminItemForm", (req, res)=>{ 

        res.render("KIOSK/kioskAdminItemForm.ejs"); 
    });

    app.get("/KIOSK/kioskAdminItemPro", (req, res)=>{ 
        let kioskTable = req.session.kioskTable;
        req.session.kioskLastNumber += 1;

        let itemName = req.query.itemName;
        let itemPrice= req.query.itemPrice;
        let itemCount = req.query.itemCount;

        let item = {
                "kioskNumber" : req.session.kioskLastNumber , 
                "kioskName" : itemName , 
                "kioskPrice" : itemPrice , 
                "kioskCount" : itemCount
            };
        kioskTable.push(item);

        res.redirect("kioskList"); 
    });

};

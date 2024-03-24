function ValidateForm(){
	
	var ProId = document.getElementById("proId").value;
	var ProName = document.getElementById("proName").value;
	var ProPrice = document.getElementById("proPrice").value;
	var ProBrand = document.getElementById("proBrand").value;
	var ProMadeIn = document.getElementById("proMdin").value;
	var ProMFGDt = document.getElementById("proMdt").value;
	var ProEXPDt = document.getElementById("proExpdt").value;
	
	
	
	
	if(ProId.trim()===""||ProName.trim()===""||ProBrand.trim()===""||ProMadeIn.trim()===""||
	ProMFGDt.trim()===""||ProEXPDt.trim()===""){
		alert("All Spaces Must Be Filled");
		return false;
	}
	
	if(parseFloat(ProPrice)<0){
		alert("Product Price Can't be Negative");
		return flase;
	}
	if(ProName.length()>50 && ProBrand.length()>50){
		alert("The Product Name and Product Brand Length SHould Be Less Than 50");
		return false;
	}
	
	// Coverting the MFG Date And Expiry Date into Date Format 
	
	var MFGObj = new Date(ProMFGDt);
	var EXPObj = new Date(ProEXPDt);
	
	
	if(MFGObj>EXPObj){
		alert("The MFG Date Can't Be Greater Than EXP Date");
		return false;
	}
	
	return true;
	
	
		
	}
	

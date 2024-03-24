
  function validateForm()
    {
		  //read the form data
		  
		     var proId=document.getElementById("proId").value
		     var proName=document.getElementById("proNAme").value
		     var proPrice=document.getElementById("proPrice").value
		     var proBrand=document.getElementById("ProBrand").value
		     var proMadeIn=document.getElementById("MadeIn").value
		     
		       // check the vaidation result
		     
		      if(proId.trim()==="" ||proName.trim()===""||
		          proPrice.trim()===""||proBrand.trim()===""||
		          proMadeIn.trim()==="")
		          {
					  alert("all fields must be filled out ");
					  return false;
			
			
				  }
				  if(parseFloat(proPrice) < 0){
					  alert("Product price must be a non-negative value ");
					     return false;
			  
					  
				  }
				  
				   if(proName.length>50|| proBrand.length>50){
					     alert("Product name  name productBrand must be less than 50 charcters ");
					     return false;
					     }
					     // get the mfg and exp dates
					     
					     
					   var mfdate=document.getElementById("mfgdate").value
		               var exdate=document.getElementById("expdate").value
		                
		                // converting into date formate
		                   var manufacurteobj=new Date(mfdate);
		                    var expiryobject=new  Date(exdate);
		               
		                // check the validation of dates
		                  if(manufacurteobj> expiryobject){
							  alert("manufacturing date is not grater than expiry date");
							  return false;
							  
						  }
		              
					     return true;

					       	   
					   
		}		   
				   
				   
				   
				  
				 
		 
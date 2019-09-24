//function to show user successful inputed the correct name and password
function loginEvent() {
		  try{
			  
			  if(document.getElementById("username").value == "leigh" && document.getElementById("password").value == "pass" )
			  {
				  alert("You logged in");
			  }
		  }
		  catch(error)
		  {
			  alert("ERROR");
		  }
		}

//function to display message explaining my its not helping with password
function placeholder() {
	alert("Placeholder feature try later");
	}
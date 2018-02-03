/**
 * @author: Akash Mistry
 */

function getSignUpPage() {
	console.log("in getSignUpPage methd")
	 window.location.href = "http://localhost:9090/Banking/signup";
}
//success prompt window
function mysuccessalert() {
    alert("Successfully Done");
}

//successfully-registration
function getLoginPage(){
	console.log("in registration");
	window.location.href = "http://localhost:9090/Banking/";
}

function getPassbookByAccount(){
	var name = document.getElementById("transactionAcountNumber").value;
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	     document.getElementById("trasactionSummary").innerHTML = this.responseText;
	    }
	  };
	  xhttp.open("GET", "transactionDetails?accNumber=" + name, true);
	  xhttp.send();
}

$(document).ready(function(){
	console.log("Ready")
    $('#transactionSummary').DataTable();
});
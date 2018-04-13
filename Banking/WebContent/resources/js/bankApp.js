/**
 * @author: Akash Mistry
 */

function getSignUpPage() {
	console.log("in getSignUpPage methd")
	 window.location.href = "http://localhost:9090/Banking/signup";
}

function getSuccessfullwindow() {
	console.log("in getSuccessfullwindow methd")
	 window.location.href = "http://localhost:9090/Banking/succ_registration";
}
//success prompt window
function mysuccessalert() {
    alert("Request Processed");
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
    $('#transactionSummary').DataTable();
});

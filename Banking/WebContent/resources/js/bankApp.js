/**
 * @author: Akash Mistry
 */
function opentab(evt, Detials) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(Detials).style.display = "block";
    evt.currentTarget.className += " active";
}

function getSignUpPage() {
	console.log("in getSignUpPage methd")
	 window.location.href = "http://localhost:9090/Banking/signup";
}

function on() {
    document.getElementById("overlay").style.display = "block";
}

function off() {
    document.getElementById("overlay").style.display = "none";
}

//success prompt window
function mysuccessalert() {
    alert("Successfully Done");
}
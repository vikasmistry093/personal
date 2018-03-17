$(document).ready(function() {
    $('#userTable').dataTable();
} );

function getModal(id, type) {
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("modal-content").innerHTML = this.responseText;
      }
    };
    xhttp.open("GET", "/assignProduct?id=" + id + "&type=" + type, true);
    xhttp.send();
}

// Buy Product
$(document).ready(function() {
	$('.demo').bootpag({
		total : 5
	}).on("page", function(event, num) {
		$(".product-section").html("Page " + num); // or some ajax content loading...

		// ... after content load -> change total to 10
		$(this).bootpag({
			total : 10,
			maxVisible : 10
		});

	});
});

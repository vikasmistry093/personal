/**
 * 
 */
$(document).ready(function() {
    $('#userTable').dataTable();
} );

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

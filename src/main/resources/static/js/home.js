function order(item_id, amount) {
	var contact_email = document.getElementById("contact_email").value;
	var contact_name = document.getElementById("contact_name").value;
	var contact_mobile = document.getElementById("contact_mobile").value;

	sendPost("/order", {
		"item_id": item_id
		, "amount": amount
		, "contact_email": contact_email
		, "contact_name": contact_name
		, "contact_mobile": contact_mobile
	});
}
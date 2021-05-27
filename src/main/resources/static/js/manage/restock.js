function registRestock() {
	$("#restock_form").attr({
		action: "/manage/restock/add",
		method: "POST"
	});
	$("#restock_form").submit();
}

function deleteRestock(id) {
	sendPost("/manage/restock/delete", {"id": id});
}



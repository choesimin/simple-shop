function registItem() {
	$("#item_form").attr({
		action: "/manage/item/add",
		method: "POST"
	});
	$("#item_form").submit();
}

function updateItem(id, stock) {
	sendPost("/manage/item/update", {"id": id, "stock": stock});
}

function deleteItem(id) {
	sendPost("/manage/item/delete", {"id": id});
}


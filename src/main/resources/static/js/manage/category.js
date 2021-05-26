function registCategory() {
	$("#category_form").attr({
		action: "/manage/category/add",
		method: "POST"
	});
	$("#category_form").submit();
}

function deleteCategory(id) {
	sendPost("/manage/category/delete", {"id": id});
}


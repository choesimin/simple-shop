function registCategory() {
	$("#category_form").attr({
		action: "/manage/category/add",
		method: "POST"
	});
	$("#category_form").submit();
}

function deleteCategory(category_id) {
	sendPost("/manage/category/delete", "category_id", category_id);
}

function sendPost(action, name, param) {
	var form = document.createElement("form");
	form.setAttribute("action", action);
	form.setAttribute("method", "post");

	var input_hidden = document.createElement("input");
	input_hidden.setAttribute("type", "hidden");
	input_hidden.setAttribute("name", name);
	input_hidden.setAttribute("value", param);
	form.appendChild(input_hidden);

	document.body.appendChild(form);
	form.submit();
}

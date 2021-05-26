function sendPost(action, params) {
	var form = document.createElement("form");
	form.setAttribute("action", action);
	form.setAttribute("method", "post");
	
	for (var key in params) {
		var input_hidden = document.createElement("input");
		input_hidden.setAttribute("type", "hidden");
		input_hidden.setAttribute("name", key);
		input_hidden.setAttribute("value", params[key]);
		form.appendChild(input_hidden);
    }

	document.body.appendChild(form);
	form.submit();
}

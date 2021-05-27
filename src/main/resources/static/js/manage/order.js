function deleteOrder(id) {
	sendPost("/manage/order/delete", {"id": id});
}



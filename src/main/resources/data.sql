insert into category(name) values('food');
insert into category(name) values('clothes');

insert into item(category_id, name, stock) values(1, '떡볶이', 100);
insert into item(category_id, name, stock) values(2, 'A청바지', 100);

insert into orders(item_id, amount, contact_email, contact_name, contact_mobile) values(1, 30, 'test01@test.com', '홍길동', '01012345678');
insert into orders(item_id, amount, contact_email, contact_name, contact_mobile) values(2, 20, 'test02@test.com', '아무개', '01087654321');

insert into restock(item_id, company_name, encrypt_item_name, amount) values(1, 'amadon', '떡볶이123', 10);
insert into restock(item_id, company_name, encrypt_item_name, amount) values(2, 'coumang', 'A청바지123', 20);

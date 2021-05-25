drop table if exists category;
drop table if exists item;
drop table if exists orders;
drop table if exists restock;

create table category (
 category_id identity primary key
 , name varchar(255) not null
);

create table item (
 item_id identity primary key
 , category_id int
 , name varchar(255) not null
 , stock int default 0
 , foreign key (category_id) references category(category_id) on delete cascade
);

create table orders (
 order_id identity primary key
 , item_id int
 , email varchar(255) not null
 , name varchar(255) not null
 , mobile varchar(255) not null
 , foreign key (item_id) references item(item_id) on delete cascade
);

create table restock (
 restock_id identity primary key
 , item_id int
 , company varchar(255) not null
 , encrypt_name varchar(255) not null
 , amount int not null
 , foreign key (item_id) references item(item_id) on delete cascade
);
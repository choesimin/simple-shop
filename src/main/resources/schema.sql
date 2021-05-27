drop table if exists category;
drop table if exists item;
drop table if exists orders;
drop table if exists restock;

create table category (
 id identity primary key
 , name varchar(255) not null
);

create table item (
 id identity primary key
 , category_id int not null
 , name varchar(255) not null
 , stock int default 0 not null
 , foreign key (category_id) references category(id) on delete cascade
);

create table orders (
 id identity primary key
 , item_id int not null
 , amount int not null
 , contact_email varchar(255) not null
 , contact_name varchar(255) not null
 , contact_mobile varchar(255) not null
 , foreign key (item_id) references item(id) on delete cascade
);

create table restock (
 id identity primary key
 , item_id int not null
 , company_name varchar(255) not null
 , encrypt_item_name varchar(255) not null
 , amount int not null
 , foreign key (item_id) references item(id) on delete cascade
);

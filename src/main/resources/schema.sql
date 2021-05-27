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
 , item_name varchar(255) not null
 , email varchar(255) not null
 , name varchar(255) not null
 , mobile varchar(255) not null
);

create table restock (
 id identity primary key
 , company varchar(255) not null
 , item_name varchar(255) not null
 , encrypt_item_name varchar(255) not null
 , amount int not null
);
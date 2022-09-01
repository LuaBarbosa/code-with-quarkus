create sequence hibernate_sequence start with 1 increment by 1;

create table users (id bigint not null, city varchar(255), age integer not null, name varchar(255), primary key (id));

insert into users (id, city, age, name) values (1, 'Salvador', 24,'Maria Luiza Mota');
insert into users (id, city, age, name) values (2, 'São Paulo', 30,'João Souza');


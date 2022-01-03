-- Table Creation Script

create table people (
id integer not null primary key,
first_name varchar(20) not null,
last_name varchar(20) not null,
age integer not null
);

-- Table Creation Script

/

-- Data

insert into people (id, first_name, last_name, age) values (1, 'Vlad', 'Boyarskiy', 21);
insert into people (id, first_name, last_name, age) values (2,'Oksi', ' Bahatskaya', 30);
insert into people (id, first_name, last_name, age) values (3,'Vadim', ' Vadimich', 32);

-- Data

/
select * from people;

create database ustDB;
show databases;
use ustDB;
create table ust_table(id int not null primary key,name varchar(20),state varchar(30),age int);
show tables;
desc ust_table;
insert into ust_table values(1,"Prince","Kerala",24),(2,"Amal","Punjab",28),(3,"Don","Mumbai",26);
select * from ust_table;
update ust_table set age=25 where id=1;
select name, if(id>2,"Good","Bad") as remarks from ust_table;
create table table2(id int not null primary key, dpt_name varchar(30), city varchar(30));
alter table table2 change column dpt_name dept_name varchar(30);
insert into table2 values(1,"Computer Science","Kochi"),(2,"Civil","Chennai"),(3,"Electrical","Coimbatore");
insert into table2 values(4,"Mechanical","Kochi");
select name,dept_name,city,state from ust_table join table2 on ust_table.id = table2.id;
select count(id) from ust_table;
select city,count(*) from table2 group by city;
select * from table2 order by city asc;
select * from table2 group by city;
select count(*) from table2;
select * from table2;
select dept_name,count(city) from table2 group by city having count(city)<2;

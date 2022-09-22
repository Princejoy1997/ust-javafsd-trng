create database org;
show databases;
use org;

create table worker(
    worker_id int primary key auto_increment,
    first_name varchar(30) not null,
    last_name varchar(25) not null,
    salary int not null,
    joining_date datetime not null,
    department varchar(20) not null);
    
insert into worker values(1,"Monika", "Arora", 100000, "2014-02-20 9:00:00", "HR"),
(2,"Niharika", "Verma", 80000, "2014-06-11 9:00:00", "Admin"),
(3,"Vishal", "Singhal", 300000, "2014-02-20 9:00:00", "HR"),
(4,"Amitabh", "Signh", 500000, "2014-02-20 9:00:00", "Admin"),
(5,"Vivek", "Bhati", 500000, "2014-06-11 9:00:00", "Admin"),
(6,"Vipul", "Diwan", 200000, "2014-06-11 9:00:00", "Account"),
(7,'Satish', 'Kumar', 75000, '2014-1-20 9:00:00', 'Account'),
(8,'Geetika', 'Chauhan', 90000, '2014-04-11 9:00:00', 'Admin');

create table bonus(
    worker_ref_id int references worker(worker_id),
    bonus_date datetime not null,
    bonus_amount int);
insert into bonus values(1, '2016-02-20', 5000);
insert into bonus values(2, '2016-06-11', 3000),
    (3, '2016-02-20', 4000),
    (1, '2016-02-20', 4500),
    (2, '2016-06-11', 3500);
    
create table title(worker_ref_id int references worker(worker_id),
    worker_title varchar(25),
    affected_from datetime);
insert into title values(1, 'Manager', '2016-02-20'),
    (2, 'Executive', '2016-06-11'),
    (8, 'Executive', '2016-06-11'),
    (5, 'Manager', '2016-06-11'),
    (4, 'Asst. Manager', '2016-06-11'),
    (7, 'Executive', '2016-06-11'),
    (6, 'Lead', '2016-06-11'),
    (3, 'Lead', '2016-06-11');

#Question 1
select first_name as WORKER_NAME from worker;
#Question 2
select upper(first_name) as WORKER_NAME_UPPER from worker;
#Question 3
select distinct department from worker;
#Question 4
select left(first_name,3) as First_name from worker;
#Question 5
select instr(first_name,'a') from worker;
#Question 6
select rtrim(first_name) from worker;
#Question 7
select ltrim(department) from worker;
#Question 8
select count(distinct department) from worker;
#Question 9
select replace(first_name,'a','A') from worker;
#Question 10
select concat(first_name,' ',last_name) as COMPLETE_NAME from worker;
#Question 11
select * from worker order by first_name asc;
#Question 12
select * from worker order by first_name asc, department desc;
#Question 13
select * from worker where first_name = "Vipul" or first_name = "Satish";
#Question 14
select * from worker where first_name != "Vipul" and first_name != "Satish";
#Question 15
select * from worker where department = "Admin";
#Question 16
select * from worker where first_name like '%a%';
#Question 17
select * from worker where first_name like '%a';
#Question 18
select * from worker where first_name like '_____h';
#Question 19
select * from worker where salary between 100000 and 500000;
#Question 20
select * from worker where year(joining_date)='2014' and month(joining_date)='02';
#Question 21
select count(*) from worker where department = 'Admin';
#Question 22
select first_name,last_name from worker where salary>=50000 and salary<=100000;
#Question 23
select department, count(worker_id) as no_of_worker from worker group by department order by department desc;
#Question 24
select * from worker where worker_id in (select worker_ref_id from title where worker_title = 'Manager');
#Question 25
select a.* from worker a where worker_id != (select max(worker_id) from worker b where b.department = a.department);
#Question 26
select * from worker where mod(worker_id,2) = 1;
#Question 27
select * from worker where mod(worker_id,2) = 0;
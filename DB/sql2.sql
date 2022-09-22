use ustDB;
create table employee(emp_id int not null primary key, manager_id int,
first_name varchar(50),last_name varchar(50),emp_title varchar(50),salary varchar(50),
joining_date varchar(50),dep varchar(50));
desc employee;
insert into employee values(1,null,"Monika","Arora",'Manager',100000,'02/20/14 9:00','HR');
insert into employee values(2,1,'Niharika','Verma','Executive',80000,'06/11/14 9:00','Admin'),
(3,1,'Vishal','Singhal','Executive',300000,'02/20/14 9:00','HR'),
(4,null,'Amitabh','Singh','Manager',500000,'02/20/14 9:00','Admin'),
(5,4,'Vivek','Bhati','Asst.Manager',500000,'06/11/14 9:00','Admin'),
(6,5,'Vipul','Diwan','Executive',200000,'06/11/14 9:00','Account'),
(7,4,'Satish','Kumar','Lead',75000,'01/20/14 9:00','Account'),
(8,4,'Geetika','Chauhan','Lead',90000,'04/11/14 9:00','Admin');
select first_name,last_name from employee where employee.salary>=50000 and employee.salary<=100000;
select e.first_name as employee_name,m.first_name as manager_name from employee e join employee m on (e.manager_id = m.emp_id);
select dep,count(emp_id) as No_of_Employees from employee group by dep order by No_of_Employees desc;
select * from(select row_number() over (order by salary desc) as rownumber,salary from employee) as foo where rownumber = 5;
select FIRST_NAME from Employee where MANAGER_ID is null;
select count(EMP_ID) from Employee group by JOINING_DATE>01/01/15 and JOINING_DATE<31/12/15;
select * from Employee;

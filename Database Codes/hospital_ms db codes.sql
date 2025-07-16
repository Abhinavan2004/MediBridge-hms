create database hospital_ms ;
use hospital_ms ;

/* USER ACCOUNT CREATION TABLE*/ 
create table user_account(id int AUTO_INCREMENT PRIMARY KEY, 
                          name varchar(30),
						  email varchar(30),
                          contact varchar(10),
                          password varchar(30)); 
         
select * from user_account ;


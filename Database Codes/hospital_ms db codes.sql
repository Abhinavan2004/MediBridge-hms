create database hospital_ms ;
use hospital_ms ;

/* USER ACCOUNT CREATION TABLE*/ 
create table user_account(id int AUTO_INCREMENT PRIMARY KEY, 
                          name varchar(30),
						  email varchar(30),
                          contact varchar(10),
                          password varchar(30)); 

ALTER TABLE user_account 
MODIFY id INT AUTO_INCREMENT PRIMARY KEY;

create table Doctor_record(id int auto_increment primary key ,
                               doc_name varchar(30),
                               doc_dob varchar(15),
                               doc_quali varchar(20),
                               doc_spec varchar(20),
                               doc_email varchar(20),
                               contact_no varchar(10)
                               );
                         
create table specialist_record(id int auto_increment primary key ,
                               spec_name varchar(30),
                               category varchar(30),
                               contact_no varchar(10));
Select * from specialist_record ;

Select * from Doctor_record ;
         
select * from user_account ;


--Do create schema named => bank_schema

-- creating 1)employeedetails table
create table employeedetails(empusername varchar primary key,emppassword varchar not null , empname varchar not null);
insert into employeedetails (empusername,emppassword,empname) values('syed123','123','Syed');
-- creating 2) custlogindetails table
create table custlogindetails(name varchar not null,email varchar not null,username varchar primary key,password varchar not null);

-- creating 3) customer_personal_info table
create table customer_personal_info(custusername varchar primary key, custfname varchar not null, custlname varchar not null, custgender varchar not null,
custdob varchar not null,
custmobileno int8(10) not null unique,
custpan varchar not null unique,
custcity varchar not null,
custstate varchar not null,
openingbalance float4 not null);
 -- creating 4) custacctdetails
create table custacctdetails(custfname varchar not null,
custusername varchar primary key,
openingbalance float4 not null,
acctcreatdate date default CURRENT_DATE);

-- creating 5) custtransaction
create table custtransaction(tid bigserial primary key,
ttype varchar not null,
openingbalance float4,
tamount float4,
tdate date default CURRENT_DATE,
closingbalance float4,
custusername varchar not null,
foreign key (custusername) references custacctdetails(custusername));


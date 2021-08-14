# Revatute Project  0
## Syed's Banking Management App
Syed's Banking Management App is an Console Based Java Application Which allows Users to Open an account, Transfer funds to Different Accounts, Deposit Amount, Withdraw Amount and also provide facility to view previous transactions.

<h3>Technologies & Tools Used <h3>
  1. Java <br>
  2. JDBC <br>
  3. MAVEN <br>
  4. JUNIT <br>
  5. POSTGRESQL <br>
  6. SPRING BOOT as an IDE <br>
  7. DBEAVER
  
  # Installation
  1. Clone the git repository
  ```
  https://github.com/fsuleman2/revature-project0.git
  
  ```
  2. Extract the .zip file and Open it in  Spring Boot
  3. Build the Maven
  4. Go to com.app.dbutil => PostgresConnection.java => set your own credentials
  5. Run the below Queries in your DBEAVER
  ```sql
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

```
 
 6. After Succesfully creation of schema and running the quries.
 7. Go to the Project
    => open com.bank.main
    => open BankMain.java
 8. Just run the BankMain.java and your are good to Go!!! :)
  
  
 ## Over all View of Syed's Bank App
  <img src="https://github.com/fsuleman2/project0/blob/master/SYEDS_BANK_APP.png" width=800px height=400px><br>
  
  
  
# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
For those who would like to discuss further development, my email is
```
sydsulmn7@gmail.com
```
Also i am aware that the application is yet to be properly optimized. I will update the application soon along with all the appropiate features that i want to integrate in the application in future.

  # License
[MIT](https://choosealicense.com/licenses/mit/)

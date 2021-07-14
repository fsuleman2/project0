package com.bank.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.service.BankCrudService;
import com.bank.service.BankLoginService;
import com.bank.service.impl.BankCrudServiceImpl;
import com.bank.service.impl.BankLoginServiceImpl;

public class BankMain {
private static Logger log = Logger.getLogger(BankMain.class);
	public static void main(String[] args) throws BusinessException {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("Welcome to BankApp V1.0");
			log.info("==================================");
			log.info("\nBank Menu");
			log.info("1)Login");
			log.info("2)Register as a Customer");
			log.info("3)EXIT");
			log.info("\nEnter your Choice 1-3");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch(ch) {
			case 1: log.info("\n1)Login as Employee");
					log.info("\n2)Login as Customer");
					log.info("\nEnter your Choice 1-2");
					int ch1=0;
					do {
						try {
							ch1 = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {
						}
						switch(ch1) {
						case 1: Bank bank = null;
								BankLoginService bankLoginService=null;
							   log.info("\nWelcome to Employee Login Screen");
							   log.info("\nEnter Username:");
							   String empUsername = sc.nextLine();
							   log.info("\nEnter Password:");
							   String empPassword = sc.nextLine();
							   bank = new Bank(empUsername,empPassword);
							   try {
								   bankLoginService = new BankLoginServiceImpl();
								   bank =bankLoginService.employeeLogin(bank);
								   if(bank.getEmpUsername().equals(empUsername) && bank.getEmpPassword().equals(empPassword)){
										log.info("Employee Login Successfully");
										  int ch2=0;
										   do {
											   log.info("\nWelcome "+empUsername+"\n");
												log.info("\n1)Open Account");
												log.info("\n2)Approve or Reject an Account");
												log.info("\n3)View Customer Account Details");
												log.info("\n4)View Transaction of Customers");
												log.info("\n5)Logout");
												log.info("\nEnter Your Choice 1-5");
												try {
													ch2 = Integer.parseInt(sc.nextLine());
												} catch (NumberFormatException e) {
												}
												switch(ch2) {
												case 1: BankCrudService bankCrudService = new BankCrudServiceImpl();
														log.info("Enter Your Username");
														String userName = sc.nextLine();
														log.info("Enter Your First Name");
														String fName = sc.nextLine();
														log.info("Enter Your Last Name");
														String lName = sc.nextLine();
														log.info("Enter Your Gender");
														String gender = sc.nextLine();
														log.info("Enter Your Date of Birth in (yyy-mm-dd)");
														String dob = sc.nextLine();
														log.info("Enter Your Mobile Number(10-Digits)");
														long mobileno = Long.parseLong(sc.nextLine());
														log.info("Enter your Occupation");
														String panNumber = sc.nextLine();
														log.info("Enter Your City");
														String city = sc.nextLine();
														log.info("Enter Your State");
														String state = sc.nextLine(); 
														log.info("Set Initial Amount(Min 500)");
														float initialAmount = Float.parseFloat(sc.nextLine());
														bank = new Bank(userName,fName,lName,gender,dob,mobileno,panNumber,city,state,initialAmount);
														try {
															bankCrudService.openCustomerAccount(bank);
															log.info("\nBank Account Created Successfully...");
														} catch (BusinessException e) {
															log.warn(e.getMessage());
															throw new BusinessException("Bank Account not Creation Failed!!");
														};
													break;
												case 2:
													break;
												case 3: log.info("Enter Customer Username");
														log.info("Display data here ");
													break;
												case 4:	log.info("Enter Customer Username");
														log.info("Display data here ");
													break;
												case 5: 
													log.info("\nLogout Successfully............\n");
													log.info("\nGoing to Main Menu............");
													break;
												}
										   }while(ch2!=5);
									}
									else {
										log.info("Invalid Details");
									}
							   }catch (BusinessException e) {
									log.warn(e.getMessage());
									throw new BusinessException("Employee Login Failed!!!");
								};
							break;
						case 2: Customer customer = null;
								log.info("\nWelcome to Customer Login Screen");
								log.info("\n Enter Username:");
								String custUserName = sc.nextLine();
								log.info("\n Enter Password:");
								String custPassword = sc.nextLine();
								customer = new Customer(custUserName,custPassword);
								try {
									 bankLoginService = new BankLoginServiceImpl();
									  customer =bankLoginService.customerLogin(customer);
									  if(customer.getCustUserName().equals(custUserName) && customer.getCustPassword().equals(custPassword)){
										  log.info("Employee Login Successfully");
										  int ch3=0;
											do {
												log.info("Welcome "+custUserName);
												log.info("\n1)Open Account");
												log.info("\n2)Transfer Amount");
												log.info("\n3)Withdraw Amount");
												log.info("\n4)Deposit Amount");
												log.info("\n5)View statement");
												log.info("\n6)Logout");
												log.info("\nEnter Your Choice 1-6");
												try {
													ch3 = Integer.parseInt(sc.nextLine());
												} catch (NumberFormatException e) {
												}
												switch(ch3) {
												case 1:BankCrudService bankCrudService = new BankCrudServiceImpl();
												log.info("Enter Your Username");
												String userName = sc.nextLine();
												log.info("Enter Your First Name");
												String fName = sc.nextLine();
												log.info("Enter Your Last Name");
												String lName = sc.nextLine();
												log.info("Enter Your Gender");
												String gender = sc.nextLine();
												log.info("Enter Your Date of Birth in (yyy-mm-dd)");
												String dob = sc.nextLine();
												log.info("Enter Your Mobile Number(10-Digits)");
												long mobileno = Long.parseLong(sc.nextLine());
												log.info("Enter your PanCard Number");
												String panNumber = sc.nextLine();
												log.info("Enter Your City");
												String city = sc.nextLine();
												log.info("Enter Your State");
												String state = sc.nextLine(); 
												log.info("Set Initial Amount(Min 500)");
												float initialAmount = Float.parseFloat(sc.nextLine());
												bank = new Bank(userName,fName,lName,gender,dob,mobileno,panNumber,city,state,initialAmount);
												try {
													bankCrudService.openCustomerAccount(bank);
													log.info("\nBank Account Created Successfully...");
												} catch (BusinessException e) {
													log.warn(e.getMessage());
													throw new BusinessException("Bank Account not Creation Failed!!");
												};
														break;
												case 2:log.info("\nEnter Customer Username");
														String customerUsername = sc.nextLine(); 
														log.info("\nEnter Customer Mobile Number");
														double customerMobileNumber = Double.parseDouble(sc.nextLine());
														log.info("\nEnter the Amount to Transfer(min 500)");
														double amountTransfer = Double.parseDouble(sc.nextLine());
														log.info("\nAmount Transfered SuccessFully!!!"); //valid
														break;
												case 3: log.info("\nEnter the Amount to Withdraw(min 500)");
														double amountWithdraw = Double.parseDouble(sc.nextLine());
														log.info("\nAmount Withdrawed SuccessFully!!!"); //valid
														break;
												case 4: log.info("\nEnter the Amount to Deposit(min 500)");
														double amountDeposit = Double.parseDouble(sc.nextLine());
														log.info("\nAmount Deposited SuccessFully!!!"); //valid
														break;
												case 5: log.info("View Statement");
														break;
												case 6:
													log.info("\nLogout Successfully............");
													log.info("\nGoing to Main Menu............\n");
													break;
													
												}
											}while(ch3!=6);	
									  }
									  else {
											log.info("Invalid Details");
										}
								}catch(BusinessException e) {
									log.warn(e.getMessage());
									throw new BusinessException("Customer Login Failed!!!");
								};
								break;
								
						}
						break; //for employee logout
					}while(ch1!=2);
					break; //for customer logout
			case 2: BankCrudService bankCrudService =null;
						Bank bank = null;
						log.info("\nWelcome to Cutomer Login Page\n");
						log.info("\nEnter Your Name");
						String name = sc.nextLine();
						log.info("\nEnter Your Email");
						String email = sc.nextLine();
						log.info("\nEnter Your Username");
						String userName = sc.nextLine();
						log.info("\nEnter Your Password");
						String password = sc.nextLine();
						bank=new Bank(name,email,userName,password);
						bankCrudService = new BankCrudServiceImpl();
				try {
					bankCrudService.registerCustomer(bank);
					log.info("\n Bank Account Registered Successfully...\n");
				} catch (BusinessException e) {
					log.warn(e.getMessage());
					throw new BusinessException("Bank Account not Registered!!");
				};
					break;
			case 3:log.info("\nEnter Full name");
				   String fName = sc.nextLine();
				   log.info("\nEnter Your Username");
				   String uName = sc.nextLine();
					log.info("\nEnter Your Password");
					String passWord= sc.nextLine();
					log.info("\n Account Deleted Successfully....\n\n");
				break;
			case 4:
				log.info("Thanks for using our App.. See you soon. :)");
				break;
			default:
				log.warn("Invalid Choice... Please enter input between 1-4");
				break;
			}
		}while(ch!=3);
	}

}

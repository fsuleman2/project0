package com.bank.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class BankMain {
private static Logger log = Logger.getLogger(BankMain.class);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("Welcome to BankApp V1.0");
			log.info("==================================");
			log.info("\nBank Menu");
			log.info("1)Login");
			log.info("2)Register as a Customer");
			log.info("3)Close Account");
			log.info("4)EXIT");
			log.info("\nEnter your Choice 1-4");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch(ch) {
			case 1: log.info("\n1)Login as Employee");
					log.info("\n2)Login as Customer");
					log.info("Enter your Choice 1-2");
					int ch1=0;
					do {
						try {
							ch1 = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {
						}
						switch(ch1) {
						case 1:log.info("\nWelcome to Employee Login Screen");
							   log.info("\n Enter Username:");
							   String empUsername = sc.nextLine();
							   log.info("\n Enter Password:");
							   String empPassword = sc.nextLine();
							   log.info("Login Successfully");//if
							   int ch2=0;
							   do {
								   log.info("\nWelcome Employee\n");
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
									case 1: log.info("Enter Customer name");
											String name = sc.nextLine();
											log.info("Date of Birth");
											String dob = sc.nextLine();
											log.info("Enter address");
											String address = sc.nextLine();
											log.info("Enter Mobile Number");
											long mobilenumber = Long.parseLong(sc.nextLine());
											log.info("Set Starting Balance(min 500)");
											double balance = Double.parseDouble(sc.nextLine());
											log.info("Account Created Successfully");//valid
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
							break;
						case 2: log.info("\nWelcome to Customer Login Screen");
								log.info("\n Enter Username:");
								String username = sc.nextLine();
								log.info("\n Enter Password:");
								String password = sc.nextLine();
								log.info("Login Successfully");//if
								int ch3=0;
								do {
									log.info("Welcome Username");
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
									case 1: log.info("Enter Customer name");
											String name = sc.nextLine();
											log.info("Date of Birth");
											String dob = sc.nextLine();
											log.info("Enter address");
											String address = sc.nextLine();
											log.info("Enter Mobile Number");
											long mobilenumber = Long.parseLong(sc.nextLine());
											log.info("Set Starting Balance(min 500)");
											double balance = Double.parseDouble(sc.nextLine());
											log.info("Account Created Successfully");
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
						break; //for employee logout
					}while(ch1!=2);
					break; //for customer logout
			case 2: log.info("\nEnter Full name");
					String fullName = sc.nextLine();
					log.info("\nEnter Your Email");
					String email = sc.nextLine();
					log.info("\nEnter Your Username");
					String userName = sc.nextLine();
					log.info("\nEnter Your Password");
					String password = sc.nextLine();
					log.info("\n Registered Successfully...\n");
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
		}while(ch!=4);
	}

}

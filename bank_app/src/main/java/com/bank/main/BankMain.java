package com.bank.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.model.Transaction;
import com.bank.service.BankCrudService;
import com.bank.service.BankLoginService;
import com.bank.service.BankSearchService;
import com.bank.service.impl.BankCrudServiceImpl;
import com.bank.service.impl.BankLoginServiceImpl;
import com.bank.service.impl.BankSearchServiceImpl;

public class BankMain {
	private static Logger log = Logger.getLogger(BankMain.class);

	public static void main(String[] args) throws BusinessException {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("Welcome to Syed's Banking App");
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
			switch (ch) {
			case 1:
				log.info("\n1)Login as Employee");
				log.info("\n2)Login as Customer");
				log.info("\nEnter your Choice 1-2");
				int ch1 = 0;
				do {
					try {
						ch1 = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					}
					switch (ch1) {
					case 1:
						Bank bank = null;
						BankLoginService bankLoginService = null;
						log.info("\nWelcome to Employee Login Screen");
						log.info("==================================");
						log.info("\nEnter Username:");
						String empUsername = sc.nextLine();
						log.info("\nEnter Password:");
						String empPassword = sc.nextLine();
						bank = new Bank(empUsername, empPassword);
						try {
							bankLoginService = new BankLoginServiceImpl();
							bank = bankLoginService.employeeLogin(bank);
							if (bank.getEmpUsername().equals(empUsername)
									&& bank.getEmpPassword().equals(empPassword)) {
								log.info("Employee Login Successfully");
								int ch2 = 0;
								do {
									log.info("\nWelcome " + empUsername + "\n");
									log.info("\n1)Open Account");
									log.info("\n2)Approve or Reject an Account");
									log.info("\n3)View All Customer Personal Details");
									log.info("\n4)View Customer Account Details");
									log.info("\n5)View Transaction of Customers");
									log.info("\n6)Logout");
									log.info("\nEnter Your Choice 1-6");
									try {
										ch2 = Integer.parseInt(sc.nextLine());
									} catch (NumberFormatException e) {
									}
									switch (ch2) {
									case 1:
										BankCrudService bankCrudService = new BankCrudServiceImpl();
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
										String mobilenoString = sc.nextLine();
										long mobileno = Long.parseLong(mobilenoString);
										log.info("Enter your pan");
										String panNumber = sc.nextLine();
										log.info("Enter Your City");
										String city = sc.nextLine();
										log.info("Enter Your State");
										String state = sc.nextLine();
										log.info("Set Initial Amount(Min 500)");
										float initialAmount = Float.parseFloat(sc.nextLine());
										bank = new Bank(userName, fName, lName, gender, dob, mobileno, panNumber, city,
												state, initialAmount);
										try {
											bankCrudService.openCustomerAccount(bank);
											log.info("\nBank Account Created Successfully...");
										} catch (BusinessException e) {
											log.warn(e.getMessage());
											throw new BusinessException("Bank Account  Creation Failed!!");
										};
										break;
									case 2:
										break;
									case 3:
										BankCrudService bankCrudService2 = new BankCrudServiceImpl();
										try {
											List<Bank> bankList = bankCrudService2.getAllCustomerDetails();
											for(Bank b : bankList) {
												log.info(b);
											}
										}catch(BusinessException e) {log.error(e.getMessage());}

										break;
									case 4: 
									BankCrudService bankCrudService3 = new BankCrudServiceImpl();
									try {
										List<Account> accountList = bankCrudService3.getAllCustomerAccountDetails();
										for(Account a : accountList) {
											log.info(a);
										}
									}catch(BusinessException e) {log.error(e.getMessage());}
										break;
									case 5: BankCrudService bankCrudService4 = new BankCrudServiceImpl();
									try {
										List<Transaction> transactionList = bankCrudService4.getAllCustomerTransactionDetails();
										for(Transaction t : transactionList) {
											log.info(t);
										}
									}catch(BusinessException e) {log.error(e.getMessage());}
										break;
									case 6:
										log.info("\nLogout Successfully............\n");
										log.info("\nGoing to Main Menu............");
										break;
									default:
										log.warn("Invalid Choice... Please enter input between 1-5");
										break;
									}
									
								} while (ch2 != 6);
							} else {
								log.info("Invalid Details");
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
							throw new BusinessException("Employee Login Failed!!!");
						}
						;
						break;
					case 2:
						Customer customer = null;
						log.info("\nWelcome to Customer Login Screen");
						log.info("\n Enter Username:");
						String custUserName = sc.nextLine();
						log.info("\n Enter Password:");
						String custPassword = sc.nextLine();
//								System.out.println(custUserName);
//								System.out.println(custPassword);
						customer = new Customer(custUserName, custPassword);
						try {
							bankLoginService = new BankLoginServiceImpl();
							customer = bankLoginService.customerLogin(customer);
//									  System.out.println(customer.getCustUserName());
//									  System.out.println(customer.getCustUserName());
							if (customer.getCustUserName().equals(custUserName)
									&& customer.getCustPassword().equals(custPassword)) {
								log.info("Employee Customer Successfully\n");
								int ch3 = 0;
								do {
									log.info("Welcome " + custUserName);
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
									switch (ch3) {
									case 1:
										BankCrudService bankCrudService = new BankCrudServiceImpl();
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
										bank = new Bank(userName, fName, lName, gender, dob, mobileno, panNumber, city,
												state, initialAmount);
										try {
											bankCrudService.openCustomerAccount(bank);
											log.info("\nBank Account Created Successfully...");
										} catch (BusinessException e) {
											log.warn(e.getMessage());
											throw new BusinessException("Bank Account  Creation Failed!!");
										}
										;
										break;
									case 2:
										BankSearchService bankSearchServiceforTransfer = new BankSearchServiceImpl();
										BankCrudService bankCrudServiceforTransfer = new BankCrudServiceImpl();
										Transaction transaction = new Transaction();
										Account accountobj = new Account();
										String customerUserName = customer.getCustUserName();
										log.info("Hello "+customerUserName+"\n");
										log.info("Enter Creditor Username");
										String creditorUsername = sc.nextLine();
										log.info("Enter the Amount to Transfer");
										float transferAmount  = Float.parseFloat(sc.nextLine());
										accountobj =  bankSearchServiceforTransfer.getBalanceByUserName(customerUserName);
										
										float openingBalance9 = accountobj.getOpeningbalance();
										if(openingBalance9<transferAmount) {
											System.out.println("You have Insufficient Balance, Transfer Failed!!!");
										}
										else {
											String transType = "Withdraw";
											float closingBalance = Math.abs(openingBalance9 - transferAmount);
											transaction = new Transaction(transType, openingBalance9, transferAmount,
													closingBalance,customerUserName);
											transaction = bankCrudServiceforTransfer.withDrawAmount(transaction);
											log.info("\nAmount " + transferAmount
													+ " Successfully Withdrawed from your Account with UserName  = " + customerUserName);
											log.info(transaction);
											log.info("\n");
											accountobj = bankSearchServiceforTransfer.getBalanceByUserName(creditorUsername);
											float openingBalOfCreditor = accountobj.getOpeningbalance();
											String transTypeOfCreditor = "credited";
											float closingBalOfCreditor = Math.abs(transferAmount+openingBalOfCreditor);
											transaction = new Transaction(transTypeOfCreditor, openingBalOfCreditor, transferAmount,
													closingBalOfCreditor,creditorUsername);
											transaction = bankCrudServiceforTransfer.depositAmount(transaction);
											System.out.println(transaction);
											log.info("\nAmount " + transferAmount
													+ " Successfully Transfered from your Account to UserName  = " + creditorUsername);
											log.info("\n Amount Transfered SuccessFully!!!"); // valid
											System.out.println();
											
										}
									
										break;
									case 3:
										
										BankSearchService bankSearchService = new BankSearchServiceImpl();
										BankCrudService bankCrudService1 = new BankCrudServiceImpl();
										Transaction transactionforDepo = new Transaction();
										Account account = new Account();
										String depoUserName = customer.getCustUserName();
										log.info("Hello "+depoUserName+ " please Enter the Amount to Withdraw (min 500)\n");
										float amountWithdraw = Float.parseFloat(sc.nextLine());
										account = bankSearchService.getBalanceByUserName(depoUserName);
										float openingBalance = account.getOpeningbalance();
										if(openingBalance<amountWithdraw) {
											log.info("You have Insufficient Balance, Transfer Failed!!!");
										}
										else if(amountWithdraw<500){log.info("Minimum Withdrawal Amount should be 500/-");}
										else {	
											
										String transType = "Withdraw";
										
										float closingBalance = Math.abs(openingBalance - amountWithdraw);
										transactionforDepo  = new Transaction(transType, openingBalance, amountWithdraw,
												closingBalance,depoUserName);
										transactionforDepo  = bankCrudService1.withDrawAmount(transactionforDepo );
										log.info("\nAmount " + amountWithdraw
												+ " Successfully Withdrawed from your Account with UserName  = " + depoUserName);
										log.info(transactionforDepo );
										log.info("\n");
										}//else block
									
										break;
									case 4:
										
										BankSearchService bankSearchService1 = new BankSearchServiceImpl();
										BankCrudService bankCrudService2 = new BankCrudServiceImpl();
										Transaction transaction1 = new Transaction();
										Account account6 = new Account();
										String customerUserName1 = customer.getCustUserName();
										log.info("Hello "+customerUserName1+ " please Enter the Amount to Deposit(min 500)\n");
										float amountDeposit1 = Float.parseFloat(sc.nextLine());
										account6 = bankSearchService1.getBalanceByUserName(customerUserName1);
										float openingBalance1 = account6.getOpeningbalance();
										if(amountDeposit1<500) {log.info("Minimum Amount to Deposit is 500/-");}
										else if(amountDeposit1>=100000) {log.info("Maximum limit to Deposit is One Lakh only");}
										else {
											String transType1 = "Deposit";
											float closingBalance1 = openingBalance1 + amountDeposit1;
											transaction = new Transaction(transType1, openingBalance1, amountDeposit1,
													closingBalance1,customerUserName1);
											transaction = bankCrudService2.depositAmount(transaction);
											log.info("\nAmount " + amountDeposit1
													+ " Successfully deposited into your Account with UserName  = " + customerUserName1);
											log.info(transaction);
											
										}
										
										break;
										
									case 5: BankCrudService bankCrudServiceforViewStatement = new BankCrudServiceImpl();
									try {
										List<Transaction> transactionList = bankCrudServiceforViewStatement.getCustomerTransactionByUserName(custUserName);
										for(Transaction t : transactionList) {
											log.info(t);
										}
									}catch(BusinessException e) {log.error(e.getMessage());}
										break;
									case 6:
										log.info("\nLogout Successfully............");
										log.info("\nGoing to Main Menu............\n");
										break;
									default:
										log.warn("Invalid Choice... Please enter input between 1-6");
										break;
									}
								} while (ch3 != 6);
							} else {
								log.info("Invalid Details..");
							}
						} catch (BusinessException e) {
							log.info(e.getMessage());
							throw new BusinessException("Customer Login Failed!!!");
						}
						;
						break;

					}
					break; // for employee logout
				} while (ch1 != 2);
				break; // for customer logout
			case 2:
				BankCrudService bankCrudService = null;
				Bank bank = null;
				log.info("\nWelcome to Cutomer Registration Page\n");
				log.info("\nEnter Your Name");
				String name = sc.nextLine();
				log.info("\nEnter Your Email");
				String email = sc.nextLine();
				log.info("\nEnter Your Username");
				String userName = sc.nextLine();
				log.info("\nEnter Your Password");
				String password = sc.nextLine();
				bank = new Bank(name, email, userName, password);
				bankCrudService = new BankCrudServiceImpl();
				try {
					bankCrudService.registerCustomer(bank);
					log.info("\n Bank Account Registered Successfully...\n");
				} catch (BusinessException e) {
					log.warn(e.getMessage());
					throw new BusinessException("Bank Account not Registered!!");
				};
				break;
			case 3:
				log.info("Thanks for using our App.. See you soon. :)");
				break;
			default:
				log.warn("Invalid Choice... Please enter input between 1-3");
				break;
			}
		} while (ch != 3);
	}

}

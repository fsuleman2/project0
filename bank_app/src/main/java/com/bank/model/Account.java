package com.bank.model;

import java.sql.Date;

public class Account {

private String custFname;
private String custUserName;
private float openingbalance;
private Date date;

@Override
public String toString() {
	return "Account [custFname = " + custFname + ", custUserName = " + custUserName + ", openingbalance = " + openingbalance
			+ ", Account Creation Date = " + date + "]";
}
public Account() {
	// TODO Auto-generated constructor stub
}
public Account(String custFname, String custUserName, float openingBalance) {
	super();
	this.custFname = custFname;
	this.custUserName = custUserName;
	this.openingbalance = openingBalance;
}

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getCustFname() {
	return custFname;
}
public float getOpeningbalance() {
	return openingbalance;
}
public void setOpeningbalance(float openingbalance) {
	this.openingbalance = openingbalance;
}
public void setCustFname(String custFname) {
	this.custFname = custFname;
}
public String getCustUserName() {
	return custUserName;
}
public void setCustUserName(String custUserName) {
	this.custUserName = custUserName;}
}


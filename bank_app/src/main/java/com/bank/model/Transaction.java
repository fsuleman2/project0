package com.bank.model;

import java.sql.Date;

public class Transaction {
private int tid;
private String ttype;
private float openingbalance;
private float tamount;
private Date tdate;
public Date getTdate() {
	return tdate;
}
public void setTdate(Date tdate) {
	this.tdate = tdate;
}
private float closingbalance;
private String custUserName;

public Transaction(int tid, String ttype, float openingbalance, float tamount, float closingbalance, String custUserName) {
	super();
	this.tid = tid;
	this.ttype = ttype;
	this.openingbalance = openingbalance;
	this.tamount = tamount;
	this.closingbalance = closingbalance;
	this.custUserName = custUserName;
}
public String getCustUserName() {
	return custUserName;
}
public void setCustUserName(String custUserName) {
	this.custUserName = custUserName;
}
public Transaction() {
	// TODO Auto-generated constructor stub
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTtype() {
	return ttype;
}
public void setTtype(String ttype) {
	this.ttype = ttype;
}
public float getOpeningbalance() {
	return openingbalance;
}
public void setOpeningbalance(float openingbalance) {
	this.openingbalance = openingbalance;
}
public float getTamount() {
	return tamount;
}
public void setTamount(float tamount) {
	this.tamount = tamount;
}
public float getClosingbalance() {
	return closingbalance;
}
public void setClosingbalance(float closingbalance) {
	this.closingbalance = closingbalance;
}
public Transaction(String ttype,float openingbalance,float tamount,float closingbalance,String custUserName) {
	this.ttype = ttype;
	this.tamount = tamount;
	this.closingbalance = closingbalance;
	this.openingbalance = openingbalance;
	this.custUserName = custUserName;
}
@Override
public String toString() {
	return "Transaction [Transaction Id = " + tid + ", Transaction Type = " + ttype + ", Opening Balance = " + openingbalance + ", Transfer Amount = "
			+ tamount + ", Transaction Date = " + tdate+", Closing Balance = " + closingbalance + ", Customer User Name = " + custUserName
			+ "]";
}

//", tdate=" + tdate+

}

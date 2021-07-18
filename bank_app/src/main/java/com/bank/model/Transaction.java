package com.bank.model;



public class Transaction {
private int tid;
private String ttype;
private float openingbalance;
private float tamount;

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(closingbalance);
	result = prime * result + ((custUserName == null) ? 0 : custUserName.hashCode());
	result = prime * result + Float.floatToIntBits(openingbalance);
	result = prime * result + Float.floatToIntBits(tamount);
	result = prime * result + ((tdate == null) ? 0 : tdate.hashCode());
	result = prime * result + tid;
	result = prime * result + ((ttype == null) ? 0 : ttype.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Transaction other = (Transaction) obj;
	if (Float.floatToIntBits(closingbalance) != Float.floatToIntBits(other.closingbalance))
		return false;
	if (custUserName == null) {
		if (other.custUserName != null)
			return false;
	} else if (!custUserName.equals(other.custUserName))
		return false;
	if (Float.floatToIntBits(openingbalance) != Float.floatToIntBits(other.openingbalance))
		return false;
	if (Float.floatToIntBits(tamount) != Float.floatToIntBits(other.tamount))
		return false;
	if (tdate == null) {
		if (other.tdate != null)
			return false;
	} else if (!tdate.equals(other.tdate))
		return false;
	if (tid != other.tid)
		return false;
	if (ttype == null) {
		if (other.ttype != null)
			return false;
	} else if (!ttype.equals(other.ttype))
		return false;
	return true;
}
private String tdate;




public String getTdate() {
	return tdate;
}
public void setTdate(String tdate) {
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
@Override
public String toString() {
	return "Transaction [tid=" + tid + ", ttype=" + ttype + ", openingbalance=" + openingbalance + ", tamount="
			+ tamount + ", tdate=" + tdate + ", closingbalance=" + closingbalance + ", custUserName=" + custUserName
			+ "]";
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


//", tdate=" + tdate+

}

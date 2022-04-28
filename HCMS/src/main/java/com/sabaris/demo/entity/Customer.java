package com.sabaris.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custid;
	private String custname;
	private String custmailid;
	private long phonenumb;
	private long aadhar;
	private String custpwsd;
	private int policyid;
	public Customer() {
		super();
	}
	public Customer(int custid, String custname, String custmailid, long phonenumb, long aadhar, String custpwsd,
			int policyid) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custmailid = custmailid;
		this.phonenumb = phonenumb;
		this.aadhar = aadhar;
		this.custpwsd = custpwsd;
		this.policyid = policyid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustmailid() {
		return custmailid;
	}
	public void setCustmailid(String custmailid) {
		this.custmailid = custmailid;
	}
	public long getPhonenumb() {
		return phonenumb;
	}
	public void setPhonenumb(long phonenumb) {
		this.phonenumb = phonenumb;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getCustpwsd() {
		return custpwsd;
	}
	public void setCustpwsd(String custpwsd) {
		this.custpwsd = custpwsd;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int integer) {
		this.policyid = integer;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custmailid=" + custmailid + ", phonenumb="
				+ phonenumb + ", aadhar=" + aadhar + ", custpwsd=" + custpwsd + ", policyid=" + policyid + "]";
	}
}
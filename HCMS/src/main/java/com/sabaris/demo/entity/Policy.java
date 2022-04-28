package com.sabaris.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyid;
	private String policyname;
	private String policytype;
	private int policytenure;
	public Policy() {
		super();
	}
	public Policy(int policyid, String policyname, String policytype, int policytenure) {
		super();
		this.policyid = policyid;
		this.policyname = policyname;
		this.policytype = policytype;
		this.policytenure = policytenure;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	public int getPolicytenure() {
		return policytenure;
	}
	public void setPolicytenure(int policytenure) {
		this.policytenure = policytenure;
	}
	@Override
	public String toString() {
		return "Policy [policyid=" + policyid + ", policyname=" + policyname + ", policytype=" + policytype
				+ ", policytenure=" + policytenure + "]";
	}
}
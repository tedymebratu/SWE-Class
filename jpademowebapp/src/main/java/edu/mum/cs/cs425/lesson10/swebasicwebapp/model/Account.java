package edu.mum.cs.cs425.lesson10.swebasicwebapp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ACCOUNTS database table.
 * 
 */
@Entity
@Table(name="ACCOUNTS")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountid;

	private String accountno;

	private String accountname;

	public Account() {
	}

	public int getAccountid() {
		return this.accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

}
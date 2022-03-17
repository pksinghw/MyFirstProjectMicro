package com.Microservices.Bank.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class AccountCtgry {
	@Id
	@Column(name = "acc_typeid")
	private String acc_typeid;
	@Column(name = "acc_name")
	private String acc_name;

	public String getAcc_typeid() {
		return acc_typeid;
	}

	public void setAcc_typeid(String acc_typeid) {
		this.acc_typeid = acc_typeid;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	@Override
	public String toString() {
		return "Acc_Category [acc_typeid=" + acc_typeid + ", acc_name=" + acc_name + "]";
	}

}

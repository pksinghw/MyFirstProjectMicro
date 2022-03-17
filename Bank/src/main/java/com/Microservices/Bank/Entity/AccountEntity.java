package com.Microservices.Bank.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class AccountEntity {

	@Id
	@Column(name = "accountNumber")
	private String accountNumber;
	@Column(name = "accountType")
	private String accountType;
	@Column(name = "customerId")
	private String customerId;
	@Column(name = "accountBalance")
	private String accountBalance;

	public AccountEntity() {

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customerId=" + customerId
				+ ", accountBalance=" + accountBalance + "]";
	}

}

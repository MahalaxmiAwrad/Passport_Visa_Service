package com.capg.Model;

import java.sql.Date;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PASSPORT_FEES")
public class Passportfees {
	

	@Id
	private String PASSPORT_NO;
	@NotNull(message = "Temporary number cannot be Empty  ")
	private String TEMPORARY_NO;
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private Date PAYMENT_DATE;
	@NotNull(message = "amount cannot be empty")
	private int AMOUNT;

	private String TYPE_OF_SERVICE;
	
	

	

	public Passportfees() {
		super();
	}

	public Passportfees(String string, int i, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public String getPASSPORT_NO() {
		return PASSPORT_NO;
	}

	public void setPASSPORT_NO(String pASSPORT_NO) {
		PASSPORT_NO = pASSPORT_NO;
	}

	public String getTEMPORARY_NO() {
		return TEMPORARY_NO;
	}

	public void setTEMPORARY_NO(String tEMPORARY_NO) {
		TEMPORARY_NO = tEMPORARY_NO;
	}

	public Date getPAYMENT_DATE() {
		return PAYMENT_DATE;
	}

	public void setPAYMENT_DATE(Date pAYMENT_DATE) {
		PAYMENT_DATE = pAYMENT_DATE;
	}

	public int getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getTYPE_OF_SERVICE() {
		return TYPE_OF_SERVICE;
	}

	public void setTYPE_OF_SERVICE(String tYPE_OF_SERVICE) {
		TYPE_OF_SERVICE = tYPE_OF_SERVICE;
	}

	@Override
	public String toString() {
		return "Passportfees [PASSPORT_NO=" + PASSPORT_NO + ", TEMPORARY_NO=" + TEMPORARY_NO + ", PAYMENT_DATE="
				+ PAYMENT_DATE + ", AMOUNT=" + AMOUNT + ", TYPE_OF_SERVICE=" + TYPE_OF_SERVICE + "]";
	}

}

	



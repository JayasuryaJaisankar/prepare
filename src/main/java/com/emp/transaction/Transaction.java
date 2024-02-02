package com.emp.transaction;

import com.emp.entity.Reciever;
import com.emp.entity.Sender;

public class Transaction {
	private Sender s;
	private Reciever r;
	public Sender getS() {
		return s;
	}
	public void setS(Sender s) {
		this.s = s;
	}
	public Reciever getR() {
		return r;
	}
	public void setR(Reciever r) {
		this.r = r;
	}

}

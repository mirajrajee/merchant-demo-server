package com.billdesk.evm.merchantdemoserver.model;

public class Payment {
	
	private String type;
	private Value value;
	
	public Payment() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Payment {type=" + type + ", value=" + value + "}";
	}

}

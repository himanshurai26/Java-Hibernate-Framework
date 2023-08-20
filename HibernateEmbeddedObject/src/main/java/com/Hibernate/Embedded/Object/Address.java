package com.Hibernate.Embedded.Object;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Address {
	@Column(name="pin_code")
	private int PinCode;
	@Column(name="street_name")
	private String street;
	@Column(name="city_name")
	private String city;
	@Column(name="state_name")
	private String State;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pinCode, String street, String city, String state) {
		super();
		PinCode = pinCode;
		this.street = street;
		this.city = city;
		State = state;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [PinCode=" + PinCode + ", street=" + street + ", city=" + city + ", State=" + State + "]";
	}
	
	
	
	
	
	

}

package com.cg;

import java.util.Random;

public class Account {
	private String account_Number;
	private String insured_Name;
	private String insured_Street;
	private String insured_City;
	private String insured_State;
	private int insured_Zip;
	private String Bus_Seg_Name;
	private String username;
	
	public Account() {
		super();
	}
	public Account(String account_Number,String insured_Name,String insured_Street,String insured_City,String insured_State,int insured_Zip,String Bus_Seg_Name,String username) {
		super();
		this.account_Number=account_Number;
		this.insured_Name=insured_Name;
		this.insured_Street=insured_Street;
		this.insured_City=insured_City;
		this.insured_State=insured_State;
		this.insured_Zip=insured_Zip;
		this.Bus_Seg_Name=Bus_Seg_Name;
		this.username=username;
	}
	public String getAccount_Number() {
		 Random rand = new Random();
		    String card = "123456";
		    for (int i = 0; i <4; i++)
		    {
		        int n = rand.nextInt(10) + 0;
		        card += Integer.toString(n);
		        System.out.print(card.charAt(i));
		    }
		    System.out.println(" account_Number :"+card);
		    return card;
	
	}
	
	public String getInsured_Name() {
		return insured_Name;
	}
	public void setInsured_Name(String insured_Name) {
		this.insured_Name = insured_Name;
	}
	public String getInsured_Street() {
		return insured_Street;
	}
	public void setInsured_Street(String insured_Street) {
		this.insured_Street = insured_Street;
	}
	public String getInsured_City() {
		return insured_City;
	}
	public void setInsured_City(String insured_City) {
		this.insured_City = insured_City;
	}
	public String getInsured_State() {
		return insured_State;
	}
	public void setInsured_State(String insured_State) {
		this.insured_State = insured_State;
	}
	public int getInsured_Zip() {
		return insured_Zip;
	}
	public void setInsured_Zip(int insured_Zip) {
		this.insured_Zip = insured_Zip;
	}
	public String getBus_Seg_Name() {
		return Bus_Seg_Name;
	}
	public void setBus_Seg_Name(String bus_Seg_Name) {
		Bus_Seg_Name = bus_Seg_Name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}

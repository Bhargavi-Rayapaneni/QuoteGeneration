package com.cg;

public class Policy {
	private String Pol_Number;
	private float Pol_Premium;
	private String account_Number;
	
	public Policy(){}
	public Policy(String pol_Number,float pol_Premium,String account_Number) {
		super();
		this.Pol_Number = pol_Number;
		this.Pol_Premium = pol_Premium;
		this.account_Number = account_Number;
	}
	public String getPol_Number() {
		return Pol_Number;
	}
	public float getPol_Premium() {
		return Pol_Premium;
	}
	
	public void setPol_Premium(float pol_Premium) {
		Pol_Premium = pol_Premium;
	}
	
	public void setPol_Number(String pol_Number) {
		Pol_Number = pol_Number;
	}
	
	
}

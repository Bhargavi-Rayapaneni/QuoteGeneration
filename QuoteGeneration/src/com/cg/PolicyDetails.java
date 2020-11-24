package com.cg;

public class PolicyDetails {
	private int Pol_Number;
	private String Pol_Ques_Id;
	private String Answer;
	public PolicyDetails() {}
	public PolicyDetails(int pol_Number, String pol_Ques_Id, String answer) {
		super();
		Pol_Number = pol_Number;
		Pol_Ques_Id = pol_Ques_Id;
		Answer = answer;
	}
	public int getPol_Number() {
		return Pol_Number;
	}
	public void setPol_Number(int pol_Number) {
		Pol_Number = pol_Number;
	}
	public String getPol_Ques_Id() {
		return Pol_Ques_Id;
	}
	public void setPol_Ques_Id(String pol_Ques_Id) {
		Pol_Ques_Id = pol_Ques_Id;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
}

package com.ibm.bug;

public class Manager extends Employee {
	
	 Acknowledge ack;
	 //STATUS stat;

	public Manager(String empName, String empId, String email, int number) {
		super(empName, empId, email, number);
		
	}
	public void acknowledgeReport(Acknowledge ack) {
		//System.out.println(Acknowledge.APPROVED);
		if(ack== Acknowledge.APPROVED) {
		System.out.println("Receievd and acknowledged ");}
		else
			System.out.println("Have to work more");
	}
	
	public void assignBug(STATUS stat) {
		if(stat == STATUS.NEW) {
			System.out.println("New Bug is found");
		}else if(stat == STATUS.ASSIGNED) {
			System.out.println("");
		}
	}
	public void mailstakeholders() {
		System.out.println("Mailed to stakeholders");
	}
}
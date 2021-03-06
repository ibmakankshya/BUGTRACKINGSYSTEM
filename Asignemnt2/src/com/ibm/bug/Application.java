package com.ibm.bug;

public class Application {

	public static void main(String[] args) {
		
		Bug bug1 = new Bug("B1", "BName", STATUS.NEW, BugType.FUNCTIONAL ,"Line140" , Priority.SEVERE);
		Developer d1 = new Developer("Radha", "89157393", "radheradhe@gmail.com", 998456123);
		Tester t1 = new Tester("Akshay", "huyagh", "akshya@gmail.com", 998765431);
		Manager m1 = new Manager("Zara", "uiyth56", "zarastoes@smail.com", 999999);
		Project p1 = new Project(d1.getdevName1(), d1.getdevID1(), t1.gettName1(), t1.gettID1(), ProjectType.FINANCE, bug1, m1 );
		t1.setLogVersion(15);
		t1.log();
		d1.setBugStatus(BugDevStatus.FIXED);
		m1.acknowledgeReport(true);
		
		
		
	}

}

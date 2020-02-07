package com.Class25;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Create an object of Employee Class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax"; //static
		emp.work();
		emp.getPaid();
		
		System.out.println("Create object of Scrum Team Class");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, Burndown Chart";
		sm.ceremonies="Sprint Demo,Planning, Retro, Daily standup";
		sm.attendScrumMeetings();
		
		Developer dev=new Developer();
		System.out.println("Creat object of Developer Class");
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo,Planning, Retro, Daily standup";
		dev.attendScrumMeetings();
		dev.employeeId=101;
		//dev.emloyeeSsn private not accesible
		
		Tester test=new Tester();
		System.out.println("Create object of Tester Class");
		test.salary=115000;
		test.work();
		test.getPaid();
		test.Test(); //own features
		test.artifacts="Product Backlog, Sprint Backlog, Burndown Chart";
		test.ceremonies="Sprint Demo,Planning, Retro, Daily standup";
		test.attendScrumMeetings();
		
	}

}

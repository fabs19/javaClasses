package com.Class25_1;

import com.Class25.Employee;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
	
		WaterFallTeam team=new WaterFallTeam();
		team.companyName="Syntax";
		//accessing protected variable in diff package possible thru inheritance
		team.employeeId=102;


	}

}

package com.lab2.Foundationofprograming;

public class DriverClass {

public static void main(String[] args) {
	SuperDepartment superdptt = new SuperDepartment();	
		
		String superdpttname = superdptt.departmentName("Super Department.");
		System.out.println("Department Name-->" +" "+ superdpttname);
		
		
		String superdpttwork=superdptt.getTodaysWork("No Work as of now."); 
		System.out.println("Today's Work-->" +" "+ superdpttwork);

		
		String superdpttDLine=superdptt.getWorkDeadline("Nil."); 
		System.out.println("Work Dead Line-->" +" "+superdpttDLine);
	
		
		String superdpttHoliday=superdptt.isTodayAHoliday("Today is not a holiday."); 
		System.out.println("Holiday?-->" +" "+superdpttHoliday);
		
		System.out.println("_ _ _ _ _ _ _  _ _ _ _ _ _  _ _ _ _ _ ");
		
		
		
	AdminDepartment admindptt = new AdminDepartment();
		
		String admindpttname = admindptt.departmentName("Admin Department.");
		System.out.println("Department Name-->" +" "+ admindpttname );
		
		
		String admindpttwork = admindptt.getTodaysWork("Complete your documents Submission."); 
		System.out.println("Today's Work-->" +" "+ admindpttwork);

		
		String admindpttDLine=admindptt.getWorkDeadline(" Complete by EOD."); 
		System.out.println("Work Dead Line-->" +" "+admindpttDLine);
		
		System.out.println("_ _ _ _ _ _ _  _ _ _ _ _ _  _ _ _ _ _ ");
	
		
		
	HrDepartment hrdptt = new HrDepartment();
		
		String hrdttname = hrdptt.departmentName(" Hr Department.");
		System.out.println("Department Name-->" +" "+ hrdttname );
		
		
		String hrpttwork = hrdptt.getTodaysWork("Fill today’s timesheet and mark your attendance."); 
		System.out.println("Today's Work-->" +" "+ hrpttwork);

		
		String hrdpttDLine=hrdptt.getWorkDeadline(" Complete by EOD."); 
		System.out.println("Work Dead Line-->" +" "+hrdpttDLine);
		
		String hrdpttactivity=hrdptt.doActivity(" Team Lunch."); 
		System.out.println("Hr Activity-->" +" "+hrdpttactivity);
		
		System.out.println("_ _ _ _ _ _ _  _ _ _ _ _ _  _ _ _ _ _ ");
		
		
		
	TechDepartment techdptt = new TechDepartment();
		
		String techdpttname = techdptt.departmentName(" Tech Department.");
		System.out.println("Department Name-->" +" "+ techdpttname );
		
		
		String techdpttwork = techdptt.getTodaysWork("Complete coding of module 1."); 
		System.out.println("Today's Work-->" +" "+ techdpttwork);

		
		String techdpttDLine=techdptt.getWorkDeadline(" Complete by EOD."); 
		System.out.println("Work Dead Line-->" +" "+techdpttDLine);
		
		String techdpttinfo=techdptt.getTechStackInformation("core Java."); 
		System.out.println("Tech Stack Information-->" +" "+techdpttinfo);
		
		System.out.println("_ _ _ _ _ _ _  _ _ _ _ _ _  _ _ _ _ _ ");
	}
}

package Assignment;

import java.util.Scanner;

public class SalaryStructurs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary:");
		double s=sc.nextDouble();
		double hra,da,grosssalary;
		if(s<=10000) {
			hra=0.20*s;
			da=0.80*s;
		}else if(s<=20000) {
			hra=0.25*s;
			da=0.90*s;
		}else {
			hra=0.30*s;
			da=0.95*s;
		}
		grosssalary=s+hra+da;
		
		System.out.println("The Gross Salary of the employee:"+grosssalary);
		sc.close();
	}

}

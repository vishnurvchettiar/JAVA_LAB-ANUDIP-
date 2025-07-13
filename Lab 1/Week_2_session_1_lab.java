package mypackage;
import java.util.*;

public class Week_2_session_1_lab {

	    	    public void SimpleInterest() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("----- Simple Interest Calculator -----");
	        System.out.print("Enter Principal Amount: ");
	        double principal = sc.nextDouble();

	        System.out.print("Enter Time (in years): ");
	        double time = sc.nextDouble();

	        double rate;

	        if (principal > 10000) {
	            rate = 10;
	        } else if (principal >= 5000) {
	            rate = 8;
	        } else {
	            rate = 5;
	        }

	        double interest = (principal * rate * time) / 100;

	        System.out.println("Interest Rate: " + rate + "%");
	        System.out.println("Simple Interest: Rs. " + interest);
	    }

	    
	    public void Grades() {
	        Scanner sc = new Scanner(System.in);
	        int total = 0;

	        System.out.println("----- Marks and Grade Calculator -----");

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
	            int marks = sc.nextInt();
	            total += marks;
	        }

	        double average = total / 5.0;
	        String grade;

	        if (average > 90) {
	            grade = "Ex";
	        } else if (average > 80) {
	            grade = "A";
	        } else if (average > 60) {
	            grade = "B";
	        } else if (average >= 40) {
	            grade = "C";
	        } else {
	            grade = "F";
	        }

	        System.out.println("Total Marks: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Grade: " + grade);
	    }

	    
	    public void InternetBill() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("----- Internet Bill Calculator -----");
	        System.out.print("Enter total data used (in GB): ");
	        double data = sc.nextDouble();

	        double bill;

	        if (data < 10) {
	            bill = 300;
	        } else if (data <= 30) {
	            bill = 300 + 5 * (data - 10);
	        } else {
	            bill = 400 + 3 * (data - 30);
	        }

	        System.out.println("Total Bill: Rs. " + bill);
	    }

	   
	    public static void main(String[] args) {
	    	Week_2_session_1_lab w = new Week_2_session_1_lab();

	        w.SimpleInterest();
	        w.Grades();
	        w.InternetBill();
	    }
	}



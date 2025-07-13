package mypackage;
import java.util.*;

public class week_1_sesion_5_lab {
	

	public void  Rectangle() {
	    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("---- Rectangle Comparison ----");

	        System.out.print("Enter length and width of Rectangle 1: ");
	        int l1 = sc.nextInt();
	        int w1 = sc.nextInt();

	        System.out.print("Enter length and width of Rectangle 2: ");
	        int l2 = sc.nextInt();
	        int w2 = sc.nextInt();

	        int area1 = l1 * w1;
	        int area2 = l2 * w2;

	        System.out.println("Area of Rectangle 1: " + area1);
	        System.out.println("Area of Rectangle 2: " + area2);

	        if (area1 > area2)
	            System.out.println("Rectangle1 > Rectangle2");
	        else if (area1 < area2)
	            System.out.println("Rectangle1 < Rectangle2");
	        else
	            System.out.println("They are equal");
	    }
	

	public void Bank() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("---- Bank Account ----");

	    System.out.print("Enter Name: ");
	    String name = sc.nextLine();

	    System.out.print("Enter Account No: ");
	    int accNo = sc.nextInt();

	    System.out.print("Enter Balance: ");
	    int balance = sc.nextInt();

	    System.out.print("Deposit Amount: ");
	    balance += sc.nextInt();

	    System.out.print("Withdraw Amount: ");
	    int withdraw = sc.nextInt();

	    if (withdraw <= balance) {
	        balance -= withdraw;
	        System.out.println("Withdrawn: " + withdraw);
	    } else {
	        System.out.println("Not enough balance!");
	    }

	    System.out.println("Final Balance: " + balance);

	   
	    String status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance Not Maintained";
	    System.out.println("Status: " + status);
	}



	    public static void main(String[] args) {
	    	week_1_sesion_5_lab w= new week_1_sesion_5_lab ();
	    	w.Rectangle();
	    	w.Bank();
	}
}



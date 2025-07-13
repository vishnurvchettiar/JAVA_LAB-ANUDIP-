package mypackage;

public class Week1_Session_2_Lab_1 {

    
    public void student() {
        String Name = "vishnurv";
        String college = "ABC College";
        int student_ID = 101;
        System.out.println("Student Added  Successful");
        System.out.println("Student Info : "+Name+" "+college+" "+student_ID);
    }

    
    public void employee() {
        int id = 1;
        int age = (int) 35.5;  
        String name = "Ravi";
        boolean isPermanent = true;

        System.out.println("Employee Successfully started");
        System.out.println("Employee Info : "+id+" "+age+" "+name );
    }

    
    public void person() {
        String name = "Amit";
        int age = 30;
        int salary = 40000;

        System.out.println("Person Added Successful");
        System.out.println("Person Info: "+name+" "+age+" "+salary);
        
    }

    
    public static void main(String[] args) {
    	Week1_Session_2_Lab_1 w = new Week1_Session_2_Lab_1();

        w.student();
        w.employee();
        w.person();
    }
}


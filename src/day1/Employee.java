package day1;
public class Employee {
    public static void main(String[] args) {

        /*
        // declaration- creating a variable without assingming a value to it

        int employeeID;
        String firstName;
        String lastName;
        int age;
        char gender;
        double salary;
        boolean fulltimeStatus;
        // initialize - assign a value to avairable when you have a value for it
        employeeID = 12345;
        firstName = "John";
        lastName = "Doe";
        age = 30;
        gender = 'M';
        salary = 50000.50;
        fulltimeStatus = false;

        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: $" + salary);
        System.out.println("Full-time: " + fulltimeStatus);
    */
        // we can also initialize and declare a variable at a time
        final double PI = 3.145;
        int employeeID = 12345;
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;
        char gender = 'M';
        double salary = 50000.50;
        boolean fulltimeStatus = false;
        System.out.println("Initials values ...");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: $" + salary);
        System.out.println("Full-time: " + fulltimeStatus);

        employeeID = 67890;
        firstName = "Daniel";
        lastName = "Tadele";
        age = 31;
        gender = 'F';
        salary = 100000;
        fulltimeStatus = true;
        // tryint to change constant value
        // PI = 3.154;
        System.out.println("changed values ...");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: $" + salary);
        System.out.println("Full-time: " + fulltimeStatus);


    }
}

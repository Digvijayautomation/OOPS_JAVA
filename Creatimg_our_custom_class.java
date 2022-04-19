package OOPS_JAVA;


class Employee   // Employee class without any access modifier bcoz we can only one public class in single page
{
    int emp_id;
    int salary;
    String emp_name;


    public int salary_details() // method of Employee class for salary details
    {
        return salary;
    }

    public void print_emp_details() // method of Employee class for printing details
    {
        System.out.println("Employee Id\t" +emp_id);
        System.out.println("Employee Name\t" +emp_name);
    }


}


public class Creatimg_our_custom_class {  // We can only one public class in single page

    public static void main(String[] args) {

        Employee Emp1=new Employee(); // Instantiating a new object of employee class
        Employee Emp2=new Employee(); // Instantiating a new object of employee class

        //Setting Attributes for employee 1
        Emp1.emp_id=34;
        Emp1.emp_name="Digvijay";
        Emp1.salary=34000;

        //Setting Attributes for employee 2
        Emp2.emp_id=67;
        Emp2.emp_name="Rohit";
        Emp2.salary=323420;


        // Calling print method from employee class
        Emp1.print_emp_details();
        Emp2.print_emp_details();

        //Calling salary method from employee class
           int salary= Emp1.salary_details();
        System.out.println("Salary for\t"+Emp1.emp_name+"\tis\t"+salary);



    }
}

/*
Exercise 5.3: Employee salary review
Create an Employee class with employee number, name, and monthly salary.
Create an array of at least five employee objects.
Display each employee's details, employees earning more than a threshold, the highest salary, and the average salary.

Use if statements to classify salaries as below 10,000, from 10,000 up to but not including 20,000, or 20,000 and above.
 */

public class Employee {
    String empNum;
    String empName;
    double monthlySal;

    Employee(String empNum, String empName, double monthlySal){
        this.empName = empName;
        this.empNum = empNum;
        this.monthlySal = monthlySal;
    }

    String displayEmpDetails(){
        return "Employee Name: " + this.empName + " Employee Number:" + this.empNum + " Monthly salary:" + this.monthlySal;
    }
}

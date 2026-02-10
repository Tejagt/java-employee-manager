package org.example;

public class Main {
    public static void main( String[] args )
    {
        EmployeeManager manager = new EmployeeManager();

        Employee e1 = new Employee(1, "Alice", "HR");
        Employee e2 = new Employee(2, "Second" ,"Accounts ");

        manager.addEmployee(e1);
        manager.addEmployee(e2);

        for(Employee e :manager.getAllEmployees()){
            System.out.println(e);

        }
        manager.getEmployeeID(1);
       
    }
}

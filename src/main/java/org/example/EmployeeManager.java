package org.example;
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();



    public ArrayList<Employee> getAllEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee getEmployeeID(int inputID){

        for(Employee employee : employees){
            if(employee.getId() == inputID){
                return employee;
            }


        }
        return null;
    }
}

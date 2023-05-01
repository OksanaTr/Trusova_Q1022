package homeWork4;

import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }
    public void addStagger(Employee employees){
        Employee employee;
        if(employees==null) {
            employee = new Employee(1);
            employee[0] = employee;
        }else{
            employees = Arrays.copyOf(employee, employee.length +1);
            employee[employees.length-1] = employees;
        }

    @Override
    public void setProf() {
        this.proff = PROFF.WORKER;
    }
}



package homeWork4;

import java.util.Arrays;
public class Director extends Employee {
    Employee [] employees;
    public Director(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public void setProf() {
        this.proff = PROFF.DIRECTOR;
    }
    public void addWorker(Employee employee){
        if(employees==null) {
            employees = new Employee[1];
            employees[0] = employee;
        }else{
            employees = Arrays.copyOf(employees, employee.length +1);
            employees[employees.length-1] = employee;
        }
    }
    @Override
    public int getSalary() {
        if(employees==null){return super.getSalary();}
        else{
            return super.getSalary()+ (employees.length*100);
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                "employees" + Arrays.toString(employees)+
                ",prof=" + proff +
                '}';
    }
}
package homeWork4;

import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public void setProf() {
        this.proff=PROFF.WORKER;
    }

    public void addWorker (Employee employee){
           if() {
               (super.addWorker(employee);
           }
            else{
            System.out.println("Можно нанимать только стажеров");
        }
        }


}









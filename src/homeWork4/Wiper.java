package homeWork4;

public class Wiper extends Employee {
   public Wiper(String name, String secondName, int exp) {
            super(name, secondName, exp);

        }
    @Override
    public int getSalary() {
        return 1000;
        }

    @Override
    public void setProf() {
        super.proff=PROFF.WORKER;
    }
}


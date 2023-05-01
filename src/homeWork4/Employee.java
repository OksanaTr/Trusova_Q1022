package homeWork4;

public abstract class Employee extends Person {

    protected int length;
    private int exp;
    protected PROFF proff;
    private final int basic = 1000;

    public Employee(String name, String secondName, int exp) {
        super(name, secondName);
        this.exp = exp;
        setProf();
    }
    public int getSalary(){  // реализация зарплаты
        return basic * proff.getKoef()*exp;

    }
    public abstract void setProf();

    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", prof=" + proff +
                ", basic=" + basic +
                '}';
    }
}

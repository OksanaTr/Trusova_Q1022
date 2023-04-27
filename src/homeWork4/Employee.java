package homeWork4;

enum POST {
    DIRECTOR,
    WORKER
}

public abstract class Employee {

    String position;// должность
    double baseRate; //базовая ставка
   double  primeRate; // коэффициент

    public static void checkPosition(POST post) {
        switch (post) {
            case DIRECTOR:
                break;
            case WORKER:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + post);
        }
        public void salary(double primeRate; double baseRate; double workExperience;){
             double summa;
            summa = primeRate * baseRate * workExperience;
        }
        } public abstract void establishPosition();


    }




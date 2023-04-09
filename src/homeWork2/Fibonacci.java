package homeWork2;

public class Fibonacci {
    public static void main(String[] args) {
        int [] arrayFibonacci; {
      int [] Mas = new int[20];
            for(int i=0; i<Mas.length; i++) {
          if (i<2){
              Mas[i] = 1;
          } else {
              Mas[i] = Mas[i-2] + Mas[i-1];
          }
          System.out.println(Mas[i] + "");
          }
           }
    }
}

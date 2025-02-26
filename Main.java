import java.util.Scanner;

public class Main {
    static class uravn{
        double x, a, b;
        uravn(double x, double a, double b){
            this.x = x;
            this.a = a;
            this.b = b;
        }
        void urv1(){
            double y = 3 * this.x + 5;
            System.out.println("Решение уравнения y = 3*х+5 при значение х = " + this.x + " будет " + y);
        }
        void urv2(){
            if (this.a ==0 && this.b ==0) {
                System.out.println("Деление на 0 в уравнении y = (a + b)/(a - b).");
            }
            else{
                double y = (this.a + this.b)/(this.a - this.b);
                System.out.println("Решение уравнения y = (a + b)/(a - b) при значение a = " + this.a + " b = " + this.b + " будет " + y);
            }
        }
        double urv3(){
            if (this.a ==0 || this.x ==0) {
                return -1;
            }
            else{
                double y = (this.a * this.x / this.b);
                if (y == 1 || y == 0){
                    return 1;
                }
                else if(y < 0){
                    return -1;
                }
                else{
                    int chiclo = 1;
                    for(int i = 1; i <=y; i++){
                        chiclo*=i;
                    }
                    return chiclo;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Введите значение a ");
        double a_pr = scan.nextDouble();
        System.out.println ("Введите значение b ");
        double b_pr = scan.nextDouble();
        System.out.println ("Введите значение x ");
        double x_pr = scan.nextDouble();
        uravn primer =  new uravn(x_pr,a_pr,b_pr);
        primer.urv1();
        primer.urv2();
        double y = primer.urv3();
        System.out.println("Решение уравнения y = (a * x / b)! будет " + y);
    }
}

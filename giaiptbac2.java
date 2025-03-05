import java.util.Scanner;
public class giaiptbac2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap he so cho phuong trinh bac hai (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        giai(a,b,c);
        scanner.close();
    }

    public static void giai(double a,double b,double c) {
        if (a == 0){
            giaiBac1(b,c);
            return;
        }

        double delta = b *b - 4 *a *c;
        if (delta > 0){
            double x1 =(-b + Math.sqrt(delta)) /(2 *a);
            double x2 =(-b - Math.sqrt(delta)) /(2 *a);
            System.out.println("phuong trinh co hai nghiem phan biet: x1 = " +x1 + ", x2 = " +x2);
        }else if (delta == 0){
            double x = -b /(2 *a);
            System.out.println("phuong trinh co nghiem kep: x = " +x);
        }else{
            System.out.println("phuong trinh vo nghiem.");
        }
    }

    public static void giaiBac1(double a, double b) {
        if (a == 0){
            if (b == 0){
                System.out.println("phuong trinh co vo so nghiem.");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        }else{
            double x = -b /a;
            System.out.println("nghiem cua phuong trinh la: x = " +x);
        }
    }
}

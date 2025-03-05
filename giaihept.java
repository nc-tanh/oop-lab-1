import java.util.Scanner;
public class giaihept {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap he so cho he phuong trinh bac nhat:");
        System.out.print("a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("b2: ");
        double b2 = scanner.nextDouble();
        giai(a11,a12,b1,a21,a22,b2);
        scanner.close();
    }

    public static void giai(double a11,double a12,double b1,double a21,double a22,double b2) {
        double D = a11 *a22 - a12 *a21;
        double D1 = b1 *a22 - b2 *a12;
        double D2 = a11 *b2 - a21 *b1;

        if (D == 0){
            if (D1 == 0&&D2 == 0){
                System.out.println("he phuong trinh co vo so nghiem.");
            }else{
                System.out.println("he phuong trinh vo nghiem.");
            }
        }else{
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("nghiem cua he: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}

import java.util.Scanner;
public class giaiptbac1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("nhap he so cho phuong trinh bac nhat (ax + b = 0): ");
         System.out.print("a: ");
         double a = scanner.nextDouble();
         System.out.print("b: ");
         double b = scanner.nextDouble();
        giai(a, b);
        scanner.close();
    }

    public static void giai(double a, double b){
        if (a == 0){
            if (b == 0){
                System.out.println("phuong trinh co vo so nghiem. ");
            }else{
                System.out.println("phuong trinh vo nghiem. ");
            }
        }else{
            double x = -b/a;
            System.out.println("nghiem cua phuong trinh la: x = " + x);
        }
    }
}


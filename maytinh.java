import java.util.Scanner;
public class maytinh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất : ");
        double a = scanner.nextDouble();
        System.out.println("Nhập số thứ hai: ");
        double b = scanner.nextDouble();
        System.out.println("Tổng của 2 số là: "+ (a+b));
        System.out.println("Hiệu của 2 số là: "+ (a-b));
        System.out.println("Tích của 2 số là: "+a*b);
       if(b!=0) {
           System.out.println("Thương của 2 số là: "+a/b);
       }else{
           System.out.println("Không thể chia cho 0");
       }
        scanner.close();
    }
}

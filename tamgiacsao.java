import java.util.Scanner;
public class tamgiacsao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dong: ");
        int row = scanner.nextInt();
        for(int i=1;i<=row;i++){
            for(int k=row-i;k>0;k--) {//số khoảng trắng đầu dòng
                System.out.print(" ");
            }
                for(int j=1;j<=(2*i-1);j++) {//số dấu *
                    System.out.print("*");
                }
                    System.out.println();


                }
        scanner.close();
            }
        }




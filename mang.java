import java.util.Arrays;
import java.util.Scanner;
public class mang{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] mang1 = new int[n];
        System.out.println("nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            mang1[i] = scanner.nextInt();
        }
        System.out.println("mang ban dau: " + Arrays.toString(mang1));
        Arrays.sort(mang1);
        System.out.println("mang sau khi sap xep: " + Arrays.toString(mang1));
        int tong = 0;
        for (int so : mang1) {
            tong += so;
        }
        double trungbinh = (double) tong / n;

        System.out.println("tong cac phan tu trong mang: " + tong);
        System.out.println("gia tri trung binh cua cac phan tu: " + trungbinh);

        scanner.close();
    }
}

import java.util.Scanner;
public class ngaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang va nam: ");
        String thangchu = scanner.next();
        int nam = scanner.nextInt();
        if (nam < 1000){
            System.out.println("nam khong hop le");
            scanner.close();
            return;
        }
        int thang = chuyendoithang(thangchu);
        if (thang == -1){
            System.out.println("thang khong hop le");
            scanner.close();
            return;
        }

        boolean namnhuan =(nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0));

        int songay;
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12){
            songay =31;
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11){
            songay =30;
        } else {
            songay = namnhuan ? 29 : 28;
        }
        System.out.println("thang " +thangchu + " nam " +nam + " co " +songay + " ngay");

        scanner.close();
    }
    public static int chuyendoithang(String thangchu) {
        switch (thangchu.toLowerCase()) {
            case "jan": return 1;
            case "feb": return 2;
            case "mar": return 3;
            case "apr": return 4;
            case "may": return 5;
            case "jun": return 6;
            case "jul": return 7;
            case "aug": return 8;
            case "sep": return 9;
            case "oct": return 10;
            case "nov": return 11;
            case "dec": return 12;
            default: return -1;
        }
    }
}

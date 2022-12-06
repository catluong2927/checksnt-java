import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra: ");
        double num = scanner.nextDouble();
        if (checksnt(num)) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không là số nguyên tố");
        }
    }
    public static boolean checksnt(double n){
        if( n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n% i == 0) return false;
        }
        return true;
    }
}
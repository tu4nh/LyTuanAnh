import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = a/b;
        System.out.println("________________");
        System.out.println("Tong: "+tong);
        System.out.println("Hieu: "+hieu);
        System.out.println("Tich: "+tich);
        System.out.println("Thuong: "+thuong);
        int max = a>b ? a:b;
        System.out.println("so lon hon la: " + max);
		
	}
}
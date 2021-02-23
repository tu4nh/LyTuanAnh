import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int a;
        int tong = 0;
        while(tong<100){
            a = sc.nextInt();
            tong=tong+a;
            if(tong>100){
                System.out.print("Tong la: "+tong);
            }
        }
    }   
}

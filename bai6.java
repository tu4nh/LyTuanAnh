import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.print("Nhap mot so nguyen duong: ");
            a = sc.nextInt();
        }
        while(a<0);{
            int giathua = a*a;
            System.out.print("Gia thua cua so nguyen duong la: "+giathua);
        }
    }
}

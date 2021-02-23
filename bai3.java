import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        int ns = sc.nextInt();
        int tuoi = 2021-ns;
        if(tuoi<16){
            System.out.print("Ban "+ten + " o tuoi vi thanh nien");
        }
        else if(16<=tuoi && tuoi<18){
            System.out.print("Ban "+ten + " o tuoi tuoi truong thanh");
        }
        else if(tuoi>=18){
            System.out.print("Ban "+ten + " da gia");
        }
    }
}
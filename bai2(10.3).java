import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        ThoiGian tg = new ThoiGian();
        tg.HamTao(0,0,0);
        tg.nhap();
        tg.xuat();
        tg.HamChuyen();
    }
}
class ThoiGian{
    private int gio, phut, giay;
    int a;
    void HamTao(int gio, int phut, int giay){
    this.gio = gio;
    this.phut = phut;
    this.giay = giay;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gio: ");
        gio = sc.nextInt();
        System.out.print("Nhap phut: ");
        phut = sc.nextInt();
        System.out.print("Nhap giay: ");
        giay = sc.nextInt();
    }
    void xuat(){
        System.out.print(+gio+"gio"+phut+"phut"+giay+"giay");
    }
    void HamChuyen(){
        a = gio*3600 + phut*60 + giay;
        System.out.print("So giay"+a);
    }
}
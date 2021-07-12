import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.TB();
        sv.xuat();
    }
}
class SinhVien{
    String hoten, gioitinh, lop;
    int ngaysinh;
    float toan, ly, hoa, tb;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioitinh = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaysinh = sc.nextInt();
        System.out.print("Nhap diem toan: ");
        toan = sc.nextFloat();
        System.out.print("Nhap diem ly: ");
        hoa = sc.nextFloat();
        System.out.print("Nhap diem hoa: ");
        ly = sc.nextFloat();
    }
    void TB(){
        tb = (toan+hoa+ly)/3;
    }
    void xuat(){
        System.out.println("Ho va ten: "+hoten);
        System.out.println("Gioi tinh: "+gioitinh);
        System.out.println("Lop: "+lop);
        System.out.println("Ngay sinh: "+ngaysinh);
        System.out.println("Diem toan: "+toan);
        System.out.println("Diem hoa "+hoa);
        System.out.println("Diem ly"+ly);
        System.out.println("Diem trung binh"+tb);
    }
}
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
    //    String tenSp;
    //    double donGia;
    //    double giamGia;
        Sanpham sp1 = new Sanpham(tenSp, donGia, giamGia);
		Sanpham sp2 = new Sanpham(tenSp, donGia);
        sp1.nhap();
		sp2.nhap();

		sp1.xuat();
		sp2.xuat();
    }
}
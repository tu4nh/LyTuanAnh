import java.util.Scanner;

public class Sanpham{
    public String tenSp;
    public double donGia;
    public double giamGia;
    public Sanpham(){
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.next();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
    private double ThueNhapKhau(){
        return (donGia/10);
    }
    public void xuat(){
        System.out.println("Ten san pham: " +tenSp);
        System.out.println("Don gia: "+donGia);
        System.out.println("Giam gia: "+giamGia);
        System.out.println("Thue nhap khau: "+ThueNhapKhau());
    }
    //yc bai3
	public Sanpham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
    public Sanpham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
		this.tenSp=tenSp;
        this.donGia=donGia;

	}
}
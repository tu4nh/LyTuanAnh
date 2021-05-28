import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;

public class Bai3c4 {
	public static void main(String[] args) {
	    String ten, thongTin;
	    String arrThongTin[];  
	    double diem;
	         
	    LinkedList<String> danhSachSV = new LinkedList<>();
	         
	    LinkedList<String> svThiLai = new LinkedList<>();
	         
	    LinkedList<String> svDiemCao = new LinkedList<>();
	         
	    LinkedList<String> svCanTim = new LinkedList<>();
	         
	    Scanner sc = new Scanner(System.in);
	         
	   
	    do {
	        System.out.println("Nhap ten sinh vien: ");
	        ten = sc.nextLine();
	        if (!ten.isEmpty()) {
	            System.out.println("Nhap diem sinh vien: ");
	            diem = Double.parseDouble(sc.nextLine());
	            thongTin = ten + "\t" + diem;
	            danhSachSV.add(thongTin);
	        }
	    } while (!ten.isEmpty()); //ten sinh vien rong thi khong nhap nua
	         
	
	    System.out.println("So sinh vien trong danh sach: " + (danhSachSV.size()));
	    System.out.println("Thong tin cac sinh vien vua nhap la: ");
	    System.out.println("Ten sinh vien\t Diem");
	    Iterator<String> iterator = danhSachSV.iterator();
	    while (iterator.hasNext()) {
	        System.out.println(iterator.next());
	    }
	         
	    for (int i = 0; i < danhSachSV.size(); i++) {
	     
	        String sv = danhSachSV.get(i);  
	        arrThongTin = sv.split("\t");
	        double point = Double.parseDouble(arrThongTin[1]);
	        if (point <= 5) {
	            svThiLai.add(sv);
	        }
	    }
	             
	    if (svThiLai.isEmpty()) {
	        System.out.println("Khong co sinh vien thi lai");
	    } else {
	        System.out.println("So sinh vien phai thi lai la: " + (svThiLai.size()));
	        System.out.println("Thong tin cac sinh vien phai thi lai: ");
	        System.out.println("Ten sinh vien\t Diem");
	        iterator = svThiLai.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	         
	    double max = 0; 
	    int i = 0; 
	         
	    // tim diem cao nhat
	    while (i < danhSachSV.size()) {
	        arrThongTin = danhSachSV.get(i).split("\t");
	        if (Double.parseDouble(arrThongTin[1]) >= max) {
	            max = Double.parseDouble(arrThongTin[1]);
	        }
	        i++;
	    }
	 
	    // tim sinh vien co diem cao nhat
	    i = 0;
	    while (i < danhSachSV.size()) {
	        arrThongTin = danhSachSV.get(i).split("\t");
	        if (Double.parseDouble(arrThongTin[1]) == max) {
	            svDiemCao.add(danhSachSV.get(i));
	        }
	        i++;
	    }
	         
	    System.out.println("Thong tin sinh vien co diem cao nhat la: ");
	    System.out.println("Ten sinh vien\t Diem");
	    iterator = svDiemCao.iterator();
	    while (iterator.hasNext()) {
	        System.out.println(iterator.next());
	    }
	         
	    //tim kiem sinh vien
	    System.out.println("Nhap ten sinh vien can tim: ");
	    String tim = sc.nextLine();
	         
	    i = 0;
	    while (i < danhSachSV.size()) {
	        arrThongTin = danhSachSV.get(i).split("\t");
	        ten = arrThongTin[0];
	        if (tim.equalsIgnoreCase(ten)) {
	            svCanTim.add(danhSachSV.get(i));
	        }	             
	        i++;    
	    }
	         
	    System.out.println("Thong tin sinh vien ten la " + tim + ": ");
	    System.out.println("Ten sinh vien\\t Diem");
	    iterator = svCanTim.iterator();
	    while (iterator.hasNext()) {
	        System.out.println(iterator.next());
	    }
	}
}

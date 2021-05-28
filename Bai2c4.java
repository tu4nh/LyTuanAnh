import java.util.LinkedList;
import java.util.Scanner;

public class Bai2c4 {
	public static void main(String[] args) {
		int sum = 0;
		int dem = 0;
		int x;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cac so nguyen duong: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
        	System.out.println("Nhap so nguyen duong thu " + (i+1) + ": ");
        	x = sc.nextInt();
            list.add(x); 
            
        }
        for (int i = 0; i < list.size(); i++) {
        	if (list.get(i) % 2 == 0) {
        		sum += list.get(i);
        		dem++;
        	}
        }
        
        System.out.println("Trung binh cong cua cac so chan trong list la: " + (sum/dem));
	}
}

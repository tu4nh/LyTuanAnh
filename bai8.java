import java.util.Scanner;
public class bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        float tbc;
        do{
            System.out.print("Nhap vao so phan tu: ");
            n = sc.nextInt();
        }
        while(n<0);
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1) +" :");
            A[i]=sc.nextInt();
        }
        int tong = 0;
        for(int i=0; i<n; i++){
            tong = tong + A[i];
        }
            tbc = tong/n;
            System.out.print("Trung binh cong cac so la: "+tbc);
    }
}

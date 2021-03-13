import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        MaTran mt = new MaTran();
        mt.nhap();
        mt.xuat();
    }
}
class MaTran{
    int n;
    int[][] A = new int[n][n];
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so bac cua ma tran: ");
            n = sc.nextInt();
        } while (n < 1);
        A = new int[n][n];
        System.out.println("Nhap phan tu ma tran A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
    }
    public void xuat(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
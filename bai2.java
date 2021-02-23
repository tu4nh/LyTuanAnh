import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a:");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.print("A la so chan");
        }
       else{
           System.out.print("A la so le");
       }
    }
    
}

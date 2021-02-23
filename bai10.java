import java.util.Scanner;
public class bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String chuoi;
        do {
			System.out.print("Nhap vao mot chuoi ky tu: ");
			chuoi = sc.nextLine();
		}while(chuoi.length()>80);
        System.out.print("Nhap vao mot ky tu bat ky: ");
        char kitu = sc.next().charAt(0);
        int sokitu = 0;
        for(int i = 0; i<chuoi.length(); i++){
            if(chuoi.charAt(i)==kitu){
            sokitu++;
            }
        }
        System.out.println("So ki tu "+kitu +" trong chuoi la: "+sokitu);       
    }
}


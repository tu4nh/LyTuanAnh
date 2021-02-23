import java.util.Scanner;
public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi ky tu bat ky: ");
        String chuoi = sc.next();
        int inHoa = 0;
        int inTh = 0;
        int so = 0;
        for (int i=0; i<chuoi.length(); i++){
        if (chuoi.charAt(i)>='A' && chuoi.charAt(i)<='Z')
            inHoa++;
        else if(chuoi.charAt(i)>='a' && chuoi.charAt(i)<='z')
            inTh++;
        else if(chuoi.charAt(i)>='0' && chuoi.charAt(i)<='9')
            so++;
        }
        System.out.println("So ky tu in hoa la: "+inHoa);
        System.out.println("So ky tu in thuong la: "+inTh);
        System.out.println("So ky tu so la: "+so);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int checkCau=0;
        int checkTu =0;
        do{
            System.out.print("Nhập vào một câu s:");
            s = sc.nextLine();
            String[] arStr = s.split(" ");
            checkCau = arStr.length;
            for(String str : arStr){
                if(str.length()>checkTu){
                    checkTu=str.length();
                }
            }
            if (checkCau > 20) {
                System.out.println("Số lượng từ trong câu không được vượt quá 20.");
            } else if (checkTu > 10) {
                System.out.println("Từ trong câu không vượt quá 10 ký tự.");
            }
        }while(checkCau>20 || checkCau< 0  || checkTu>10);
        String[] arStr = s.split(" ");

        Arrays.sort(arStr);
        System.out.print("Các từ sắp xếp theo Alphabet là:");
        for(String str : arStr) {
            System.out.print(str+" ");
        }




        sc.close();
    }
}

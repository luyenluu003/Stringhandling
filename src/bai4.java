import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự s:");
        String s = sc.nextLine();

        String[] arStr = s.split(" ");

        String longStr ="";

        int index =0;
        for(int i=0;i<arStr.length;i++){
            String str = arStr[i];
            if(str.length() >longStr.length()){
                longStr = str;
                index = i;
            }
        }

        System.out.println("Từ dài nhất trong chuỗi là "+ longStr +" ở vị trí thứ "+(index+1));


        sc.close();;
    }
}

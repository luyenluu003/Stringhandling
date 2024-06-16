
import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự s:");
        String s = sc.nextLine();

        String[] arStr = s.split(" ");
        String ho =arStr[0];
        String ten = arStr[arStr.length-1];
        StringBuilder newArr = new StringBuilder();
        newArr.append(ten+" ");
        newArr.append(ho+" ");
        for (int i = 1; i < arStr.length-1; i++) {
            newArr.append(arStr[i]+" ");
        }
        System.out.println(newArr);
        sc.close();
    }
}

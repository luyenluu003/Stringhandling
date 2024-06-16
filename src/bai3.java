import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự s:");
        String s = sc.nextLine();

        String[] arStr = s.split(" ");
        for(String arr:arStr){
            char[] array= arr.toCharArray();
            for(int i=0;i<array.length;i++){
                if(i==0) {
                    System.out.print(Character.toUpperCase(array[i]));
                }else{
                    System.out.print(array[i]);
                }
            }
            System.out.print(" ");
        }

        sc.close();;
    }
}

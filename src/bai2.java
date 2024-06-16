import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự s:");
        String s = sc.nextLine();

        char[] array= s.toCharArray();
        System.out.print("Chuyển sang xen kẽ kí tự in hoa và thường là:");
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                System.out.print(Character.toUpperCase(array[i]));
            }else{
                System.out.print(Character.toLowerCase(array[i]));
            }
        }

        sc.close();
    }
}

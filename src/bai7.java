import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu ký tự s1:");
        String s1 = sc.nextLine();
        System.out.print("Nhập vào xâu ký tự s2:");
        String s2 = sc.nextLine();
        if(s1.contains(s2)){
            String s3 =s1.replace(s2,"");
            System.out.print("Xâu s1 sau khi xóa s2:");
            System.out.print(s3);
        }else{
            System.out.println("Xâu s1 Không chứa xâu s2!!");
        }

        sc.close();
    }
}

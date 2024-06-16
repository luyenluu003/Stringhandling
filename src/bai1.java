public class bai1 {

    private static boolean check(int n){
        String a = String.valueOf(n);
        StringBuilder sb = new StringBuilder(a);
        String b = sb.reverse().toString();
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println("Liệt kê các số thuận nghịch có 6 chữ số là:");
        for(int i=100000;i<=999999;i++){
            if(check(i)){
                System.out.println(i);
            }
        }
    }
}

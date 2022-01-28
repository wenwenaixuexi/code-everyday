import java.util.*;
public class SuShu{
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
       
       while(scan.hasNextInt()){
        int x = scan.nextInt();
        for( int i = 2; i < x;i++){
            if(x % i == 0){
               System.out.println("不是素数！");
                break;
            }
        }
        for(int i = 2;i<=x/2;i++){
            if(x % i == 0){
                System.out.println("不是素数！");
                 break;
             }
        }
        for(int i = 2;i<=Math.sqrt(x);i++){
            if(x % i == 0){
                System.out.println("不是素数！");
                 break;
             }
        }
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 2;i < n; i++){
            int j=2;
            for(;j<=(int)Math.sqrt(i);j++){
                if(i%j == 0){
                    break;
                }
            }
            if(j>(int)Math.sqrt(i)){
                System.out.println(i+"是素数");
            }
        }
    }
}
import java.util.Scanner;
//200-300中第一个三的倍数
public class beishu{
    public static void main1(String[] args) {
        int count = 0;
        
        for(int i=200;i<= 300;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    //找到第一个既能被3也能被5整除的数字
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while( num <= 100){
            if (num % 15 == 0){
                System.out.println(num);
                break;
            }
            System.out.println("num");
            num++;
        }
    }
}
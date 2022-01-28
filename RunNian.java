import java.util.Scanner;
public class RunNian{
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        while(scan.hasNextInt()){
            int year = scan.nextInt();
            if((year % 4==0 && year % 100 != 0) || (year%400==0)){
                System.out.println("闰年！");

            }else{
                System.out.println("不是闰年");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                System.out.println("1");
                    break;
                default:
                    break;
            }
        }
    }
}
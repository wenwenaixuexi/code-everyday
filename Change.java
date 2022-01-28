import java.util.Scanner;
public class Change{
    public static void main1(String[] args) {
        int x=2;int y =1;
        int temp = 0;
        
       temp = x;
      
       x=y;
       y = temp;
        System.out.println(x+" "+y);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int sum = 0; int ret = 1;
        for(int j = 1; j <= num;j++){

           
            for ( int i = 1; i <= j; i++){
                ret *= i;

            }
            System.out.println(ret);
     
            sum+=ret;
        }
        System.out.println(sum);

      
    }
}
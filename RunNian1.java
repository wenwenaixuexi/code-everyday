import java.util.Scanner;
public class RunNian1{
    public static void main1(String[] args) {
      
        for(int i =1000; i<=2000;i++){
            if(i % 4 ==0 && i % 100 != 0 || i % 400 == 0){
                System.out.println(i+"是闰年！");
            }

        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int age = scan.nextInt();
            if( age < 18 ){
                System.out.println("低于18");
            } else if ( age < 28 && age > 19){
                System.out.println("低于28大于19");
            } else if ( age < 55 && age > 29){
                System.out.println("低于55大于29");
            }
        }
      
    }
    //乘法口诀
    public static void main3(String[] args) {
        for ( int i = 1;i <= 9; i++){
            for( int j = 1; j <=i; j++){
                System.out.print( i + "*"+ j +"=" + i * j + " ");
            }
            System.out.println();
        }
    }
    //最大公约数
    //辗转相除法：余数为0时  除数就是最大公约数
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while( scan.hasNextInt()){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = 0;
            //辗转相除法
            while ( a % b != 0){
               c = a % b;//6
               a = b;//18
               b = c;//6
                
            }
            System.out.println(c);

        }
    }
    //计算计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan .nextInt();
        double sum = 0;int flag = 1;
        for ( int i = 1; i <= n; i++){
            sum = sum + (1.0/i)*flag;
            flag = -flag;

        }
        System.out.println(sum);

    }
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9。  如果要赵一个十进制的数字的每一位上是几  只需要除10或模十就行
    //如果要找以为二进制数的每一位/2 %2就可
    public static void main6(String[] args) {
        int count = 0;
        for (int i = 1; i<=100; i++){
          /*   if ( i % 10 == 9){//个位是9
                count++;
            }
            if ( i /10 == 9){//十位是9
                count++;
            }*/
            //如果判断有多少个数字包含9
            if ( i % 10 == 9){//个位是9
                count++;
            }else if ( i / 10 == 9){//十位是9
                count++;
            }
        }
        System.out.println(count);
    }
}
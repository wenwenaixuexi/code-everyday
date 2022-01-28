public class TestDemo{
    public static void main1(String[] args){
        //String[] args作用是运行时参数    java TestDemo gao bo is cool
        //java中的数组存放用的堆   
        for(int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("kaixin");
    }
    public static void main2(String[] args){
        long a = 10L;//后面加了L才是长整型
        System.out.println("a的最大值时："+a);
        System.out.println("最大值："+Long.MAX_VALUE);
         System.out.println("最大值："+Long.MIN_VALUE);
         
         int b = 10;
         int c = 20;
         System.out.println("hhh"+c+b);
         //注意：任何类型的数据和字符串拼接 结果就是字符串  地下可以计算

         System.out.println("hhh"+(c+b));
    }
    public static void main(String[] args){
        double b =12.5;//12.5默认是双精度类型
        System.out.println(b);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        //注意点
        int a = 1;
        int  c = 2;
        System.out.println(a/c);//a和b都是整型  输出0

      System.out.println("Hello,Java");
       System.out.println("My name is:"+args[0]); 
    }
}
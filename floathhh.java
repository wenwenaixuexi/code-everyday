public class floathhh {
    public static void main1(String[] args) {
        //在java中不允许把一个double类型的值，直接赋值给float 编译错误！体现了java安全
        float b = 12.5f;
        System.out.println(b);
        //java是一个强类型语言，c语言是一个弱类型语言
    }
    public static void main2(String[] args) {
        char ch = 'a';
        System.out.println(ch);
        char ch2 = '高';
        System.out.println(ch2);
        //输出a
         char ch3 = 97;
         System.out.println(ch3);

    }
    public static void main3(String[] args) {
        byte b = 12;
        byte c = 21;
        byte d  = 0;
        System.out.println(b + " "+ c);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
       // d = Byte.MAX_VALUE+1;
       // System.out.println(d);//默认以整形打印  所以结果是128

        byte e = 127;
        System.out.println(e);
//每一种类型赋值都不能超过它的范围
     
        System.out.println(Integer.MAX_VALUE);
      
    }
    public static void main4(String[] args) {
        /*short 短整型  2字节 */
        short sh = 12;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

    }
    public static void main5(String[] args) {
        boolean flg = false;
        System.out.println(flg);
        //在java中没有明确的大小    在java 中只有两个取值  true和flase  
        //在java中没有0假非0真
    }
    public static void main(String[] args) {
        String name = "\"zhangsna\"";
        String str = "\\zhangsna\\";
        System.out.println(name);
        System.out.println(str);

    }
}
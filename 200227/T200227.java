public class T200227 {

    public static void main(String[] args) {
        {
        	int a = 10;
    	    System.out.println(" { } " + a);//可编译
        }
    	//System.out.println(a);//不可编译
    }


    public static void main10(String[] args) {
    	//强制类型转换  互不相关的类型无法强转
    	int a = 10;
    	double b = 2.4;
    	a = (int) b;
    	System.out.println(a);//2
    	System.out.println(b);//2.4
    }

    public static void main9(String[] args) {
    	//字节类型   byte 范围为  -128 ~ 127 （与字符类型各不相干）
    	byte s = Byte.MAX_VALUE;
    	System.out.println(s + 1);//128  (不可直接赋值128)
    }


    public static void main8(String[] args) {
    	//转义字符
    	String s = "/'Hello'/";
    	System.out.println(s);
    }


    public static void main7(String[] args) {
    	//字符串类型
    	String s = "abcdef";
    	System.out.println(s);//abcdef
        
        int c = 10;
        int a = 20;
    	System.out.println(a + c);//30
    	System.out.println("a+c = " + a + c);//a+c = 2010
    	System.out.println("a+c = " + (a + c));//a+c = 30
    	System.out.println("a+c = " + a + " " + c);//a+c = 20 10

    	double d = 12.5;
    	System.out.println("H = " + d);//H = 12.5
    }


    public static void main6(String[] args) {
    	//布尔类型  true  false
    	boolean b = true;
    	System.out.println(b);
    }
    


    public static void main5(String[] args) {
    	//字符型
    	//java中字符型为两个字节，Unicode字符集；>  C中ASCII码字符集
    	char c = 'a';
    	char d = '高';
    	System.out.println(c);
    	System.out.println(d);

    	int f = c;
    	System.out.println(f);//97 (a = 97);
    }


    public static void main4(String[] args) {
    	float e = 12.5f;
    	System.out.println(e);//12.5

    	double f = 1.0D;
    	System.out.println(f);//1.0
    	//优先使用double
    }



	public static void main3(String[] args) {
		int a = 1;
		int b = 2;
		//两个整形若相除，并不会保存小数；
		System.out.println(a/b);//0

		double c = 1.1;
		double d = 1.1;
		System.out.println(c*d);//1.2100000000002
		//程序中小数存储方式不一样；
	}


	public static void main1(String[] args) {
		int a = 10;
		long b = 20L;//8
		double c = 12.5;//8
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}



	public static void main2(String[] args) {
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
import java.io.*;
import java.util.*;


class MainTest {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(++i == i++);
        System.out.println(i++ == i++);

        int j = 0;
        System.out.println(++j + " " + j++);
        System.out.println(j++ + " " + j++);

        //Map structure = new HashMap();
        Map structure = new TreeMap();
        structure.put("a", 420);
        System.out.println(structure.get("a"));

        System.out.println( 0.375 == 0.125d + 0.125d + 0.125d );
        System.out.println( 1.5 == 0.5d + 0.5d + 0.5d );
        System.out.println( 0.3 == 0.1d + 0.1d + 0.1d );

        long x = 500000000;
        long y = 2;
        byte b = (byte) (x / y);
        System.out.println(b);

        System.out.println(Math.sqrt(-2.0)); //Nan
        System.out.println(Math.sqrt(0)); //0.0
        System.out.println(1.0/0.0); //Infifnity
        //System.out.println(1/0); //java.lang.ArithmeticException

        Integer a = 128;
        Integer bb = 128;
        Integer c = -128;
        Integer d = -128;
        System.out.println(a == bb); // false Пояснение: Т.к. в Integer pool попадают значения от -128 до 127
        System.out.println(c == d);

        int a1 = 128;
        int bb1 = 128;
        int c1 = -128;
        int d1 = -128;
        System.out.println(a1 == bb1); // true
        System.out.println(c1 == d1);

        Integer i1 = 10;
        Integer i2 = 10;

        Double dd1 = 10d;
        Double dd2 = 10d;

        System.out.println(i1 == i2);//true
        System.out.println(dd1 == dd2);//false
    }
}
class Test {
    int i = 1;

    void add(int i) {
        i += i;
        System.out.println(i);
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.add(5);
    }
}
class MathTest {
    public static void main(String... args) {
        System.out.println((-7 % 5) > (7 % -5));
        System.out.println(Math.abs(Math.ceil(-2.5)) < Math.ceil(Math.abs(-2.5)));
    }
}

class Test1 {
    public static void main(String[] s) {
        A a = new B();
        a.b();
    }
}

class A {
    void a() {
        System.out.println("A-a");
    }

    void b() {
        System.out.println("A-b");
        a();
    }
}

class B extends A {
    void a() {
        System.out.println("B-a");
    }

    void b() {
        System.out.println("B-b");
        super.b();
    }
}

class Test2 {
    public static void main(String[] args) {
        List a = new ArrayList<Integer>();// 4 что написано во втором даймонде не имеетникакого значения.
        a.add("1.5");// 5
        a.add(0.5);
        a.add(5);

        List<Double> b = new ArrayList();// 6
        //b.add("1.5");// 7
        System.out.println(a + " " + b);
    }
}
class Test3 {
    public static void main(String a[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(null);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

class MapTest {
    public static void main( String[] args ) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();

        map1.put( "Number1", new Integer( 100 ) );
        map1.put( "Number2", new Integer( 200 ) );
        map1.put( "Number3", new Integer( 300 ) );

        List<Map> list = new ArrayList<Map>();
        list.add( map1 );
        list.add( map2 );

        HashMap resultMap = (HashMap) list.get( 0 );
        System.out.println( "Number: " + resultMap.get( "Number2" ) );
    }
}
class AA {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        Integer[] array = null;
        list.toArray(array);//java.lang.NullPointerException
        System.out.println(list.get(1));
    }
}
class Exam  {
    public static void main(String[] arg) {
        Object obj = null;
        String str = new String("str");
        str = (String) obj;
        obj = new String("obj");
        System.out.print(obj + ", " + str); //obj, null
    }
}
class Exam1  {
    public static void main(String[] arg) {
        String str1 = new String("str1");
        String str2 = new String("str2");
        str1 = str2;
        str2 = new String("str3");
        System.out.print(str1 + ", " + str2); //str2, str3
    }
}

class Tack {
    static short s = 17;
    public Tack(short ss) {
        new Tack();
        s *= ss;
    }
    public Tack() {
        ;
    }
} class Bridle extends Tack {
    public Bridle(int s) {
        System.out.println(s + 1);
    }

    public static void main(String[] args) {
        Bridle b = new Bridle(3);//4
    }
}

public class Main {
    static int method() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            try {
                if (i == 1) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Exception!");
                return i;
            } finally {
                System.out.println("Finally block");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("method() returned " + method());/*
        i = 0
Finally block
i = 1
Exception!
Finally block
method() returned 1*/
    }
}

class AAA {
    public static void main(String[] args) {

        byte[] a={ 49,50,51,52,53,54,55 };

        String b=new String(a);      // 1
        System.out.println(b);

        String c=new String(a,2,4);  // 2
        System.out.println(c);/*
        1234567
        3456
        */
    }

}
class Main1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\file.txt");
        BufferedReader input = new BufferedReader(new FileReader(file));
       //FileInputStream input = new FileInputStream(file);
        try {

            int i;
            while((i = input.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}

class Abc {
    public static void main(String[] args) {
        p1:
        {
            p2:
            {
                p3:
                {
                    System.out.print("p3.1 ");
                    if (true) break p2;
                    System.out.print("p3.2 ");
                }
                System.out.print("p2 ");
            }
            System.out.print("p1 ");
        }
    }
        //p3.1 p1 - долбоебизм
}
class Bar {
    public static void main(String args[]) {
        label:
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (i > 2) break label;
                System.out.print(j);
            }
            System.out.print(" ");
        }
        //01234 01234 01234
    }
}

class test {
    static {
        System.out.println("Bo-Bo!");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    static {
        System.out.println("Go-Go!");
        System.exit(0);
    }
}
//-------------------------------------------------
class Base {
    public String name = "Base";
    public String getName() {
        return name;
    }
}

class Sub extends Base {
    public String name = "Sub";
    public String getName() {
        return name;
    }
}
class Program {
    public static void main(String[] args) {
        Sub s = new Sub();
        Base b = s;
        System.out.println(b.name);//Base
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.print("Running ");
    }
    public void start() {
        System.out.print("Starting ");
    }
}

class Q202 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); //Starting
    }
}

class E {
    public static void main(int[] args){
        System.out.println("Hi, World!");
    }

    public static void main(String... args){
        System.out.println("Hello, World!");
    }

}

class Main2 {
    private static class A1 {
        String s1 = "S1";
        private String test() {
            System.out.println(s1);
            return "A1";
        }
    }

    public static class A2 extends A1 {
        String s2 = "S2";
        public String test() {
            System.out.println(s2);
            return "A2";
        }
    }

    public static class A3 extends A2 {
        String s3 = "S3";
        public String test() {
            System.out.println(s3);
            return "A3";
        }
    }

    public static void main(String ... arg) {
        A1 a1 = new A1();
        System.out.println(a1.test());//A1
        a1 = new A2();
        System.out.println(a1.test());//A1
        a1 = new A3();
        System.out.println(a1.test());//A1
    }

}

class X {
    int x = 1;

    public void printX() {
        System.out.println(getX());
    }

    public int getX() {
        return x;
    }
}

class Y extends X {
    int x = 2;

    public int getX() {
        return x + 1;
    }
}
class Test4 {
    public sttic void main(String[] args) {
        X classA = new Y();
        classA.printX();
    }
}


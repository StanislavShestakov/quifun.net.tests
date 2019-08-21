import java.io.IOException;
import java.util.*;


class MainTest {
    public static void main(String[] args) {
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
        System.out.println(1/0); //java.lang.ArithmeticException


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


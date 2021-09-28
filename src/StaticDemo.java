public class StaticDemo {
    public static void main(String [] args){
        A2 a = new A2();

    }
}

class A2{
    static int i=m1();

    static{
        System.out.println("Static Block -- 1");
    }
    static int m1(){
        System.out.println("Static A -- m1");
        return 10;
    }
    static int m2(){
        System.out.println("Static A -- m2");
        return 20;
    }
    static{
        System.out.println("Static Block -- 2");
    }
    static int j = m2();
}
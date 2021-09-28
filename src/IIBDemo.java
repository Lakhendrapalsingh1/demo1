class A{
    int i = m1();
    {
        System.out.println("IIB--1");
    }
    A(){
        System.out.println("A--Constructor");
    }
    int m1(){
        System.out.println("A--m1");
        return 10;
    }
    int m2(){
        System.out.println("A--m2");
        return 20;
    }
    {
        System.out.println("IIB--2");
    }
    int j = m2();
    {
        System.out.println(i+" "+j);
    }
}

public class IIBDemo {
    public static void main(String[] args){
        A a = new A();
    }
}

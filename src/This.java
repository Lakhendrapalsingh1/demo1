public class This {
    public static void main(String[] args){
        AThis a = new AThis();
        a.m();
        a.m2();
        a.display();
    }
}

class AThis{
    int i = 10;
    void m(){
        int i = 20;
        System.out.println(i);
        System.out.println(this.i);
    }

    void m2(){
        B2 b2 = new B2();
        b2.p(this);
    }
    void display(){
        System.out.println(i);
    }
}

class B2{
    void p(AThis a){
        ++a.i;
    }
}
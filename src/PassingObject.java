public class PassingObject {
    public static void main(String[] args){
        PassingObjectA a1 = new PassingObjectA(2,3);
        PassingObjectA a2 = new PassingObjectA(6,4);
        a1.m(a2);
        a1.display();
        a2.display();
    }
}

class PassingObjectA{
    int i;
    int j;
    PassingObjectA( int i1 ,int j1){
        i = i1;
        j = j1;
    }
    void m(PassingObjectA a){
        i = i + a.i;
        j = j + a.j;
    }
    void display(){
        System.out.println(i + " " + j);
    }
}
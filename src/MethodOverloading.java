public class MethodOverloading {
    public static void main(String[] args){
        Addition a = new Addition();
        a.sum((byte)10 ,(byte)10);
        a.sum(20 ,30);
        a.sum(20.5f ,29.5f);
    }
}

class Addition {

    void sum(byte val1, byte val2){
        System.out.println("byte :: Val1 + Val2 = " + (val1 + val2));
    }

    void sum(int val1, int val2){
        System.out.println("int :: Val1 + Val2 = " + (val1 + val2));
    }

    void sum(double val1, double val2){
        System.out.println("double :: Val1 + Val2 = " + (val1 + val2));
    }
}
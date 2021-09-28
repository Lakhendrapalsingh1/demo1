class Implicit_Type_Casting {
    void I_Casting(){
        byte x = 10;
        int y = x;
        int a = 34;
        float b = a;
        char p ='A';
        int q = p;
        long m = 3243253429L;
        float n = m;

        System.out.println(x + "  " +y);
        System.out.println(a + "  " +b);
        System.out.println(p + "  " +q);
        System.out.println(m + "  " +n);
    }
}
class Explicit_Type_Casting {
    void E_Casting(){

        int y = 10;
        byte x = (byte)y;

        float b = 34;
        int a = (int)b;

        int q = 'A';
        char p = (char)q;

        float n = 3243253429f;
        long m = (long)n;

        System.out.println(x + "  " +y);
        System.out.println(a + "  " +b);
        System.out.println(p + "  " +q);
        System.out.println(m + "  " +n);
    }
}
class Type_Casting {
    public static void main(String args[]){
        Implicit_Type_Casting ITCobj = new Implicit_Type_Casting();
        ITCobj.I_Casting();
        Explicit_Type_Casting ETCobj = new Explicit_Type_Casting();
        ETCobj.E_Casting();
    }
}

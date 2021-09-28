public class Student {
    int rollno;
    String name;

    void setValue(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }
}

class Demo{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setValue(101,"Rahul Kushwaha");
        s2.setValue(102,"Lakhendra Pal Singh");
        s1.display();
        s2.display();
    }
}

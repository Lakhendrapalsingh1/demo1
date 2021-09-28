public class ConstructorOverloading {
    public static void main(String [] args){

        Shape s1 = new Shape(7,10);
        Shape s2 = new Shape(5);
        System.out.println("Area of Rectangle is : "+ s1.area());
        System.out.println("Area of Square is : "+ s2.area());
    }
}

class Shape {
    int length;
    int breadth;
    Shape(int l,int b){
        length = l;
        breadth = b;
    }
    Shape(int d){
        length = breadth = d;
    }
    int area(){
        return (length*breadth);
    }
}
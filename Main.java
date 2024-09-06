
class A{
    void fun(int a,int b){
        System.out.println("func B = "+(a+b));
    }
}

public class Main {
    public static void main(String[] args) {
       A n = new A();
       n.fun(10,20);
    }
}
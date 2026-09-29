
public class A {
    int a,b;
    A() {
        a = 20;
        b = 30;
        System.out.println(a + b);
    }

    {
        a = 10;
        b = 20;
        System.out.println(a + b);
    }
}

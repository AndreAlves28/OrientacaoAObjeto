package orientacaoaobjeto;

public class Foo2 {
    static int x = 3;
    static float y = 4.3f;

    public static void main(String[] args) {
        for(int z = x; z < ++x; z--, y = y + z)
        System.out.println("x is " + x);

    }
    
}

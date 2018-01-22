package orientacaoaobjeto;

public class Dog2 extends Animal {
    public void eat() {
        /* Sem exceções */
    }
    public static void main(String[] args) {
        Animal a = new Dog2();
        Dog2 b = new Dog2();
        
        a.eat();

    }
    
}

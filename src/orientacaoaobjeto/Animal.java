package orientacaoaobjeto;

class Animal {
    public void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
    void makeNoise() {
        System.out.println("Generic Noise");
       
    }
}
class Dog extends Animal {
    void makeNoise() {
        System.out.println("bark");
        super.makeNoise();
    }
    void playDead() {
        System.out.println("Roll over");
    }
    
    public static void main(String [] args) {
        Dog cao = new Dog();
        
    }
}

/*class Horse extends Animal {
    public void eat() {
        System.out.println("Horse  eating hay ");
    }
    public void eat(String s) {
        System.out.println("Horse eating " + s);
        
    }
}
*/
package orientacaoaobjeto;
public class Animal1 {
    String name;
    Animal1(String nome) {
        this.name = name;
    }
    
    Animal1() {
        this(makeRandomName());
    }
    
    static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[] {"Fluffy", "Fido", 
                                    "Rover", "Spike", "Gigi"} [x];
   
        return name;
    }
    
    public static void main(String [] args) {
        Animal1 a = new Animal1();
        System.out.println(a.name);
        
        Animal1 b = new Animal1("Zeus");
        System.out.println(b.name);
    }
}

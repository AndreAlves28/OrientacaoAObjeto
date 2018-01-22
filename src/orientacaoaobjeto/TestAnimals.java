package orientacaoaobjeto;

public class TestAnimals {

    public static void main(String[] args) {
        Animal a = new Animal();
        Horse b = new Horse(); // Referencia a Animal, mas é um objeto Horse
        Horse c = new Horse();
        
        a.eat(); //Executa a versão animal eat().
        b.eat(); //Eecuta a versão horse eat().
        c.Buck();
        
        
        
    
    }
    
}

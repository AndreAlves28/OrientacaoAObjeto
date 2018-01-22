package orientacaoaobjeto;

class Bar {
   void takeInt(int x) {
       System.out.println("Bar 9");
    }
}

class UseBar {
    public static void main(String [] args) {
        Bar b = new Bar();
        b.takeInt(9);
    }
}
public abstract class Animal {
    private String nombre; 
        public Animal(String nombre) {
     this.nombre = nombre;    
    }

    public abstract void hacersonido ();
    public void dormir() {
        System.out.println(nombre + "duerme");
    }
}

public class plusClass {

    private String nombre;
    private int id;
    
    public plusClass(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void displayAttributes() {
        System.out.println("nombre: " + nombre);
        System.out.println("id " + id);
    }

}

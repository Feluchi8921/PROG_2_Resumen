public class CondicionNombre extends CondicionBusqueda{
    //Atributo
    private String nombre;

    //Constructor
    public CondicionNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Elemento e){
        return e.getNombre().equals(this.nombre);
    }
}

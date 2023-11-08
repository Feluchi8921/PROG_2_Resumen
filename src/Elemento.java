import java.util.ArrayList;

public abstract class Elemento {
    //Atributos
    private String nombre;
    private ArrayList<String> caracteristicas;
    //Constructor


    public Elemento(String nombre) {
        this.nombre = nombre;
        this.caracteristicas = new ArrayList<>();
    }
    //Getters and Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo getCantidad
    public abstract int getCantidad();

    //Metodo getElementos
    public abstract ArrayList<Elemento> getElementos();

    //Metodo copia
    public abstract Elemento copia();

    //Metodo copia Restringida
    public abstract Elemento copia(CondicionBusqueda c);

    //Metodo buscar
    public abstract ArrayList<Elemento> buscar(CondicionBusqueda c);
}

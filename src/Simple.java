import java.util.ArrayList;

public class Simple extends Elemento {

    //Atributos
    private ArrayList<String> atributos;

    //Constructor
    public Simple(String nombre) {
        super(nombre);
        this.atributos = new ArrayList<>();
    }

    //Metodos
    public boolean tieneAtributo(String atributo) {
        return atributos.contains(atributo);
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public ArrayList<Elemento> getElementos() {
        ArrayList<Elemento> listarElemento = new ArrayList<>();
        listarElemento.add(this);
        return listarElemento;
    }

    @Override
    public Elemento copia() {
        return new Simple(super.getNombre());
    }

    @Override
    public Elemento copia(CondicionBusqueda c) {
        if (c.cumple(this)) {
            return new Simple(super.getNombre());
        }
        return null;
    }

    @Override
    public ArrayList<Elemento> buscar(CondicionBusqueda c) {
        ArrayList<Elemento> listarElementos = new ArrayList<>();
        if (c.cumple(this)) {
            listarElementos.add(this);
        }
        return listarElementos;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " - Cantidad: " + this.getCantidad() + "\n";
    }
}

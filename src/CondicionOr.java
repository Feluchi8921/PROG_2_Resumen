public class CondicionOr extends CondicionBusqueda{
    //Atributos
    CondicionBusqueda c1;
    CondicionBusqueda c2;

    //Constructor
    public CondicionOr(CondicionBusqueda c1, CondicionBusqueda c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public boolean cumple(Elemento e){
        return c1.cumple(e) || c2.cumple(e);
    }
}

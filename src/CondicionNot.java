public class CondicionNot extends CondicionBusqueda{
    //Atributos
    CondicionBusqueda c;

    //Constructor
    public CondicionNot(CondicionBusqueda c){
        this.c=c;
    }

    @Override
    public boolean cumple(Elemento e){
        return !c.cumple(e);
    }
}

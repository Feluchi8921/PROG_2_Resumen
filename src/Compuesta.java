import java.util.ArrayList;

public class Compuesta extends Elemento{

    //Atributos
    private ArrayList<Elemento> elementos;

    //Constructor
    public Compuesta(String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    //Metodos propios de esta clase
    public void addElemento(Elemento e){
        //Verifico que no este asi no se repite
        if(!elementos.contains(e)) {
            elementos.add(e);
        }
    }

    public ArrayList<Elemento> listarElementos(){
        ArrayList<Elemento> listarElementos = new ArrayList<>();
        for (Elemento e: elementos) {
            listarElementos.add(e);
        }
        return listarElementos;
    }

    //Metodos de la clase abstracta
    @Override
    public int getCantidad(){
        int cant=0;
        for(Elemento e: elementos){
            cant+=e.getCantidad();
        }
        return cant;
    }

    public ArrayList<Elemento> getElementos(){
        ArrayList<Elemento> listarElementos = new ArrayList<>();
        for(Elemento e : elementos){
            //Verifico que no este repetido
            ArrayList<Elemento> aux = e.getElementos(); //Guardo el arraylist que me trae de Simple
            for(Elemento a :aux){ //Lo recorro y voy chequeando que no este agregado asi no repito
                if(!listarElementos.contains(a)) {
                    listarElementos.add(a); //Agrego cada elemento que cumple
                }
            }
        }
        return listarElementos;
    }
    @Override
    public Elemento copia(){
        Compuesta copiaCompuesta = new Compuesta(super.getNombre()); //Creo una instania de Compuesta
        for(Elemento e :elementos){ //Recorro los elementos
            Elemento copiaElementos = e.copia(); //Guardo los elementos de la simple
                if(copiaElementos!=null){   //Si me trae algo lo agrego a la copia
                    copiaCompuesta.addElemento(copiaElementos);
            }
        }
        return copiaCompuesta;
    }

    @Override
    public Elemento copia(CondicionBusqueda c){
        Compuesta copiaCompuesta = new Compuesta(super.getNombre()); //Creo una instania de Compuesta
        for(Elemento e :elementos){ //Recorro los elementos
            Elemento copiaElementos = e.copia(c); //Guardo los elementos de la simple. A diferencia de la anterior le paso la condicion
            if(copiaElementos!=null){   //Si me trae algo lo agrego a la copia
                copiaCompuesta.addElemento(copiaElementos);
            }
        }
        return copiaCompuesta;
    }

    @Override
    public ArrayList<Elemento> buscar(CondicionBusqueda c){
        ArrayList<Elemento> listarElementos = new ArrayList<>();
        for(Elemento e : elementos){
            listarElementos.addAll(e.buscar(c));
        }
        return listarElementos;
    }

}

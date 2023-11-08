public class Main {
    public static void main(String[] args) {

        //Creo instancias de la simple
        Simple simple1 = new Simple("Simple 1");
        Simple simple2 = new Simple("Simple 2");

        //Creo instancias de las compuestas
        Compuesta compuesta1 = new Compuesta("Compuesta 1");
        Compuesta compuesta2 = new Compuesta("Compuesta 2");
        Compuesta compuestaGeneral = new Compuesta("Compuesta General");

        //Les agrego elementos y a la general le agrego dos compuestas con elementos y una simple
        compuesta1.addElemento(simple1);
        compuesta1.addElemento(simple2);
        compuesta2.addElemento(simple2);
        compuestaGeneral.addElemento(compuesta1);
        compuestaGeneral.addElemento(compuesta2);
        compuestaGeneral.addElemento(simple1);

        //Imprimo
        System.out.println(compuestaGeneral.listarElementos());
    }
}
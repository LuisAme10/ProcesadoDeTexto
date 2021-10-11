
package procesadodetexto;

public class Directorio extends ProcesadoDeTexto{
    public void Directorio(){
        NombreTexto();
        System.out.println("que desea hacer con el documento :"+getNombretexto());
        int ban = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("seleccione una opcion");
                System.out.println("    1: ARCHIVAR");
                System.out.println("    2: BORRAR");
                System.out.println("    3: IMPRIMIR");
                System.out.println("    4. MOSTRAR");
                System.out.println("    5. SALIR");
                seleccion = entrada.nextInt();
                if (seleccion >= 1 && seleccion <= 5) {
                    ban = 1;
                } else {
                    System.out.println("-------------");
                    System.out.println("opcion no disponible");
                    System.out.println("-------------");
                }
            } while (ban == 0);
            if (seleccion == 1) {
                Archivar();
                
            } else if (seleccion == 2) {
              Borrar();
            } else if (seleccion == 3) {
               imprimir();
            } else if (seleccion == 4) {
               mostrar();
                
            } else if(seleccion==5){
                System.out.println("proceso terminado");
                ban=2;
            }
        } while (ban != 2);
    }
    public void Archivar(){
        System.out.println("el documento :"+getNombretexto()+"se guardo correctamente.");
    }
    public void Borrar(){
        System.out.println("el documento :"+getNombretexto()+"se borro correctamente.");
    }
    public void imprimir(){
        System.out.println("el documento :"+getNombretexto()+"se imprimio correctamente.");
    }
    public void mostrar(){
        System.out.println("el documento es :"+getNombretexto());
    }
}

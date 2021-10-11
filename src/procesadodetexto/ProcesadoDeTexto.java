package procesadodetexto;

import java.util.Scanner;

public class ProcesadoDeTexto {

    private String nombretexto;
    Scanner entrada = new Scanner(System.in);

    public void ProcesadoDeTexto() {
        int ban = 0;

        int seleccion;
        do {
            do {
                System.out.println("bienvenido...");
                System.out.println("1. CREAR DOCUMENTO");
                System.out.println("2. SALIR");
                seleccion = entrada.nextInt();
                if (seleccion >= 1 && seleccion <= 2) {
                    ban = 1;
                } else {
                    System.out.println("eleccion no exitente");
                }
            } while (ban != 1);
            if(seleccion==1){
                System.out.println("escriba el nombre del texto:");
                NombreTexto();
                Directorio mensajero=  new Directorio();
                mensajero.Directorio();
            }else{
                System.out.println("procceso terminado..");
                ban=2;
            }
            
        }while (ban != 2);
  
    }
    public void NombreTexto(){
        setNombretexto(entrada.nextLine());
    }

    public String getNombretexto() {
        return nombretexto;
    }

    public void setNombretexto(String nombretexto) {
        this.nombretexto = nombretexto;
    }

    
}
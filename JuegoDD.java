import java.util.Scanner;

public class JuegoDD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSeleccionado;

        do {
            System.out.println(cadenaMenuJuego());
            System.out.print("INTRODUZCA SU ELECCIÓN: ");
            numeroSeleccionado = sc.nextInt();
            if (numeroSeleccionado > 0 && numeroSeleccionado < Menu.TOTAL_OBJETOS-1 ){
                System.out.print(Menu.seleccionaPorNumero(numeroSeleccionado).mostrarDados());
            }else{
                System.out.println(Menu.seleccionaPorNumero(numeroSeleccionado).mostrarDomino());
            }
        } while (numeroSeleccionado != 0);
        System.out.println("Adios");
    }

    public static String cadenaMenuJuego(){
        String salida="0 para salir\n";
        int contador=0;

        for (int i = 0; i < Menu.TOTAL_OBJETOS; i++) {
            contador++;
            salida+=contador;
            salida+=" "+Menu.seleccionaPorNumero(i+1).cadenaDatos()+"\n";
        }
        return salida;
    }

}

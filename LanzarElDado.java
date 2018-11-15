import java.util.Scanner;

public class LanzarElDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSeleccionado;
        do {
            System.out.println(cadenaMenuJuego());
            System.out.print("INTRODUZCA SU ELECCIÓN: ");
            numeroSeleccionado = sc.nextInt();
            if (numeroSeleccionado > 0 && numeroSeleccionado < Menu.TOTAL_DADOS) {
                System.out.println(Menu.seleccionaPorNumero(numeroSeleccionado).mostrarDados());
            }
        } while (numeroSeleccionado != 0);
        System.out.println("Has elegido: " + numeroSeleccionado);
    }

    public static String cadenaMenuJuego(){
        String salida="0 para salir\n";
        int contador=0;

        for (int i = 0; i < Menu.TOTAL_DADOS; i++) {
            contador++;
            salida+=contador;
            salida+=" "+Menu.seleccionaPorNumero(i+1).cadenaDado()+"\n";
        }
        return salida;
    }

}

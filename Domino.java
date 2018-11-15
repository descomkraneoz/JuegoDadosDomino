public class Domino {
    public static final int PUNTOS_MAXIMOS_POR_CARA=6;

    private String nombre="";
    private int puntosMaximos;

    public Domino(String nombre, int puntosMaximos) {
        this.nombre = nombre;
        this.puntosMaximos = puntosMaximos;
    }

    public String mostrarDomino(){
        String salida="";
        for (int i = 0; i <=PUNTOS_MAXIMOS_POR_CARA ; i++) {
            salida+=" x \n";
            for (int j = 0; j <=PUNTOS_MAXIMOS_POR_CARA ; j++) {
                salida+=i+" "+j+"\n";
            }
            salida+=" x \n";
        }
        return salida;
    }
}
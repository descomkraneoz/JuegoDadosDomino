public class FichasAndDados {

    private String nombre="";
    public int valores;

    public FichasAndDados(String nombre, int valores) {
        this.nombre=nombre;
        this.valores=valores;
    }

    public String cadenaDatos(){
        String salida="para tipo de "+this.nombre+" que tiene "+
                this.valores+" valores";
        return salida;
    }

    public String mostrarDados(){
        String salida="";

        for (int i = 1; i <=this.valores ; i++) {
            salida+=" x \n";
            for (int j = 1; j <=this.valores ; j++) {
                salida+=i+" "+j+"\n";
            }
            salida+=" x \n";
        }
        return salida;
    }

    public static final int PUNTOS_MAXIMOS_POR_CARA=6;

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

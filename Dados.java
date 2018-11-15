public class Dados {

    private String nombreDado="";
    private int carasDado;

    public Dados(String nombreDado, int carasDado) {
        this.nombreDado=nombreDado;
        this.carasDado=carasDado;
    }

    String cadenaDado(){
        String salida="para tipo de: "+this.nombreDado+" tiene "+
                this.carasDado+" caras";
        return salida;
    }

    String mostrarDados(){
        String salida="";

        for (int i = 1; i <=this.carasDado ; i++) {
            salida+=" x \n";
            for (int j = 1; j <=this.carasDado ; j++) {
                salida+=i+" "+j+"\n";
            }
            salida+=" x \n";
        }
        return salida;
    }

}
public class Menu {

    public static final int TOTAL_DADOS=8;
    static Dados D4=new Dados("Dado D4",4);
    static Dados D6=new Dados("Dado D6",6);
    static Dados D8=new Dados("Dado D8",8);
    static Dados D10=new Dados("Dado D10",10);
    static Dados D12=new Dados("Dado D12",12);
    static Dados D20=new Dados("Dado D20",20);
    static Dados D30=new Dados("Dado D30",30);
    static Dados D100=new Dados("Dado D100",100);


    public static Dados seleccionaPorNumero(int numero){
        switch(numero){
            case 1:return D4;
            case 2:return D6;
            case 3:return D8;
            case 4:return D10;
            case 5:return D12;
            case 6:return D20;
            case 7:return D30;
            case 8:return D100;
            //case 9:return ;
            default:return D6;
        }
    }

}

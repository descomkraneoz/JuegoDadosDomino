public class Menu {

    public static final int TOTAL_OBJETOS=9;
    static FichasAndDados D4=new FichasAndDados("Dado D4",4);
    static FichasAndDados D6=new FichasAndDados("Dado D6",6);
    static FichasAndDados D8=new FichasAndDados("Dado D8",8);
    static FichasAndDados D10=new FichasAndDados("Dado D10",10);
    static FichasAndDados D12=new FichasAndDados("Dado D12",12);
    static FichasAndDados D20=new FichasAndDados("Dado D20",20);
    static FichasAndDados D30=new FichasAndDados("Dado D30",30);
    static FichasAndDados D100=new FichasAndDados("Dado D100",100);
    static FichasAndDados Domino=new FichasAndDados("Domino Clásico",6);


    public static FichasAndDados seleccionaPorNumero(int numero){
        switch(numero){
            case 1:return D4;
            case 2:return D6;
            case 3:return D8;
            case 4:return D10;
            case 5:return D12;
            case 6:return D20;
            case 7:return D30;
            case 8:return D100;
            case 9:return Domino;
            default:return D6;
        }
    }
}

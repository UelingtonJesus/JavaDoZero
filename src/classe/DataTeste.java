package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(12,12,2012);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();


    }
}

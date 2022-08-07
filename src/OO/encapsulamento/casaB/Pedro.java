package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();

    void testeAcessos(){
//        System.out.println(mae.segredo);
//        System.out.println(mae.facoDentroDeCasa);
//        System.out.println(mae.formaDeFalar);
        System.out.println(formaDeFalar);//Acesso por herança
        System.out.println(mae.todosSabem);

    }
}

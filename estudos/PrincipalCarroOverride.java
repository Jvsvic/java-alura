package estudos;
import estudos.ModeloCarroOverride;

public class PrincipalCarroOverride {
    public static void main(String[] args) {
        ModeloCarroOverride carro1 = new ModeloCarroOverride();
        carro1.setNome("Camaro");
        carro1.setValor1(150.000);
        carro1.setValor2(180.000);
        carro1.setValor3(200.000);
        carro1.setAno(2001);
        System.out.println("Ano: " + carro1.getAno());
        carro1.exibirInfo();
       }

}

package estudos.desafios5;

public class PrincipalAnimalDesafioM3 {
    public static void main(String[] args) {
        CachorroDesafioM3 husk = new CachorroDesafioM3();
        husk.setNome("Lobinha");
        husk.setPorte("Médio");
        husk.setIdade(14);
        husk.setRaca("Husk Siberiano");
        System.out.println("Nome: " + husk.getNome()     + ", Porte: " + husk.getPorte() + ", Idade: " + husk.getIdade() + ", Raca: " + husk.getRaca());

        if (husk instanceof AnimalDesafioM3) {
        AnimalDesafioM3 animal = (AnimalDesafioM3) husk;
        System.out.println("Puxando da classe AnimalDesafioM3 -> Nome: " + animal.getNome() +
                ", Porte: " + animal.getPorte() +
                ", Idade: " + animal.getIdade());
        } else {
            System.out.println("Não está no instanciado com o nome de desafio");
        }

    }
}

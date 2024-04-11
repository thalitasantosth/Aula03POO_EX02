package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class Principal {

	public static void main(String[] args) {
		// Testando a classe Animal
        Animal a1 = new Animal();
        a1.setNome("Leão");
        a1.setComprimento(200);
        a1.setCor("Amarelo");
        a1.setAmbiente("Savana");
        a1.setVelocidade(15.0f);
        a1.dados();

        System.out.println();

        // Testando a classe Peixe
        Peixe a2 = new Peixe();
        a2.setNome("Tubarão");
        a2.setComprimento(300);
        a2.setCaracteristicas("Barbatanas e Cauda");
        a2.dados();

        System.out.println();

        // Testando a classe Mamifero
        Mamifero a3 = new Mamifero();
        a3.setNome("Urso");
        a3.setComprimento(250);
        a3.setCor("Castanho");
        a3.setAlimento("Mel");
        a3.dados();
    }
}

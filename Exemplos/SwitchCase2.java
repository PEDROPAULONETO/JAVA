package sef.module3.sample;

public class SwitchCase2 {
	public static void main(String[] args) {
		int nota = 8;

		switch (nota) {
		    case 1, 2, 3, 4, 5 -> {
		        System.out.println("Tá péssimo, precisa melhorar!");
		        if (nota > 4) {
		            break; // ainda podemos utilizar para sair mais cedo do block
		        }
		        System.out.println("Agendar reunião com os pais...");
		    }
		    case 6, 7 -> System.out.println("Está bacana, mas há espaço para evolução!");
		    case 8, 9 -> System.out.println("Está excelente!");
		    case 10 -> System.out.println("Está perfeito!");
		    default -> System.out.println("Nota inválida");
		};
	}
}

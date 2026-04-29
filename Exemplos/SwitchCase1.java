package sef.module3.sample;

public class SwitchCase1 {

	public static void main(String[] args) {
		String nota = "B";
		String mensagem = switch (nota) {
							    case "A" -> "Está perfeito!"; // 1
							    case "B" -> "Está muito bem!";
							    case "C" -> "Está razoável, podemos melhorar!";
							    case "D" -> "Está mal, vamos melhorar!";
							    case "E" -> "Está péssimo, bora pra cima!";
							    case "F" -> "Desisto!";
							    default -> { // 2
							        System.err.println("Nota inválida: " + nota);
							        yield "Nota inválida!"; // 3
							    } // 4
		};
		System.out.println(mensagem);
	}
}

package sef.module3.sample;

public class SwitchInovations {

	public enum Dia {
		Domingo, Segunda, Terca, Quarta, Quinta, Sexta, Sabado
	}

	public static void main(String args[]) {
		antigoSwitch();
		novoSwitch();

	}

	public static void antigoSwitch() {
		int numLetras = 0;
		Dia agora = Dia.Sexta;
		switch (agora) {
		case Domingo:
		case Segunda:
			numLetras = 7;
			break;
		case Sabado:
		case Quarta:
		case Quinta:
			numLetras = 6;
			break;
		case Terca:
		case Sexta:
			numLetras = 5;
			break;
		}
		System.out.println(numLetras);	
	}
	
	public static void novoSwitch() {
		Dia agora = Dia.Sexta;
		int numLetras = switch (agora) 
		{
			case Domingo, Segunda -> 7;
			case Sabado, Quarta, Quinta -> 6;
			case Terca, Sexta -> 5;
		};
		System.out.println(numLetras);
	}
}

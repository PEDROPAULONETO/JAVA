package sef.module3.sample;

public class SwitchCase3 {

	public enum Dia {
		Domingo, Segunda, Terca, Quarta, Quinta, Sexta, Sabado
	}

	public static void main(String args[]) {
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

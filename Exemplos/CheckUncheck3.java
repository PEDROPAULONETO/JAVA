package sef.module8.sample;

class ExcecaoCustomizada extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcecaoCustomizada(String str) {
		super(str);
	}
}

public class CheckUncheck3 {
	public static void main(String[] args) {
		try {
			// código que levanta uma exce��o
			throw new ExcecaoCustomizada("Esta é uma exceção customizada"); // Coloque sua mensagem personalizada
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

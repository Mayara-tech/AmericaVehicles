package Controller;

import java.util.InputMismatchException;

public class ControleCliente {
	/**
	 * Classe ControleCliente faz o controle de todos os dados dos Clientes (Falta Implementa��o).
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */

	/**
	 * validaCpf - Utilizar de um calculo matematico para validar se um cpf e v�lido ou n�o.
	 * @test
	 * @return boolean
	 */
	public static boolean validaCpf (String cpf) {

		/*  Para calcular o 1� d�gito verificador
			Cada um dos nove primeiros n�meros do CPF � multiplicado por um peso que come�a 
			de 10 e que vai sendo diminuido de 1 a cada passo, somando-se as parcelas calculadas:
			sm = (5*10)+(4*9)+(6*8)+(4*7)+(7*6)+(1*5)+(4*4)+(2*3)+(9*2) = 249;
			Calcula-se o d�gito atrav�s da seguinte express�o:
			11 - (sm % 11) = 11 - (249 % 11) = 11 - 7 = 4
			obs. Se o resto da divis�o (operador %) calculado for 10 ou 11, o d�gito verificador ser�
			 0; nos outros casos, o d�gito verificador � o pr�prio resto.

			Para calcular o 2� d�gito verificador
			Cada um dos dez primeiros n�meros do CPF, considerando-se aqui o primeiro DV, �
			multiplicado por um peso que come�a de 11 e que vai sendo diminuido de 1 a cada passo, 
			somando-se as parcelas calculadas:
			sm = (5*11)+(4*10)+(6*9)+(4*8)+(7*7)+(1*6)+(4*5)+(2*4)+(9*3)+(4*2) = 299;
			Calcula-se o d�gito atrav�s da seguinte express�o:
			11 - (sm % 11) = 11 - (299 % 11) = 11 - 2 = 9
			obs. se o resto da divis�o (operador %) calculado for 10 ou 11, o d�gito 
			verificador ser� 0; nos outros casos, o d�gito verificador � o pr�prio resto.
		 */


		// verificador de cpf com sequencia de numeros iguais;

		if (cpf.equals("00000000000") ||
				cpf.equals("11111111111") ||
				cpf.equals("33333333333") ||
				cpf.equals("22222222222") || 
				cpf.equals("44444444444") ||
				cpf.equals("55555555555") ||
				cpf.equals("66666666666") ||
				cpf.equals("77777777777") ||
				cpf.equals("88888888888") || 
				cpf.equals("99999999999") ||
				(cpf.length() != 11))
			return(false);
		// Variaveis 
		char dig10;
		char dig11;
		int sm;
		int i; 
		int r; 
		int num; 
		int peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {

			// Calculo do 1�. Digito Verificador
			sm = 0;
			peso = 10;
			for (i=0; i<9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				num = (int)(cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

			// Calculo do 2�. Digito Verificador
			sm = 0;
			peso = 11;
			for(i=0; i<10; i++) {
				num = (int)(cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else dig11 = (char)(r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.

			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
				return(true);
			else return(false);
		} catch (InputMismatchException erro) {
			return(false);
		}
	}

}

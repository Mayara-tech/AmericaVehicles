package View;
import java.rmi.AccessException;
import java.util.Date;
import java.util.Scanner;
import Controller.*;
import Model.*;
import View.*;
public class ControleGeral {

	public static void main(String[] args)  {
		TelaInicial menuPrincipal = new TelaInicial ();

		/*	------------------------------	teste CPF ------------------------------------
		String cpf;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Por favor Insira o CPF: ");
        cpf = ler.next();
        if (ControleCliente.validaCpf(cpf) == true) {
        System.out.printf("\nCPF v�lido: ");
        }
        else System.out.printf("CPF inv�lido! Por favor verifique o CPF informado.\n");
        }*/

		
		
		/* ------------------------------------ teste Cartao de Cr�dito ------------------
		 Scanner tcd = new Scanner(System.in);

		String bandeiraCartao = "";

		System.out.println("Informe o n�mero do cart�o:");
		String numeroCartao = tcd.next();

		if( numeroCartao.length() >= 13 && numeroCartao.length() <= 16  ) {

			boolean flag = ControleFormaPagamento.checkValidade(numeroCartao);

			if( flag ) {
				System.out.println("Cart�o V�lido");
				bandeiraCartao = ControleFormaPagamento.checkBandeiraCartao(numeroCartao.substring(0,1), 
						numeroCartao.substring(0,2));
				System.out.println("Bandeira " + bandeiraCartao);
			} else {
				System.out.println("Cart�o Inv�lido");
			} 

		} else {
			System.out.println("N�mero de cart�o inv�lido");
		} 		 */

		
		/* ------------------------------------- teste email ---------------------------------
		String email;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Por favor Insira o EMAIL: ");
        email = ler.next();
        ControleVendedor.validarEmail(email);
       */ 
	}
}

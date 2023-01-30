package Controller;

import java.rmi.AccessException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControleVendedor {
	/**
	 * Classe ControleVendedor faz o controle de todos os dados dos Vendedores (Falta Implementa��o).
	 * @author Mayara Alves de Oliveira
	 * @since 2023
	 * @version 1.0
	 */
	
	/**
	 * validarEmail - utilizar da biblioteca Java.util.regex para validar se um email e v�lido ou n�o.
	 * @test
	 * @return String
	 */
	public static void validarEmail(String email) throws AccessException {  
		  
	     
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,3}$");    
        Matcher m = p.matcher(email.trim());   
        if (!m.find())  
            System.out.println("EMAIL INV�LIDO");  
        else {
        	System.out.println("EMAIL V�LIDO"); 
        }

    } 

}

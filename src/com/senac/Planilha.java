package com.senac;

import java.util.Scanner;

import com.senac.algoritmos.AvaliadorRPN;

import static java.lang.System.*;

public class Planilha {
	public static void main(String[] args) throws Exception {
	
	Scanner entradaTeclado = new Scanner(System.in);
	String expressao="";
	System.out.println("Digite a expressão com espacos\nPara terminar o programa, digite 'fim'");
	while(entradaTeclado.hasNext()){
		expressao=entradaTeclado.nextLine();
		if(expressao.equals("fim"))
			System.exit(0);
		else{
			AvaliadorRPN.inversorPosFixo(expressao);
		}
	}
	
	
	}
}

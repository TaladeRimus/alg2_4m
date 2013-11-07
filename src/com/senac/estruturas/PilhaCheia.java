package com.senac.estruturas;

public class PilhaCheia extends Exception {
	public PilhaCheia()
	{
		super("Tentativa de inclusao em uma pilha cheia.");
	}
}

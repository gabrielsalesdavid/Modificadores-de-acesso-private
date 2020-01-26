package br.com.modificadoresprivate;

import br.com.modificadoresdeacesso.Cliente;

public class Private {
	public static void main (String [] args) {
		Cliente cli1 = new Cliente ("Gabriel Sales ", "Rua trouxa, 123 ");
		
		cli1.dizer_oi ();
	}
}

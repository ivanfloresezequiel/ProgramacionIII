package Taller.src.gestor;
import java.util.LinkedList;

import Taller.src.clases.*;
public class GestorCliente {
	private LinkedList<Cliente> listaClientes;

	public GestorCliente(LinkedList<Cliente> linkedList) {
		this.listaClientes = linkedList;
	}

	public void crearCliente(Cliente factoryCliente) {
		listaClientes.add(factoryCliente);
		
	}

	public LinkedList<Cliente> getColeccionClientes() {
		return listaClientes;
	}
	
	
	
	
	
	
}

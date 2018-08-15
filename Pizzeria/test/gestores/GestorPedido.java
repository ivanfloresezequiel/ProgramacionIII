package gestores;
import entidades.Pedido;


import java.util.LinkedList;

public class GestorPedido {


	private LinkedList<Pedido> listaPedidos =  new LinkedList();

	public GestorPedido(LinkedList<Pedido> linkedList) {
		this.listaPedidos =  linkedList;
	}

	public void crearPedido(Pedido factoryPedido) {
		listaPedidos.add(factoryPedido);		
	}

	public LinkedList<Pedido> getColeccionPedidos() {
		
		return listaPedidos;
	}

}

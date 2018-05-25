package controladoras;

import java.util.LinkedList;

import PracticoI.Ciudad;

public class crudCiudad {
	
	private static LinkedList<Ciudad> listaCiudad = new LinkedList<Ciudad>();;
	
	
	public static boolean create(Ciudad c1){
		boolean resultado=true;
		for(Ciudad ciudad1 : listaCiudad){
			if(ciudad1.getIdCiudad() == c1.getIdCiudad()){
				//System.out.println("No se pudo crear la ciudad, el ID ya existe");
				resultado = false;
				break;
			}
			if(ciudad1.getNombre().equals(c1.getNombre())){
				//System.out.print("Ya existe una ciudad con ese nombre");
				resultado = false;
				break;
			}
			
			if(ciudad1.getCodigoPostal().equals(c1.getCodigoPostal())){
				//System.out.println("Ya existe una ciudad con el mismo CP");
				resultado = false;
			}
			
		}
		if(resultado){
			listaCiudad.add(c1);
		}
	 return(resultado);
	}
	
	public static void modificar(Ciudad antigua, Ciudad Nueva){
		for(Ciudad c1: listaCiudad){
			if(c1.getIdCiudad() ==  antigua.getIdCiudad()){
				c1=Nueva;
			}
		}
		
	}
	
	public static void borrar(Ciudad eliminar){
		listaCiudad.remove(eliminar);
	}
	
	public static Ciudad traerUno( int id){
		Ciudad resultado= new Ciudad(0, null, null);
		for(Ciudad c1: listaCiudad){
			if(c1.getIdCiudad() == id){
				resultado = c1;
			}
		}
		return(resultado);
		
	}
	
	
	public static LinkedList<Ciudad> traerTodos(){
		return listaCiudad;
		
	}
	//ejemplo modificar avion(recibe avionantiguo, AvionNuevo)
}

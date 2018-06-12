package controladoras;

import java.util.LinkedList;

import PracticoI.Ciudad;

public class crudCiudad {
	
	private static LinkedList<Ciudad> listaCiudad = new LinkedList<Ciudad>();;
	
	
	public static boolean crearCiudad(Ciudad c1){
		boolean resultado=true;
		for(Ciudad ciudad1 : listaCiudad){
			if(ciudad1.getIdCiudad() == c1.getIdCiudad()){
				resultado = false;
				break;
			}
			if(ciudad1.getNombre().equals(c1.getNombre())){
				resultado = false;
				break;
			}
			if(ciudad1.getCodigoPostal().equals(c1.getCodigoPostal())){
				resultado = false;
			}
			
		}
		if(resultado){
			listaCiudad.add(c1);
		}
	 return(resultado);
	}
	
	public static void modificarCiudad(Ciudad ciudadAntigua, Ciudad ciudadNueva){
		for(Ciudad ciudad1: listaCiudad){
			if(ciudad1.getIdCiudad() ==  ciudadAntigua.getIdCiudad()){
				ciudad1=ciudadNueva;
			}
		}
		
	}
	
	public static void borrarCiudad(Ciudad eliminar){
		listaCiudad.remove(eliminar);
	}
	
	public static Ciudad traerUnaCiudad( int id){
		Ciudad resultado= new Ciudad(0, null, null);
		for(Ciudad ciudad1: listaCiudad){
			if(ciudad1.getIdCiudad() == id){
				resultado = ciudad1;
			}
		}
		return(resultado);
		
	}
	
	
	public static LinkedList<Ciudad> traerTodasCiudades(){
		return listaCiudad;
		
	}

}

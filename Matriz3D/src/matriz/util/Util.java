package matriz.util;

public class Util {
	
	public Boolean validarSize(int size){
		
		if((1 <= size && size <= 100)) {
			return true;
		}else {
			System.out.println("ERROR - el tamaño debe estar entre 1 y 100");
			return false;
		}
		
	}
	
	public Boolean validarValorUpdate(int valor){
		
		if((-109 <= valor && valor <= 109)) {
			return true;
		}else {
			System.out.println("ERROR UPDATE - el valor debe estar entre -109 y 109");
			return false;
		}
		
	}

}

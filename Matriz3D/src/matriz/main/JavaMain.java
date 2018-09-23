package matriz.main;
import java.util.Scanner;

import matriz.business.service.IBusinessService;
import matriz.business.service.impl.BusinessService;
import matriz.constructor.Matriz;

public class JavaMain {
	
	public static IBusinessService service;
		
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese tamaño de la matriz");
		int size = sc.nextInt();
		
		if((1 <= size && size <= 100)) {
			
			Matriz matriz = new Matriz(size);
			
			service = new BusinessService();
			
			System.out.println(service.execute("UPDATE 2 2 2 4", matriz.getMatriz3D()));
			System.out.println(service.execute("QUERY 1 1 1 3 3 3", matriz.getMatriz3D()));
			System.out.println(service.execute("UPDATE 1 1 1 23", matriz.getMatriz3D()));
			System.out.println(service.execute("QUERY 2 2 2 4 4 4", matriz.getMatriz3D()));
			System.out.println(service.execute("QUERY 1 1 1 3 3 3", matriz.getMatriz3D()));
			System.out.println(service.execute("UPDATE 2 2 2 1", matriz.getMatriz3D()));
			System.out.println(service.execute("QUERY 1 1 1 1 1 1", matriz.getMatriz3D()));
			System.out.println(service.execute("QUERY 1 1 1 2 2 2", matriz.getMatriz3D()));
			System.out.println(service.execute("QUERY 2 2 2 2 2 2", matriz.getMatriz3D()));
			
		}else {
			System.out.println("ERROR - el tamaño debe estar entre 1 y 100");
		}
	}

}

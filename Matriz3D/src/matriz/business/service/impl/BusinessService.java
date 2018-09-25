package matriz.business.service.impl;
import matriz.business.service.IBusinessService;
import matriz.util.Util;

public class BusinessService implements IBusinessService{
	
	public static Util util = new Util();
	
	@Override
	public String execute(String query, int matriz3D [][][]) {
		
		if(query.startsWith("UPDATE")){
			
			try {
				String[] argSep = query.split(" ");
				int coordenadaX = Integer.parseInt(argSep[1])-1;
				int coordenadaY = Integer.parseInt(argSep[2])-1;
				int coordenadaZ = Integer.parseInt(argSep[3])-1;
				int valor = Integer.parseInt(argSep[4]);
				
				if(util.validarValorUpdate(valor)){
					matriz3D[coordenadaX][coordenadaY][coordenadaZ] = valor;
					return "SUCCESS";
				}else{
					return "ERROR UPDATE - el valor debe estar entre -109 y 109";
				}

			}catch (Exception e) {
				return "ERROR - UPDATE - Coordenada inexistente";
			}
		}

		if(query.startsWith("QUERY")){
			
			try {
				int valorTotalQuery = 0;
				String[] argSep = query.split(" ");
				int coordenadaX1 = Integer.parseInt(argSep[1])-1;
				int coordenadaX2 = Integer.parseInt(argSep[4])-1;

				for(int k=coordenadaX1;k<=coordenadaX2;k++){
					valorTotalQuery+=matriz3D[k][k][k];
				}
				
				return "SUCCESS / " + valorTotalQuery;
			}catch (Exception e) {
				return "ERROR - QUERY - Coordenada inexistente";
			}
		}
		
		return "ERROR";
	}

}

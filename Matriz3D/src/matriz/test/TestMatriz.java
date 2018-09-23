package matriz.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import matriz.business.service.IBusinessService;
import matriz.business.service.impl.BusinessService;
import matriz.constructor.Matriz;

public class TestMatriz {

	public static IBusinessService service;
	
    @Test
    public void testUpdate() {
    	service = new BusinessService();
    	
    	Matriz matriz = new Matriz(4);
        assertEquals("SUCCESS", service.execute("UPDATE 2 2 2 4", matriz.getMatriz3D()));
    }
    
    @Test
    public void testUpdateError() {
    	service = new BusinessService();
    	
    	Matriz matriz = new Matriz(4);
        assertEquals("ERROR - UPDATE - Coordenada inexistente", service.execute("UPDATE 5 5 5 4", matriz.getMatriz3D()));
    }
    
    @Test
    public void testQuery() {
    	service = new BusinessService();
    	
    	Matriz matriz = new Matriz(4);
    	assertEquals("SUCCESS", service.execute("UPDATE 2 2 2 4", matriz.getMatriz3D()));
        assertEquals("SUCCESS / 4", service.execute("QUERY 1 1 1 3 3 3", matriz.getMatriz3D()));
    }
    
    @Test
    public void testQueryError() {
    	service = new BusinessService();
    	
    	Matriz matriz = new Matriz(4);
        assertEquals("ERROR - QUERY - Coordenada inexistente", service.execute("QUERY 2 2 2 5 5 5", matriz.getMatriz3D()));
    }

}

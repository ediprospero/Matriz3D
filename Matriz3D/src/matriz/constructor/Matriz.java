package matriz.constructor;

public class Matriz {
	
	private int cantLineas;
	private int matriz3D [][][];
	
	public Matriz(){
		
	}
	
	public Matriz(int cantLineas){
		   this.cantLineas = cantLineas;
		   this.matriz3D = new int [cantLineas] [cantLineas] [cantLineas]; 
	}

	public int getCantLineas() {
		return cantLineas;
	}

	public void setCantLineas(int cantLineas) {
		this.cantLineas = cantLineas;
	}

	public int[][][] getMatriz3D() {
		return matriz3D;
	}

	public void setMatriz3D(int[][][] matriz3d) {
		matriz3D = matriz3d;
	}

}

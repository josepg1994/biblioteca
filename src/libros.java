
public class libros {
	
		//atributos
		private String autor;
		private String nombre;
		private int ejemplares;
		private int ejemplaresp;
	public libros() {
		this("","",0,0);
	}
	public libros(String autor, String nombre,int ejemplares,int ejemplaresp) {
		this.autor = autor;
		this.nombre = nombre;
		this.ejemplares= ejemplares;
		this.ejemplaresp= ejemplaresp;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public boolean prestamo() {
		if(ejemplares>0) {
			ejemplares --;
			ejemplaresp++;
			return true;
		}
		else {
		return false;
		}
		

	}
	public boolean devolucion() {
		if(ejemplaresp!=0) {
			ejemplares ++;
			ejemplaresp--;
			return true;
		}
		else {
		return false;
		}
	}
	public String ToString() {
		return "autor: "+autor+" libro:"+nombre+"  ejemplares disponibles: "+ejemplares+" ejemplares prestados: "+ejemplaresp;
	}
}


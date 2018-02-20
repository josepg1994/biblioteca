
public class biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				libros r1 = new libros();
				libros r2 = new libros();
				r1.setAutor("Miguel de Cervantes");
				r1.setNombre("El Quijote de La Mancha");
				r1.setEjemplares(2);
				r1.prestamo();
				System.out.println(r1.ToString());
				r1.devolucion();
		System.out.println(r1.ToString());
		r2.setAutor("Arturo Pérez Reverte.");
		r2.setNombre("El Capitán Alatriste.");
		r2.setEjemplares(1);
		r2.prestamo();
		System.out.println(r2.ToString());
		r2.devolucion();
		System.out.println(r2.ToString());
			}

		
	}



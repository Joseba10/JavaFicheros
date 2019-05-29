package Modelo;

public class Empleado {

	
	private int codEmpleado;
	private String nombre;
	private String apellido;
	
	
	public Empleado(int codEmpleado, String nombre, String apellido) {
		
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	//Metodos Setter y Getter
	public int getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado " + codEmpleado + " Nombre: " + nombre + " Apellido: " + apellido;
	}

	
}

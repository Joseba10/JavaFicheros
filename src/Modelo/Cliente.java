package Modelo;
public class Cliente {

	private int codCliente;
	private Empleado codEmpleado;
	private String nombre;
	
		
	
	public Cliente(int codCliente, Empleado codEmpleado, String nombre) {
		super();
		this.codCliente = codCliente;
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
	}
	
	
	//Metodos Getter y Setter
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public Empleado getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(Empleado codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

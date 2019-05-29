package Modelo;

public class Pedido {
	
	private int codPedido;
	private Cliente codCliente;
	private double detalle;
	
	
	public Pedido(int codPedido, Cliente codCliente, double detalle) {
	
		this.codPedido = codPedido;
		this.codCliente = codCliente;
		this.detalle = detalle;
	}
	
	//Metodos Getter y Setters
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}
	public Cliente getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Cliente codCliente) {
		this.codCliente = codCliente;
	}
	public double getDetalle() {
		return detalle;
	}
	public void setDetalle(double detalle) {
		this.detalle = detalle;
	}
	
	

}

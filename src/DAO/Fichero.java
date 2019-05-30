package DAO;

import java.io.FileWriter;

import Modelo.Empleado;

public class Fichero {
	
	
	public static void main(String[] args) {
		
		
		final String RUTA= "/Users/curso/Desktop/";
		final String EMPLEADOS= "empleados.txt";
		final String CLIENTES= "clientes.txt";
		final String PEDIDOS= "pedidos.txt";
		
		
		
		Empleado Empleado = new Empleado(1, "Ricardo", "Diaz");
		//Cliente cliente= new Cliente(1, empleado.getCodEmpleado(), "Ricardo");
		
		String texto= Empleado.toString();

	
		
		
		try {
			FileWriter archivo= new FileWriter(RUTA+EMPLEADOS);
			archivo.write(texto);
			System.out.println("Archivo escrito");
			archivo.close();
			
		} catch (Exception e) {
			System.out.println("Archivo no escrito");
		}


//	public  Agregar() {
//	}
//
//	public  Modificar() {
//	}
//
//	public  Eliminar() {
//	}

}
}

package DAO;

import java.io.FileWriter;

import Modelo.Cliente;
import Modelo.Empleado;

public class Fichero {
	
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado(1, "Ricardo", "Diaz");
		Cliente cliente= new Cliente(1, empleado.getCodEmpleado(), "Ricardo");
		
		String texto= empleado.toString();
		String ruta= "/Users/J/Desktop/java/";
		String empleados= "empleados.txt";
		String clienes= "clientes.txt";
		String pedidos= "pedidos.txt";
		
		
		try {
			FileWriter archivo= new FileWriter(ruta+empleados);
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

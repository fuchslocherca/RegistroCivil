package cl.inacap.registroCivilModel.dto;

public class Solicitud {
	private int rutCliente;
	private String nombreCliente;
	String[] tipo = {"Solicitud de C�dula de Identidad","Retiro de C�dula de Identidad","Solicitud de Certificado de Nacimiento",
			"Solicitud de Certificado de Defunci�n"};
	
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String[] getTipo() {
		return tipo;
	}
	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}
	}
	



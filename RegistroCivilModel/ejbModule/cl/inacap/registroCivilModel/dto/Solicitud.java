package cl.inacap.registroCivilModel.dto;

public class Solicitud {
	private int rutCliente;
	private String nombreCliente;
	String[] tipo = {"Solicitud de Cédula de Identidad","Retiro de Cédula de Identidad","Solicitud de Certificado de Nacimiento",
			"Solicitud de Certificado de Defunción"};
	
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
	



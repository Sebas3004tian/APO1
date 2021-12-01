package model;

public class MiniCuartos {
	private double valorAlquiler;
	private String numero;
	public MiniCuartos(double valorAlquiler,String numero) {
		this.valorAlquiler = valorAlquiler;
		this.numero = numero;
	}
	public double getValorAlquiler() {
		return valorAlquiler;
	}

	public void setValorAlquiler(double valorAlquiler) {
		this.valorAlquiler = valorAlquiler;
	}
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
package Clases;

import java.time.LocalDate;

public class Empleado {
	
	private String nombre;
	private String antiguedad;
	private double sueldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Empleado(String nombre, String antiguedad, double sueldo) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
	}
	public Empleado() {
		super();
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "]";
	}
	public double calcularSueldo() {
		
	}
}

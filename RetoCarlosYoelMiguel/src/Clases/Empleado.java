package Clases;

import java.time.LocalDate;

public class Empleado {
	
	private String nombre;
	private int antiguedad;
	private double sueldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
		this.sueldo = calcularSueldo();
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Empleado(String nombre, int antiguedad) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sueldo = calcularSueldo();
	}
	public Empleado() {
		super();
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "]";
	}
	public int calcularSueldo() {
        if (antiguedad < 5) {
            return 1000;
        } else if (antiguedad <= 10) {
            return 1200;
        } else {
            return 1500;
        }
	}

}

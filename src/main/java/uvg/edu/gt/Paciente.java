package uvg.edu.gt;

import java.util.Objects;

/**
 * Clase que representa un paciente en el sistema de atención médica.
 * Implementa la interfaz Comparable para comparar pacientes por su código de emergencia.
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigoEmergencia;

    /**
     * Constructor de la clase Paciente.
     * @param nombre Nombre del paciente.
     * @param sintoma Síntoma o descripción de la condición del paciente.
     * @param codigoEmergencia Código de emergencia asignado al paciente.
     */
    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return codigoEmergencia == paciente.codigoEmergencia &&
                Objects.equals(nombre, paciente.nombre) &&
                Objects.equals(sintoma, paciente.sintoma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sintoma, codigoEmergencia);
    }

    /**
     * Método que devuelve el código de emergencia del paciente.
     * @return El código de emergencia del paciente.
     */
    public char getCodigoEmergencia() {
        return codigoEmergencia;
    }

    @Override
    public int compareTo(Paciente otro) {
        return this.getCodigoEmergencia() - otro.getCodigoEmergencia();
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigoEmergencia;
    }
}
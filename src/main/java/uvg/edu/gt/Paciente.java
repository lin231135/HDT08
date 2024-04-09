package uvg.edu.gt;

import java.util.Objects;

// Clase Paciente que implementa la interfaz Comparable para comparar pacientes por su código de emergencia
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigoEmergencia;

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
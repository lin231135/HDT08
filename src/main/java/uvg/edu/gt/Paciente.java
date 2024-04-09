// Clase Paciente que implementa la interfaz Comparable para comparar pacientes por su código de emergencia
class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigoEmergencia;

    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
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
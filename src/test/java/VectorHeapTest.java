import static org.junit.Assert.*;
import org.junit.Test;
import uvg.edu.gt.VectorHeap;
import uvg.edu.gt.Paciente; 

/**
 * Clase de prueba para la clase VectorHeap.
 */
public class VectorHeapTest {

    /**
     * Prueba para el método add de VectorHeap.
     */
    @Test
    public void testAdd() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(new Paciente("Juan", "Fiebre", 'A'));
        heap.add(new Paciente("Maria", "Dolor de cabeza", 'B'));
        heap.add(new Paciente("Pedro", "Fractura", 'C'));

        assertEquals(3, heap.size());
        assertEquals(new Paciente("Juan", "Fiebre", 'A'), heap.getFirst());
    }

    /**
     * Prueba para el método remove de VectorHeap.
     */
    @Test
    public void testRemove() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(new Paciente("Juan", "Fiebre", 'A'));
        heap.add(new Paciente("Maria", "Dolor de cabeza", 'B'));
        heap.add(new Paciente("Pedro", "Fractura", 'C'));

        assertEquals(3, heap.size());
        assertEquals(new Paciente("Juan", "Fiebre", 'A'), heap.remove());
        assertEquals(2, heap.size());
        assertEquals(new Paciente("Maria", "Dolor de cabeza", 'B'), heap.getFirst());
    }
}
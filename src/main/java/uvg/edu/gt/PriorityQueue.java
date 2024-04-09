package uvg.edu.gt;

/**
 * Interfaz que define el comportamiento de una cola de prioridad.
 * @param <E> El tipo de elementos que se almacenarán en la cola de prioridad.
 */
interface PriorityQueue<E extends Comparable<E>> {

    /**
     * Agrega un elemento a la cola de prioridad.
     * @param value El elemento a agregar.
     */
    public void add(E value);

    /**
     * Elimina y devuelve el elemento de mayor prioridad de la cola.
     * @return El elemento de mayor prioridad.
     */
    public E remove();

    /**
     * Obtiene el elemento de mayor prioridad sin eliminarlo de la cola.
     * @return El elemento de mayor prioridad.
     */
    public E getFirst();

    /**
     * Verifica si la cola de prioridad está vacía.
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    public boolean isEmpty();

    /**
     * Obtiene el número de elementos en la cola de prioridad.
     * @return El número de elementos en la cola de prioridad.
     */
    public int size();

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    public void clear();
}
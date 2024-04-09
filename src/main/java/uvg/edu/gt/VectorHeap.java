package uvg.edu.gt;

import java.util.Vector;

/**
 * Implementación de una cola de prioridad utilizando un vector como estructura subyacente.
 * @param <E> El tipo de elementos que se almacenarán en la cola de prioridad.
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    private Vector<E> data;

    /**
     * Constructor que inicializa un VectorHeap vacío.
     */
    public VectorHeap() {
        data = new Vector<E>();
    }

    /**
     * Constructor que inicializa un VectorHeap a partir de un vector dado.
     * @param v El vector del cual se inicializa el VectorHeap.
     */
    public VectorHeap(Vector<E> v) {
        int i;
        data = new Vector<E>(v.size());
        for (i = 0; i < v.size(); i++) {
            add(v.get(i));
        }
    }

    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    protected static int left(int i) {
        return 2 * i + 1;
    }

    protected static int right(int i) {
        return (2 * i + 1) + 1;
    }

    protected void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    /**
     * Agrega un elemento a la cola de prioridad.
     * @param value El elemento a agregar.
     */
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) && ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) {
                    childpos++;
                }
                if ((data.get(childpos)).compareTo(value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root, value);
                    return;
                }
            } else {
                data.set(root, value);
                return;
            }
        }
    }

    /**
     * Elimina y devuelve el elemento de mayor prioridad de la cola.
     * @return El elemento de mayor prioridad.
     */
    public E remove() {
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) {
            pushDownRoot(0);
        }
        return minVal;
    }

    /**
     * Obtiene el elemento de mayor prioridad sin eliminarlo de la cola.
     * @return El elemento de mayor prioridad.
     */
    public E getFirst() {
        return data.get(0);
    }

    /**
     * Verifica si la cola de prioridad está vacía.
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Obtiene el número de elementos en la cola de prioridad.
     * @return El número de elementos en la cola de prioridad.
     */
    public int size() {
        return data.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    public void clear() {
        data.clear();
    }
}
public class PilaDinamica {

    // Nodo interno para manejar los enlaces
    private static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cima;

    // Constructor
    public PilaDinamica() {
        this.cima = null; // Pila vacía al inicio
    }

    // Insertar un nodo en la cima
    public void push(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("-> Nodo agregado a la cima (dinámica): " + x);
    }

    // Extraer el nodo de la cima
    public void pop() {
        if (isEmpty()) {
            System.out.println("Subdesbordamiento: La pila dinámica está vacía.");
            return;
        }
        System.out.println("<- Nodo eliminado de la cima (dinámica): " + cima.dato);
        cima = cima.siguiente;
    }

    // Recorrer e imprimir los elementos
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("[Pila Dinámica] La pila está vacía.");
            return;
        }
        System.out.println("--- Estado de la Pila Dinámica (Cima a Fondo) ---");
        Nodo actual = cima;
        while (actual != null) {
            System.out.println("| " + actual.dato + " |");
            actual = actual.siguiente;
        }
        System.out.println("------------------------------------------------");
    }

    // Verificar si la cima no contiene nodos
    public boolean isEmpty() {
        return cima == null;
    }

    // Consultar el valor en la cima sin desvincular el nodo
    public void peek() {
        if (isEmpty()) {
            System.out.println("La pila dinámica está vacía, no hay cima.");
            return;
        }
        System.out.println("[Peek] Valor actual en la cima (dinámica): " + cima.dato);
    }
}
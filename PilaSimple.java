public class PilaSimple {
    private int[] datos;
    private int tope;
    private int capacidad;

    // Constructor
    public PilaSimple(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.tope = -1; // Empieza vacía
    }

    // Insertar elemento controlando desbordamiento
    public void push(int x) {
        if (isFull()) {
            System.out.println("Desbordamiento (StackOverflow): La pila está llena, no se puede insertar " + x);
            return;
        }
        tope++;
        datos[tope] = x;
        System.out.println("-> Insertado en pila estática: " + x);
    }

    // Extraer elemento controlando subdesbordamiento
    public void pop() {
        if (isEmpty()) {
            System.out.println("Subdesbordamiento (StackUnderflow): La pila está vacía.");
            return;
        }
        System.out.println("<- Eliminado de la cima (estática): " + datos[tope]);
        tope--;
    }

    // Mostrar contenido de la pila
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("[Pila Estática] La pila está vacía.");
            return;
        }
        System.out.println("--- Estado de la Pila Estática (Tope a Base) ---");
        for (int i = tope; i >= 0; i--) {
            System.out.println("| " + datos[i] + " |");
        }
        System.out.println("----------------------------------------------");
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // Verificar si el arreglo alcanzó su límite
    public boolean isFull() {
        return tope == datos.length - 1;
    }

    // Consultar el elemento en el tope sin eliminarlo
    public void peek() {
        if (isEmpty()) {
            System.out.println("La pila estática está vacía, no hay elemento en la cima.");
            return;
        }
        System.out.println("[Peek] Elemento actual en la cima (estática): " + datos[tope]);
    }
}
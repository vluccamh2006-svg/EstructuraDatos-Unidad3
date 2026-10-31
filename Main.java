public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE PILA ESTÁTICA (Capacidad: 3) ===");
        PilaSimple pilaEstatica = new PilaSimple(3);

        pilaEstatica.push(10);
        pilaEstatica.push(20);
        pilaEstatica.peek();
        pilaEstatica.mostrar();

        pilaEstatica.push(30);
        // Intentamos meter uno extra para probar el desbordamiento (isFull)
        pilaEstatica.push(40);

        pilaEstatica.mostrar();
        pilaEstatica.pop();
        pilaEstatica.mostrar();

        System.out.println("\n=== PRUEBA DE PILA DINÁMICA ===");
        PilaDinamica pilaDinamica = new PilaDinamica();

        pilaDinamica.push(100);
        pilaDinamica.push(200);
        pilaDinamica.peek();
        pilaDinamica.mostrar();

        pilaDinamica.pop();
        pilaDinamica.mostrar();
    }
}
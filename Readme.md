# Práctica 3: Pilas Estáticas y Dinámicas en Java

Hola profe, aquí le dejo la práctica de la unidad 3 sobre la implementación de pilas (tanto con arreglos estáticos como con nodos dinámicos).

---

## ¿Qué onda con esto? (Breve explicación)

Las pilas funcionan bajo la lógica **LIFO** (*Last In, First Out*), o sea, el último elemento que metes es el primero en salir, como una torre de platos.

* **Pila Estática (`PilaSimple.java`):** Se arma usando un arreglo de tamaño fijo. Le ponemos un límite y si te pasas intentando meter más datos cuando ya está llena, te salta el aviso de desbordamiento (*StackOverflow*).
* **Pila Dinámica (`PilaDinamica.java`):** Esta jala con nodos enlazados. No tiene un límite fijo de tamaño, así que se va adaptando conforme le metes o le quitas elementos, dependiendo totalmente de la memoria disponible.

---

## ¿Cómo correrlo?

Si lo tienes clonado o abierto en tu compu (en IntelliJ IDEA):
1. Abre el proyecto completo en tu IDE.
2. Asegúrate de tener los archivos `PilaSimple.java`, `PilaDinamica.java` y `Main.java` dentro de la carpeta `src`.
3. Dale clic al botón de Play (`Run`) en la clase **`Main.java`** y listo, la consola te imprimirá toda la prueba de cajón.

---

## Ejemplo de cómo sale en consola

Así se ve cuando corre el programa con las pruebas que armé:

```text
=== PRUEBA DE PILA ESTÁTICA (Capacidad: 3) ===
-> Insertado en pila estática: 10
-> Insertado en pila estática: 20
[Peek] Elemento actual en la cima (estática): 20
--- Estado de la Pila Estática (Tope a Base) ---
| 20 |
| 10 |
----------------------------------------------
-> Insertado en pila estática: 30
Desbordamiento (StackOverflow): La pila está llena, no se puede insertar 40
<- Eliminado de la cima (estática): 30
--- Estado de la Pila Estática (Tope a Base) ---
| 20 |
| 10 |
----------------------------------------------

=== PRUEBA DE PILA DINÁMICA ===
-> Nodo agregado a la cima (dinámica): 100
-> Nodo agregado a la cima (dinámica): 200
[Peek] Valor actual en la cima (dinámica): 200
--- Estado de la Pila Dinámica (Cima a Fondo) ---
| 200 |
| 100 |
------------------------------------------------
<- Nodo eliminado de la cima (dinámica): 200
--- Estado de la Pila Dinámica (Cima a Fondo) ---
| 100 |
------------------------------------------------
Aquí tienes, en corto:

- **Ej. 1 — TreeSet:** guarda productos ordenados por código automáticamente; busca uno por código con recorrido lineal.
- **Ej. 2 — Stack homogénea:** una pila que solo deja apilar un objeto si es del mismo tipo exacto que el que está en la cima.
- **Ej. 3 — LinkedHashSet + Iterator:** guarda elementos sin duplicados, conservando el orden en que llegaron, y se recorre con un Iterator.
- **Ej. 4 — PriorityQueue de tareas:** atiende primero las tareas más importantes; si hay empate, gana la que llegó antes.
- **Ej. 6 — ArrayList (inventario):** agrega, elimina agotados, busca por código/nombre y lista ordenado por nombre o precio, sin duplicar códigos.
- **Ej. 7 — LinkedList (cola de banco):** los clientes normales entran al final, se atiende al del frente, y los urgentes se cuelan al inicio sin mover a los demás.
- **Ej. 10 — HashSet (control de acceso):** registra IDs únicos y verifica si un ID puede ingresar o no.
- **Ej. 11 — LinkedHashSet (favoritos):** igual que el 10, pero recordando el orden en que se marcaron como favoritas.
- **Ej. 13 — PriorityQueue (triage):** como el 4, pero permite que la urgencia de un paciente cambie mientras espera, reinsertándolo para reordenar.
- **Ej. 15 — HashMap (directorio):** asocia nombre → teléfono, evita nombres duplicados y permite buscar/actualizar rápido.

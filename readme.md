# Juego de BlackJack

## Distintos objetos identificados:
1. Carta: es un objeto con tres atributos: nombre, palo y representación gráfica. Crear dos Sets uno con nombres y otro palos, con el producto cartesiano se genera la baraja entera. Los valores se escriben en una función auxiliar y solo nos interesa desde la clase de mano. Hay problemas con el unicode y las terminales así que usaremos letras para los palos T (tréboles) P (picas) D (diamantes) C (corazones). Métodos: imprimir carta, obtener los atributos de cada una.
1. Baraja: array de 52 cartas, el método de crear la baraja crea todos los objetos carta y así serán únicos. Incluye un método para mezclarlas.
1. Mano: recibe cartas de la baraja, sus atributos son: array de cartas, y sí son visibles o no (no sé si esto es propio de la carta o de la mano solo del Crupier). Incluye métodos para añadir o quitar una carta (cuando acaba el turno), calcula la puntuación del jugador y del crupier y calcula el valor del as si se pasa de 21.
1. Persona que puede ser jugador o Crupier, la persona tiene mano y sumatorio de puntos
    1. Jugador: Atributo dinero y método para apostar
    1. Crupier: sus puntos están ocultos y una de las cartas también. Gestiona la baraja: método para repartir las cartas.


## Tareas
[x]Crear la carta y sus atributos

[x]Crear la baraja y sus atributos

[]Crear la mano y sus atributos

[]Crear la persona y sus atributos

[]Crear el jugador y sus atributos

[]Crear el croupier y sus atributos

[]Crear el programa main
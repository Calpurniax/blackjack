# Juego de BlackJack

## Distintos objetos identificados:
1. Carta: es el un objeto con dos atributos: nombre palo y representación gráfica. Crear dos Sets uno con nombres y otro palos, con el producto cartesiano se genera la representación gráfica. Los valores se escriben en una función auxiliar.
1. Baraja: tiene 52 cartas, podemos crear la baraja siendo un array de las 52 cartas pero tenemos que conseguir que sean únicas. Incluye un método para mezclarlas.
1. Mano: recibe cartas de la baraja, sus atributos son: número de cartas y sí son visibles o no (no sé si esto es propio de la carta o de la mano solo del Croupier). Incluye métodos para añadir o quitar una carta (cuando acaba el turno)
1. Persona que puede ser jugador o Croupier, la persona tiene mano y sumatorio de puntos
    1. Jugador: Atributo dinero y método para apostar
    1. Croupier: sus puntos están ocultos y una de las cartas también. Gestiona la baraja. 
1. El método para calcular cuanto vale el as sería en la función que calcula los puntos. Si te pasas chequea si hay un as.

## Tareas
[]Crear la carta y sus atributos
[x]Crear la baraja y sus atributos
[]Crear la mano y sus atributos
[]Crear la persona y sus atributos
[]Crear el jugador y sus atributos
[]Crear el croupier y sus atributos
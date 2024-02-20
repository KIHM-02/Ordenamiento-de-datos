# Ordenamiento-de-datos
Aqui se podrá ver el ordenamiento de datos de un arreglo en java

## ¿Qué es un método de ordenamiento?
Es aquel que nos permite como dice su nombre, ordenar los datos ya sea de menor a mayor o viceversa. Existen multiples tipos de metodos para ordenar los datos, en este repositorio estaremos viendo el metodo burbuja (bubble), seleccion (selection) y el insercion (insertion). Nota por lo general se utilizan variables temporales o auxiliares para guardar temporalmente un elemento del arreglo para posteriormente moverlo a la posición requerida.

## Numero 1: Bubble Sort (Ordenamiento burbuja)
Este método se centra en analizar un arreglo de datos, donde en el peor de los casos, necesitaremos recorrer todo el arreglo en busqueda de ordenar los datos. Para poder ordenarlos es necesario ir comparando en parejas, es decir, cada dos datos debemos ir analziando cual es mayor con respecto al menor para colocarlo en un sentido menor-mayor.
Es decir:

### 4 5 1 3 2
### 1 2 3 4 5

## Numero 2: Selection Sort (Ordenamiento selección)
De manera similar al bubble, con este analizaremos dos elementos buscando el menor, sin embargo, este metodo se identifica por ir buscando posicion por posicion cual es el elemento menor del arreglo para ir colocandolo en la parte inicial del mismo, cada que se coloque un dato al inicio, este ira recorriendo su posicion de inicio hasta llegar al final del arreglo.
Es decir:

### 4 5 1 3 2
Tenemos que 1 es el menor, entonces guardamos el 1 en el auxiliar y colocamos el 4 en la posicion del 1, y el 1 en donde estabe el 4, quedando asi:
### 1 5 4 3 2
Repetimos proceso pero ahora con el 5 (ya que ese sera el nuevo inicio) y el 2, quedando asi:
### 1 2 4 3 5
Y seguimos este proceso hasta llegar a ordenar el dato.

## Numero 3: Insertion Sort (Ordenamiento de inserción)
Este asi como los anteriores, busca colocar el menor al principio. Para ello compara el menor elemento con todo el conjunto de valores anteriores al valor comparado (el cual siempre se guarda en un auxiliar), si el valor auxiliar es menor al valor anterior del arreglo (y asi hasta que llegue al inicio) entonces se estaran moviendo una casilla más. Quedando el auxiliar en el lugar adecuado.

# Tamagotchi                                       
![Logo](https://user-images.githubusercontent.com/39106189/224465594-6f844a43-7fa9-42f0-9c55-bd50052b0b33.PNG)

**1.**

**a.** Modelar una mascota virtual, onda Tamagotchi, incluyendo los mensajes correspondientes a las acciones de comer y jugar, y la pregunta acerca de si puede jugar o no.

**b.** También hay que poder conocer el nivel de una mascota, que es un número entero mayor o igual que 0, donde a mayor nivel, más capa es.

Una mascota puede estar aburrida, hambrienta o contenta; y su comportamiento depende de en qué estado esté.

**Veamos:**

Cuando una mascota come, pasa lo siguiente:

- Si está hambrienta, se pone contenta.
- Si está contenta, su nivel se incrementa en una unidad.
- Si está aburrida, y hace más de 80 minutos que está aburrida, entonces se pone contenta.
- Si está aburrida desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.

Cuando una mascota juega, pasa lo siguiente:

- Si está contenta, su nivel se incrementa en dos unidades.
- Si está aburrida, se pone contenta.
- No produce ningún efecto jugar con la mascota si esta hambrienta.
- Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.


**NO SE PUEDE CONSULTAR DE NINGUNA MANERA EL ESTADO ACTUAL DE LA MASCOTA.
Esto quiere decir que está prohibido hacer comparaciones del tipo estado = ‘contento’ o cualquiera similar utilizando mensajes como estasAburrida.**

**2.**

Al finalizar el ejercicio debe haber como mínimo un test unitario por cada posibilidad:
cuando come y cuando juega en cada humor posible. En otras palabras, todo el funcionamiento declarado en el punto 1 debe estar cubierto por pruebas unitarias. Sólo
acá está permitido preguntar por su estado actual.

**3.** 

Indique en palabras los pasos necesarios para incorporar un nuevo estado “Triste” en la mascota, de manera que quede listo para funcionar.

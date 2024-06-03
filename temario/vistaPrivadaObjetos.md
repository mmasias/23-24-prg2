# Vista privada de objetos

## Desencadenamiento de instanciaciones

Se crea un objeto (instancia), por lo que:

- Se crean los atributos definidos en la clase;
- Se ejecuta la inicialización de los atributos con posibles creaciones de nuevos objetos;
- Se ejecuta el constructor en la creación del objeto con posibles creaciones de nuevos objetos;

Y, recursivamente, se pueden crear nuevos objetos de otras clases hasta llegar, de esta manera, a la creación de objetos que se basan directamente en tipos primitivos.

## Desencadenamiento de mensajes

Se lanza un mensaje a un objeto, por lo que:

- Se crean las declaraciones locales con su inicialización y se ejecuta el cuerpo del método correspondiente

- Se pueden lanzar nuevos mensajes a objetos que sean atributos de su clase, a objetos que sean argumentos del mensaje o a objetos que se crean en su ejecución

Y, recursivamente, pueden lanzar nuevos mensajes en la definición de sus respectivos métodos hasta llegar, de esta manera, a la definición de métodos que se basan directamente en tipos primitivos.

|El desencadenamiento de instanciaciones|El desencadenamiento de mensajes|
|-|-|
|Puede provocar un desencadenamiento de mensajes a través de la ejecución de los constructores que pueden lanzar mensajes|Puede provocar un desencadenamiento de instanciaciones a través de la creación de objetos en la definición de los métodos.


# Reto CCCF

##### Características del Centro Comercial:
- Horario de atención: 9 AM a 9 PM.
- Probabilidad de llegada de un nuevo cliente: 60% por minuto.
- Cantidad de cajas disponibles: 4.
- Packs de items por cliente: 5 a 15.
- Tiempo de atención por pack de items: 1 minuto.

#### Funcionamiento del Sistema de Colas:
- Los clientes se añaden a la cola conforme terminan sus compras.
- Una caja libre puede atender a un nuevo cliente inmediatamente.
- Las cajas atienden un pack de items por minuto.

#### Requerimientos del Programa de Simulación:
El programa debe simular el flujo del centro comercial y proporcionar en tiempo real:
- La llegada de clientes nuevos.
- El número actual de personas en cola.
- El estado de cada caja (libre u ocupada atendiendo a un cliente).

El objetivo del programa es modelar el sistema de colas y procesos de atención a clientes en el centro comercial bajo las condiciones dadas.


## Modelo del Dominio

#### En este documento se describe los objetos principales de nuestrio dominio: Centro comercial, fila, clientes y caja.

### Índice 
1. [**Diagrama de Clases**](#diagrama-de-clases-vocabulario)
2. [**Diagrama de Objetos**](#diagrama-de-objetos-estado-intermedio)
3. [**Diagrama de Estados**](#diagrama-de-estados-instrucciones)

-----
## Diagrama de Clases (Vocabulario)
#### El Diagrama de Clases define entidades y relaciones

<div align=center>

![](/entregas//camilaPalma//reto-001/images/UML/diagrama_de_clases.svg)

[Código PUML](/entregas//camilaPalma/reto-001/docs/class.mdd.puml)
</div>

------
## Diagrama de Objetos (Estado intermedio)

<div align=center>

![](/entregas//camilaPalma//reto-001/images/UML/obj.mdd.svg)

[Código PUML](/entregas//camilaPalma/reto-001/docs/obj.mdd.puml)
</div>

------
## Diagrama de Estados (Instrucciones)

<div align=center>

![](/entregas//camilaPalma//reto-001/images/UML/states.mdd.svg)

[Código PUML](/entregas//camilaPalma/reto-001/docs/states.mdd.puml)
</div>
# Introducción

## ¿Por qué?

- [Limitaciones](https://docs.google.com/presentation/d/1FBjSPhSYrgBQjVp8HefkiJA_AwJU_bq24b8WMz3xzOA/edit?usp=sharing)
- Equilibrio entre **procesos** y **datos**, aplicando un **enfoque antropomórfico**.

|*X es bueno; Orientado a objetos es bueno; ergo X es Orientado a objetos*|*Mi conjetura es que la orientación a objetos será en los 80 lo que la programación estructurada en los 70. Todo el mundo estará a favor suyo. Cada productor prometerá que sus productos lo soportan. Cada director pagará con la boca pequeña el servirlo. Cada programador lo practicará. Y nadie sabrá exactamente lo que es*|
|-|-|
|Stoupstrup, 88|Rentsch, 82|

## ¿Qué?

### Sistema

Un sistema es un conjunto de componentes interactuando o interdependientes formando un todo integrado. Cada sistema está delimitado por sus límites espacio/temporales e influenciado por su entorno, descrito por su estructura y propósito y expresado en su funcionamiento

### Sistema complejo

Un Sistema complejo es aquel cuya complejidad excede la capacidad intelectual humana — [Grady Booch](https://es.wikipedia.org/wiki/Grady_Booch)

Sistema|conjunto de componentes interactuando o interdependientes formando un todo integrado|delimitado por sus límites espacio / temporales|e influenciado por su entorno,|descrito por su estructura|y propósito|y expresado en su funcionamiento.
|-|-|-|-|-|-|-|
Sistema respiratorio|Nariz, laringe, faringe, traquea, pulmones, alveolos, …​|fechas y lugares de la vida del ser vivo que contiene el sistema respiratorio|lo que respira: aire limpio vs contaminado, …​|la nariz se conecta con la laringe, la laringe con la traquea, …​|inyectar oxigeno al sistema circulatorio extrayendo monóxido de carbono, …​|inspiración y expiración|
Película de amor|personajes|fechas y lugares de los personajes|la sociedad, las familias, una ex-pareja, …​|argumento que relaciona los personajes de la historia|transmitir emociones|reproducción de la película|
Números romanos|I, V, X, L, C, D y M|fechas y lugar donde estén escritos|en desuso en favor de sistemas de numeración poscionales (indo-arábigo, maya, chino, …​) mucho más efectivos|grupos de máximo 3 elementos consecutivos, grupo con elemento y opcionalmente un elemento inferido prefijo o sufijo, …|registrar información cuantitativa|suma, resta, producto, división, …​ con información cuantitativa registrada|
Semáforo|Rojo, verde y amarillo|fechas y lugar de la instalación del semáforo|fuente de energía, climatología, vándalos, artistas, …​|de rojo a verde, de verda a amarillo y de amarillo a verdo y/o rojo, …​|controlar el tráfico|luces con alimentación eléctrica|
Cadena de suministro|Proveedores, transportistas, almacenes, distribuidores, puntos de venta|Desde la adquisición de materias primas hasta la entrega del producto final al consumidor|Demandas del mercado, regulaciones gubernamentales, relaciones con proveedores, …​|Flujo de información, productos y finanzas a través de los diferentes eslabones|Optimizar la entrega de bienes y servicios desde el proveedor hasta el cliente final|Planificación, implementación y control del flujo de mercancías|
Sistema de manufactura|Maquinaria, operarios, materia prima, procesos de producción|En la planta de producción donde se fabrican los productos|Tecnología disponible, normativas de seguridad y salud, demanda del producto, …​|Secuencia de operaciones y procesos para transformar materias primas en productos finales|Producir bienes de calidad de manera eficiente y segura|Conversión de materias primas en productos finales mediante procesos como mecanizado, ensamblaje, …​|
Lápiz|Cuerpo, mina de grafito, goma de borrar (opcional)|En el momento y lugar de su uso|Preferencias del usuario, desgaste físico|El grafito está encerrado dentro del cuerpo del lápiz. La goma de borrar, si está presente, se encuentra en el extremo opuesto.|Escribir o dibujar sobre papel|La mina de grafito deja una marca sobre el papel cuando es presionada contra este.

<details><sumary>No obstante</sumary>Un lápiz **no se considera un sistema complejo** debido a su simplicidad en términos de interacciones, predictibilidad de su comportamiento y falta de adaptabilidad o emergencia de propiedades nuevas que no son atribuibles a sus componentes individuales</details>

## ¿Para qué?

### Efectividad

|||
|-|-|
|![](/images/modelosUML/plantUML/efectividad.svg)|**Eficacia**, alto cumplimiento de objetivos frente a incumplimientos por errores, desmotivación, cansancio,…​<br>​<br>**Eficiencia**, bajo consumo de recursos (tiempo, energía, espacio, …​) frente a consumos disparatados comparado con otras soluciones<br><br>**Efectividad** es un equilibrio, un compromiso entre ambas.

```
+-------------+----------------------+----------------------------+
|             |       +              |             +              |
|             | (A) EFICAZ e         | (B) EFICAZ y               |
|             |     INEFICIENTE      |     EFICIENTE              |
|      +      |                      |                            |
|             | Haber alcanzado los  | Haber alcanzado los retos  |
|      E      | retos sin cumplir    | con los recursos dispuestos|
|      F      | con las pautas       |                            |
|      I      +----------------------+----------------------------+
|      C      |       -              |             -              |
|      A      | (C) INEFICAZ e       | (D) INEFICAZ y             |
|      C      |     INEFICIENTE      |     EFICIENTE              |
|      I      |                      |                            |
|      A      | Haber fracasado en   | Haber utilizado bien los   |
|             | el cumplimiento de   | recursos disponibles sin   |
|      -      | objetivos pese a     | alcanzar retos             |
|             | extralimitar el uso  |                            |
|             | de los medios        |                            |
+-------------+----------------------+----------------------------+
| EFECTIVIDAD |         -        EFICIENCIA        +              |
+-------------+----------------------+----------------------------+
```

#### Comprar el pan

||Eficiente|Ineficiente|
|-|-|-|
**Eficaz**|Trae el pan en cinco minutos y devuelve el cambio|Trae el pan en 20 minutos y no devuelve el cambio
**Ineficaz**|Trae el pan pero no la cantidad, tipos, …​ oportunos en cinco minutos y devuelve la vuelta|Trae el pan pero no la cantidad, tipos, …​ oportunos en 20 minutos y no devuelve la vuelta

#### Preparar un reporte financiero

||Eficiente|Ineficiente|
|-|-|-|
**Eficaz**|Entrega el reporte completo y correcto antes de la fecha límite, utilizando menos horas de trabajo de las presupuestadas.|Entrega el reporte completo y correcto, pero toma más tiempo del esperado y consume recursos adicionales.
**Ineficaz**|Entrega el reporte antes de la fecha límite, pero el reporte contiene errores o le falta información importante.|Entrega el reporte después de la fecha límite y, además, el reporte contiene errores o carece de información relevante.

#### Sprint con funcionalidad nueva

||Eficiente|Ineficiente|
|-|-|-|
**Eficaz**|Se lanza la nueva función con todas las características solicitadas, sin errores, y dentro del tiempo y presupuesto asignados.|Se lanza la nueva función con todas las características solicitadas, pero excediendo el tiempo y presupuesto asignados.
**Ineficaz**|Se lanza la nueva función rápidamente y dentro del presupuesto, pero carece de algunas características clave o tiene errores significativos.|Se lanza la nueva función tarde, excediendo el presupuesto, y además, carece de características importantes o tiene errores significativos.

#### Optimización de línea de ensamblaje

||Eficiente|Ineficiente|
|-|-|-|
**Eficaz**|Reorganización de la línea de ensamblaje que aumenta la producción manteniendo la calidad, utilizando menos recursos de los proyectados.|Reorganización de la línea de ensamblaje que aumenta la producción y mantiene la calidad, pero utilizando más recursos y tiempo del proyectado.
**Ineficaz**|Cambios en la línea de ensamblaje realizados rápidamente y con bajo costo, pero que resultan en una disminución de la calidad o de la producción.|Cambios en la línea de ensamblaje que consumen recursos y tiempo sin lograr aumentar la producción ni mejorar la calidad.

---
|Las personas|
|-|
No son efectivas con tamaños elevados de elementos a gestionar por imposibilidad, agotamiento, desmotivación, distracción, …​
No son eficaces por errores (¿nunca te has equivocado?, …​)
No son eficientes por consumo de tiempo (calcula los primos del primer billón, a relación de un segundo por cálculo de si un número es primo, no hay segundos en la vida de una persona, …​)
No son eficiente por consumo de espacio (calcula con lapiz y papel los posibles caminos entre todas las poblaciones de tu tierra natal, suponiendo que habrá miles, no hay hojas en el planeta, …​)

## ¿Cómo?

### Características de los sistemas complejos

|Característica|Descripción|
|-|-|
Estructura jerárquica|Frecuentemente, la complejidad adquiere una forma jerárquica donde el sistema complejo está compuesto de subsistemas interrelacionados que a su vez tienen sus propios subsistemas y así hasta que se alcanza algún elemento del más bajo nivel.|**Organismos vivos**: Los seres humanos tienen sistemas (circulatorio, respiratorio, etc.), que a su vez tienen órganos, tejidos, células, orgánulos, y así sucesivamente.
Patrones comunes|Los sistemas jerárquicos se componen generalmente de sólo unos pocos tipos diferentes de subsistemas en varias combinaciones y órdenes.
Separación de asuntos|Las intra-conexiones de componentes son más fuertes que las inter-conexiones de componentes. Este hecho tiene el efecto de separar los componentes con dinámica de alta frecuencia (involucrando la interacción entre componentes) de los de dinámica de baja frecuencia. En términos sencillos, hay una clara separación de asuntos entre las partes de diferentes niveles de abstracción
Elementos primitivos relativos|La elección de qué componentes en un sistema son primitivos es relativamente arbritraria y mayormente está a discrección del observador del sistema
Formas intermedias estables|Un sistema complejo que funciona invariablemente se encuentra que ha evolucionado a partir de un sistema sencillo que funcionó. Un sistema complejo diseñado desde cero no funciona y no puede ser remendado para hacer que funcione. Usted tiene que comenzar de nuevo, a partir de un sistema sencillo de trabajo

|Característica|Ejemplo|Ejemplo|Ejemplo
|-|-|-|-|
Estructura jerárquica|**Organización empresarial**: Una empresa grande tiene divisiones (finanzas, operaciones, recursos humanos, etc.), que a su vez pueden tener departamentos, equipos, y roles individuales.|Sistemas operativos: Un sistema operativo se compone de varias capas de abstracción, desde el núcleo (kernel) que interactúa directamente con el hardware, hasta el sistema de archivos, los controladores de dispositivos, y la interfaz de usuario.|Plantas de manufactura y líneas de producción: Una planta de manufactura puede ser vista como un sistema compuesto por diversas líneas de producción (subsistemas), cada una dedicada a la fabricación de partes específicas o al ensamblaje de productos. Dentro de cada línea de producción, encontramos máquinas y estaciones de trabajo
Patrones comunes|Estructuras organizacionales: Muchas empresas adoptan estructuras organizativas comunes, como la matriz o la jerárquica, que se repiten en diferentes sectores y tamaños de empresa.|Software modular: Muchos programas de software están construidos usando patrones de diseño repetitivos que se aplican a diferentes módulos o componentes.|Sistemas de gestión de calidad: como ISO 9001 que se implementan en varios niveles de la organización, utilizando un conjunto común de procesos y procedimientos para asegurar la calidad del producto a través de diferentes departamentos y funciones.
Separación de asuntos|Departamentos especializados en una empresa: Cada departamento se enfoca en tareas específicas (ej., marketing, finanzas) con fuertes conexiones internas, mientras que la interacción entre departamentos se gestiona a través de procesos definidos.|Arquitectura de microservicios: Cada microservicio se enfoca en una funcionalidad específica y se comunica con otros microservicios a través de APIs bien definidas.|Departamentos de ingeniería y producción: La ingeniería se enfoca en el diseño y mejora de productos y procesos, mientras que la producción se centra en la manufactura efectiva de esos productos. Aunque interactúan estrechamente, cada departamento se especializa en tareas específicas con objetivos claros y diferenciados.
Elementos primitivos relativos|Funciones básicas en la gestión empresarial: Lo que se considera una función básica (ej., ventas, logística) puede variar según el enfoque del análisis o la estructura de la empresa.|Lenguajes de programación: Lo que se considera un "elemento primitivo" (por ejemplo, tipos de datos) varía entre lenguajes y puede depender de la perspectiva del desarrollador.|Componentes de maquinaria: Lo que se considera un componente "primitivo" en una máquina (como un sensor, un actuador, o un controlador) puede variar según el enfoque del análisis. Para un ingeniero de mantenimiento, un sensor individual puede ser el elemento de interés, mientras que para el gestor de la planta, la máquina completa puede ser el "elemento básico".
Formas intermedias estables|Desarrollo de nuevos productos o servicios: Las empresas exitosas a menudo comienzan con un producto o servicio simple y efectivo, y luego incrementan su complejidad y alcance gradualmente, basándose en el éxito y la retroalimentación.|Evolución de sistemas operativos: Los sistemas operativos modernos han evolucionado a partir de versiones más simples y estables, agregando complejidad gradualmente.|Desarrollo de líneas de producción: Las líneas de producción eficientes a menudo comienzan como configuraciones simples que funcionan bien. Con el tiempo, se agregan más máquinas y procesos para aumentar la capacidad y la eficiencia. Sin embargo, este crecimiento se basa en la estabilidad y eficacia de la configuración inicial, evolucionando gradualmente para manejar una mayor complejidad sin comprometer la operatividad.

La historia del ser humano disfruta de **cuatro mecanismos mentales** que facilitan enormemente nuestra comprensión de los sistemas (complejos):

- Abstracción
- Encapsulación
- Modularización
- Jerarquización

### Abstracción

La abstracción es el proceso mental de extracción de las características esenciales de algo, ignorando los detalles superfluos — Booch

La abstracción surge de un reconocimiento de similitudes entre ciertos objetos, situaciones o procesos en el mundo real, y la decisión de concentrarse en estas similitudes e ignorar por el momento, las diferencias — Dahl, Dijkstra y Hoare

La abstracción es una descripción simplificada o especificación de un sistema que hace hincapié en algunos de los detalles o propiedades mientras que suprime otros del sistema. Una buena abstracción es la que hace hincapié en los detalles que son importantes para el lector o usuario y suprime detalles que son, al menos por ahora, de distracción — Shaw

|||||
|-|-|-|-|
Una abstracción denota las **características esenciales** de un objeto que lo distinguen de todos los otros tipos de objetos y por lo tanto proporciona límites conceptuales nítidamente definidos, en relación con la perspectiva del espectador.|Una abstracción se centra en la **visión exterior de un objeto** y sirve para separar el comportamiento esencial de un objeto de su implantación|La abstracción es **eminentemente subjetiva**, dependiendo del interés del observador|Nos esforzamos para construir abstracciones de las entidades porque son **directamente paralelos al vocabulario del dominio de un determinado problema**.

|Perspectiva|Abstracción del Alumno|
|-|-|
|Administrador de empresas|![](/images/modelosUML/plantUML/alumnoADE.svg)
|Ingeniero industrial|![](/images/modelosUML/plantUML/alumnoIOI.svg)
|Ingeniero Informático|![](/images/modelosUML/plantUML/alumnoII.svg)|

### Encapsulación

La encapsulación es proceso por el que se ocultan los detalles del soporte de las características esenciales de una abstracción — Booch

Principio de Ocultación de la información: todo aquello que no sea necesario dar a conocer, no se debe dar a conocer

En ninguno de los casos no se trata de ocultar la información en sí misma sino de ocultar los detalles del soporte de dicha información.

||||
|-|-|-|
La encapsulación se logra con mayor frecuencia a través de ocultación de información, que es el proceso de **ocultar todos los secretos de un objeto que no contribuyen a sus características esenciales**|La encapsulación proporciona barreras explícitas entre las diferentes abstracciones y por lo tanto conduce a una clara **separación de asuntos**.|El beneficio inmediato será la posibilidad de **cambiar los soportes de las características de una abstracción sin afectar a todos los elementos que dependan de esas características** porque ni los conocen, ni los mencionan

|Perspectiva|Abstracción|Encapsulación|Con lo cual|
|-|-|-|-|
|Administrador de empresas|![](/images/modelosUML/plantUML/alumnoADE.svg)|Los detalles administrativos, como los procesos internos de calificación, la metodología de enseñanza específica y los sistemas de gestión de información educativa, se mantienen ocultos para el alumno.|Esto permite a la administración ajustar y mejorar estos procesos sin alterar la experiencia general del alumno, manteniendo un enfoque en la calidad y resultados de la educación.
|Ingeniero industrial|![](/images/modelosUML/plantUML/alumnoIOI.svg)|Los algoritmos de personalización de contenido, los sistemas de seguridad para proteger los datos del alumno y las implementaciones técnicas de las plataformas educativas están ocultos al alumno.|El estudiante interactúa con una interfaz sencilla y funcional que le permite acceder a recursos educativos, entregar tareas y recibir retroalimentación, sin necesidad de entender la complejidad tecnológica subyacente.
|Ingeniero Informático|![](/images/modelosUML/plantUML/alumnoII.svg)|Los métodos de análisis de eficiencia, las técnicas de optimización de flujo de trabajo y los detalles de diseño ergonómico de las aulas y materiales educativos están diseñados y mejorados continuamente por el personal docente y administrativo, sin que el alumno necesite conocer estos detalles.|El alumno se beneficia de entornos de aprendizaje optimizados y procesos educativos eficientes, que mejoran su experiencia y rendimiento sin que sea consciente de las complejas decisiones y análisis realizados para lograrlo.

#### Implicaciones

Una vez realizada cierta abstracción hay que “trasladarlas” al lenguaje de programación.

- Esto conlleva decidir entre diversas estructuras de datos (estáticas o dinámicas, en memoria principal o secundaria, etc.) y/o diversos algoritmos (¿con variables auxiliares o no? ¿recursivo o iterativo?, etc.), siendo diversas las alternativas que recogen dichas características esenciales.
- Una vez que se selecciona una implantación, debe ser tratado como un secreto de la abstracción y oculta a la mayoría de los clientes. 

En la práctica, esto significa que cada clase debe tener dos partes:

|La interfaz|La implementación|
|-|-|
Capta sólo su vista exterior, que abarca nuestra abstracción del comportamiento común a todas las instancias de la clase.|La implementación de una clase comprende la representación de la abstracción, así como los mecanismos para conseguir el comportamiento deseado.
Es el único lugar donde establecemos todas los suposiciones que un cliente puede hacer sobre cualquier instancia de la clase|La implementación encapsula detalles sobre los qué ningún cliente puede hacer suposiciones.

- La abstracción de un objeto debe preceder a las decisiones acerca de su implantación.
- Ninguna parte de un sistema complejo debe depender de los detalles internos de cualquier otra parte.

Mientras que la abstracción ayuda a las personas a pensar en lo que están haciendo, la encapsulación permite hacer cambios fiables en el programa con un esfuerzo limitado.

### Modularización

***La modularidad es el proceso de descomposición de un sistema en un conjunto de piezas poco acoplados y cohesivos*** — Booch 96

|Acoplamiento|Cohesión|
|-|-|
El acoplamiento “[…​] es la medida de fuerza de la asociación establecida por una conexión ente un módulo -elemento- y otro. El acoplamiento fuerte complica un sistema porque los módulos son más difíciles de comprender, cambiar o corregir por sí mismos si están muy interrelacionados con otros módulos|La cohesión mide el grado de conectividad entre los elementos de un solo módulo

Al diseñar un sistema de software complejo, ***es esencial descomponerlo en partes más pequeñas y más pequeñas***, cada una de las cuales podemos entonces refinar independientemente. De esta manera, satisfacemos la restricción muy real que existe sobre la capacidad del canal de la cognición humana: para entender cualquier nivel dado de un sistema, sólo necesitamos comprender algunas partes (en lugar de todas las partes) a la vez.

||||
|-|-|-|
Para modularizar hay que minimizar las dependencias entre módulos (acoplamiento) que deben tener significado propio por sí mismo agrupando abstracciones lógicamente relacionadas (cohesión).|El bajo acoplamiento de un modulo se basa en la abstracción que limita su interfaz a lo esencial y en la encapsulación que oculta todos los detalles necesarios para su implantación pero innecesarios para otros módulos que se relacionen con éste.|Dividir un programa en una serie de límites documentados bien definidos dentro del programa es de gran valor en la comprensión del programa

|Perspectiva|Abstracción y Encapsulación|Modularidad
|-|-|-|
|Administrador de empresas|![](/images/modelosUML/plantUML/alumnoADE.svg)|La gestión educativa se puede descomponer en módulos específicos como admisiones, programas académicos, servicios al estudiante y colocación laboral. Cada módulo tiene cohesión alta, enfocándose en aspectos específicos de la experiencia educativa y el desarrollo del alumno. El acoplamiento entre estos módulos es bajo, permitiendo cambios o mejoras en un área sin perturbar significativamente las otras. 
|Ingeniero Industrial|![](/images/modelosUML/plantUML/alumnoIOI.svg)|La optimización de la línea de ensamblaje educativa puede verse como la creación de módulos dedicados a diferentes aspectos del proceso educativo: desarrollo curricular, entrega de contenido, evaluación del aprendizaje y mejora del entorno físico y virtual de aprendizaje. Cada módulo es altamente cohesivo, tratando aspectos específicos de la educación, mientras que el acoplamiento entre módulos es bajo, permitiendo la innovación y mejora continua en un área sin desestabilizar otras. 
|Ingeniero Informático|![](/images/modelosUML/plantUML/alumnoII.svg)|Los sistemas de información educativa pueden estructurarse en módulos como gestión de cursos, seguimiento del rendimiento del alumno, y plataformas de comunicación. Esto asegura que cada aspecto del sistema (por ejemplo, la entrega de contenido, las evaluaciones y los foros de discusión) sea cohesivo y funcione de manera independiente, mientras que el acoplamiento entre estos módulos se mantiene mínimo. 

### Jerarquización

Jerarquía es una clasificación u ordenamiento de las abstracciones — Booch

La jerarquización es el proceso de estructuración por el que se produce una organización de un conjunto de elementos en grados o niveles de responsabilidad, de clasificación o de composición, …​ entre otros

**Grafo dirigido acíclico**

||||
|-|-|-|
**La abstracción** es una buena cosa pero en todos los casos, excepto las aplicaciones más triviales, podemos encontrar muchas más abstracciones diferentes de lo que podemos comprender a la vez.|**La encapsulación** ayuda a gestionar esta complejidad al ocultar el interior de la vista de nuestras abstracciones.|**La modularidad** ayuda también, por que nos da una manera de agrupar abstracciones relacionados lógicamente.

Aún así, esto no es suficiente. Un conjunto de abstracciones a menudo forma una jerarquía, y mediante la identificación de estas jerarquías en nuestro diseño se simplifica enormemente nuestra comprensión del problema.


|||
|-|-|
La identificación de las jerarquías dentro de un sistema de software complejo a menudo no es fácil.|Si no revelamos la estructura de clases de un sistema, tendríamos que multiplicar nuestro conocimiento sobre las propiedades de cada parte individual.
Una vez que se exponen esas jerarquías, la estructura de un sistema complejo se vuelve muy simple y obtenemos la comprensión de la misma.|Con la inclusión de la estructura de clases, captamos estas propiedades comunes en un solo lugar.

|Perspectiva|Abstracción, Encapsulación, Modularidad|Jerarquía
|-|-|-|
|Administrador de empresas|![](/images/modelosUML/plantUML/alumnoADE.svg)|La estructura organizativa de la institución educativa puede ser vista como una jerarquía que clasifica los niveles de responsabilidad y servicios ofrecidos al alumno. En la cima, podríamos tener la administración general, seguida por departamentos especializados (finanzas, servicios estudiantiles, académicos), y dentro de estos, subdepartamentos o equipos dedicados a necesidades específicas del alumno, como asesoramiento, soporte académico y desarrollo profesional.
|Ingeniero Industrial|![](/images/modelosUML/plantUML/alumnoIOI.svg)|En el contexto de los sistemas de información, la jerarquía podría representarse en la arquitectura del software utilizado para la gestión educativa y aprendizaje en línea. Por ejemplo, en la cima estaría el sistema de gestión de aprendizaje (LMS), seguido por módulos específicos como gestión de contenido, foros de discusión, y seguimiento del progreso del alumno. Dentro de cada módulo, podríamos encontrar componentes más detallados, como herramientas de evaluación, bibliotecas de recursos y sistemas de comunicación alumno-profesor.
|Ingeniero Informático|![](/images/modelosUML/plantUML/alumnoII.svg)|En el diseño y optimización de sistemas educativos, la jerarquía podría aplicarse al ordenamiento de los procesos y flujos de trabajo. En el nivel más alto, tendríamos el diseño curricular general y la planificación académica. A un nivel intermedio, se situarían los programas y cursos específicos, y en el nivel más detallado, las lecciones individuales, actividades y evaluaciones. Además, esta jerarquía se extiende al diseño físico y virtual de los espacios de aprendizaje, desde la disposición general de las instalaciones educativas hasta el diseño específico de aulas y entornos virtuales. 


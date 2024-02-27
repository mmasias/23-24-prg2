# Vista pública de las Clases - Ejemplos

```java
    class Intervalo {
        public void mostrar()
        public void recoger()
        public double longitud()
        public double puntoMedio()
        public void escalar(double factor)
        public void desplazar(double desplazamiento)
        public boolean incluye(double punto)
        public boolean igual(Intervalo intervalo)
        public boolean distinto(Intervalo intervalo)
        public boolean intersecta(Intervalo intervalo)
        public Intervalo simetrico()
        public Intervalo desplazado(double desplazamiento)
        public Intervalo interseccion(Intervalo intervalo)
        public Intervalo union(Intervalo intervalo)
        public Intervalo entre(Intervalo intervalo)
        public Intervalo[] trozos(int trozos)
    }
```

---

```java
class Rectangulo {
    public void mostrar()
    public void recoger()
    public double area()
    public double perimetro()
    public void escalar(double factor)
    public void desplazar(double distanciaX, double distanciaY)
    public boolean contienePunto(double x, double y)
    public boolean intersecta(Rectangulo rectangulo)
    public Rectangulo interseccion(Rectangulo rectangulo)
    public Rectangulo union(Rectangulo rectangulo)
    public void rotar(int grados) 
    public Rectangulo[] dividir(char orientacion, double posicion) 
    public void establecerColor(String color) 
    public String obtenerColor()
    public void establecerTransparencia(double porcentaje)
    public double obtenerTransparencia()
}
```
---

```java
class Poligono {
    public void mostrar()
    public void recoger()
    public double area()
    public double perimetro()
    public void escalar(double factor)
    public void desplazar(double distanciaX, double distanciaY)
    public boolean contienePunto(double x, double y)
    public void rotar(double angulo, double anguloX, double anguloY)
    public boolean intersecta(Poligono poligono)
    public Poligono interseccion(Poligono poligono)
    public Poligono union(Poligono poligono) 
    public void añadirVertice(double x, double y)
    public void eliminarVertice(int indice)
    public Poligono convexHull()
    public int numeroDeVertices()
    public void normalizar()
}
```

---

```java
class Libro {
    public void establecerTitulo(String titulo)
    public String obtenerTitulo()
    public void establecerAutor(String autor)
    public String obtenerAutor()
    public void establecerEditorial(String editorial)
    public String obtenerEditorial()
    public void establecerAñoPublicacion(int año)
    public int obtenerAñoPublicacion()
    public void establecerISBN(String ISBN)
    public String obtenerISBN()
    public void establecerCantidadPaginas(int paginas)
    public int obtenerCantidadPaginas()
    public void añadirEtiqueta(String etiqueta)
    public boolean eliminarEtiqueta(String etiqueta)
    public String[] obtenerEtiquetas()
    public void establecerDisponibilidad(boolean disponible)
    public boolean estaDisponible()
    public String generarResumen()
    public void registrarPrestamo()
    public void registrarDevolucion()
    public int contarPrestamos()
}
```

---

```java
class CuentaBancaria {
    public void depositar(double cantidad)
    public boolean retirar(double cantidad)
    public double consultarSaldo()
    public boolean transferir(double cantidad, CuentaBancaria destino)
    public String obtenerNumeroDeCuenta()
    public String obtenerTitular()
    public void cambiarPIN(String nuevoPIN)
    public boolean validarPIN(String PIN)
    public void bloquearCuenta()
    public void desbloquearCuenta()
    public String generarEstadoDeCuenta()
    public void establecerLimiteRetiroDiario(double limite)
    public double obtenerLimiteRetiroDiario()
    public boolean establecerNotificaciones(boolean activar, String tipo) 
    public void añadirTitularSecundario(String titular)
    public void eliminarTitularSecundario(String titular)
}
```

---

```java
class CuentaBancaria {
    public void depositar(double cantidad)
    public boolean retirar(double cantidad)
    public double consultarSaldo()
    public boolean transferir(double cantidad, CuentaBancaria destino)
    public String obtenerNumeroDeCuenta()
    public String obtenerTitular()
    public void cambiarPIN(String nuevoPIN)
    public boolean validarPIN(String PIN)
    public void bloquearCuenta()
    public void desbloquearCuenta()
    public String generarEstadoDeCuenta()
    public void establecerLimiteRetiroDiario(double limite)
    public double obtenerLimiteRetiroDiario()
    public boolean establecerNotificaciones(boolean activar, String tipo) 
    public void añadirTitularSecundario(Persona titular)
    public void eliminarTitularSecundario(Persona titular)
    public Persona[] obtenerTitulares()
}
```

---

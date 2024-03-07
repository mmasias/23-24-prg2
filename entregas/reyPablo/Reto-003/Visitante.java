
    public class Visitante {
        private String nombre;
        private String apellido;
        private int numeroDeIndentidad;
        
        
        public Visitante(String nombre, String apellido, int numeroDeIndentidad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroDeIndentidad = numeroDeIndentidad;
        }
    
    
        public String getNombre() {
            return nombre;
        }
    
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    
        public String getApellido() {
            return apellido;
        }
    
    
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
    
        public int getNumeroDeIndentidad() {
            return numeroDeIndentidad;
        }
    
    
        public void setNumeroDeIndentidad(int numeroDeIndentidad) {
            this.numeroDeIndentidad = numeroDeIndentidad;
        }
        
        
       
    
    }

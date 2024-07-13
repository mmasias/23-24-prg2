class Cliente {
    
    public Cliente (String nombre, String apellido);
    public Cliente (String nombre, String apellido, String dni);
    public Cliente (int numeroTelefono);
    
    public void actualizaNombre (String nombre, String apellido);
    public void actualizarDni (String dni);
    public void actualizarNumero (int numeroTelefono);
    public void actualizarCorreo (String correo);
}

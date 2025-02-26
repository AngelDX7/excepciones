package Ejercicio7;

public class Gato {

        private String nombre;
        private int edad;
        public Gato(){
            String nombre = "pardo";
            int edad = 8;
        }
        public Gato(String nombre, int edad) throws Exception{
            if (edad<0){
                throw new Exception("Error: La edad no puede ser negativa");
            } else if (nombre.length()<3){
                throw new Exception("Error: El nombre debe tener mas de 3 caracteres");
            }
            this.nombre = nombre;
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) throws Exception {
            if (edad<0){
                throw new Exception("Error: La edad no puede ser negativa");
            }
            this.edad = edad;
        }
        public void setNombre(String nombre) throws Exception {
            if (nombre.length()<3){
                throw new Exception("Error: El nombre debe tener mas de 3 caracteres");
            }
            this.nombre = nombre;
        }
    }



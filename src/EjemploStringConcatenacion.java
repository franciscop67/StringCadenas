public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        //Los String son inmutables no cambian.
        String curso= "Programación Java";
        String profesor =  "Andrés Guzman";
        
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA= 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB)); //tenemos que colocar () para priorizar operación

        System.out.println(numeroA + numeroB + detalle); //Importante el order 
        
        String detalle2 = curso.concat(" con ").concat(profesor); //Este es otro metodo para concatenar
        System.out.println("detalle2 = " + detalle2);


    }
}

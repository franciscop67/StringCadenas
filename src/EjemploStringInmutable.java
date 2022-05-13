public class EjemploStringInmutable {
    public static void main(String[] args) {
        //Los String son inmutables no cambian.
        //Para que cambien se va a tener que almacenarlo en una variable con el cambio.
        String curso= "Programación Java";
        String profesor =  "Andrés Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c ->{    //Expresión Lambda. Función de flecha. Para modificar el valor del String
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}

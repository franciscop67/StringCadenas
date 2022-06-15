import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre =  "Francisco";

        System.out.println("nombre.length() = " + nombre.length()); //Muestra la cantidad de caracteres. Parte del 0.
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//Cambia la cadena a mayuscula.
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//Cambia la cadena a minuscula.
        System.out.println("nombre.equals(\"Francisco\") = " + nombre.equals("Francisco"));//Compara la cadena a nivel valor.
        System.out.println("nombre.equals(\"francisco\") = " + nombre.equals("francisco"));
        System.out.println("nombre.equalsIgnoreCase() = " + nombre.equalsIgnoreCase("francisco"));//Compara el valor pero ignora mayusculas y minusculas
        System.out.println("nombre.compareTo(\"Francisco\") = " + nombre.compareTo("Francisco"));//Ordenamiento lexicografico. Valor o indica que son identicos.
        System.out.println("nombre.compareTo(\"Aaron\") =" + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(0));//Obtiene el caracter deseado. De igual manera comienza desde 0.
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));//Obtiene el ultimo caracter de manera dinamica.
        System.out.println("nombre.substring(4) = " + nombre.substring(4));//Obtiene una subcadena.
        System.out.println("nombre.substring(2,6) = " + nombre.substring(2,6));//Se pueden agregar 2 valores. Desde, Hasta.
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));//Obtner el ultimo carcter de forma dinamica.

        String trabalenguas =  "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));//Este pertime remplazar caracter.
        System.out.println("trabalenguas = " + trabalenguas);//El String es inmutable
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));//Muestra la posicion de dicho caracter.
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf('a'));//Muestra la ultima posicion de dicho caracter.
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));//Muestra este numero ya que no existe.
        System.out.println("trabalenguas.contains(\"trabalenguas\") = " + trabalenguas.contains("lenguas"));//Te permite saber si existe o no el caracter. Regresa un boleano.
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));//Permite saber si comenzo con algo. Regresa un boleano.
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));//Permite saber si termino con algo. Regresa un boleano.
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());//Quita espacios en blanco.
    }
}

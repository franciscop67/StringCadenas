public class EjemploString {
    public static void main(String[] args) {
        String curso= "Programación Java";
        String curso2 =  new String( "Programación Java");
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 " + esIgual); //Es falso ya que compara la referencia es decir;
        // el objeto

        esIgual =  curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);//Este metodo permite comparar el valor es decir; el atributo

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 " + esIgual);


    }
}

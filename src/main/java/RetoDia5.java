import java.util.ArrayList;
import java.util.Scanner;

public class RetoDia5 {
  /* El reto de hoy consiste en lo siguiente:
- Lenguaje: Java
- IDE recomendado: IntelliJ
- Nivel: Inicial
- Enunciado: Crea un método que convierta una cadena de texto (String) en un Array de enteros (Integer). El método recibirá como parámetro la cadena
y devolverá un ArrayList de tipo Integer. Debes lanzar una excepción en los siguientes casos:

        1) El array no está bien formado (es decir, no tiene [] o , para separar los elementos.
        2) El elemento a convertir no es un entero.
- Consideraciones: Crea una Clase llamada Util para meter este método y otros que puedan resultar de utilidad. No se debe instanciar la clase Util,
se debe poder invocar directamente al método a través de Util.stringToArray() (editado)
   */

    public static void main(String[] args) {
        //Atributos

        ArrayList listaenteros =new ArrayList();
        System.out.println("Introduce una tecto para convertirlo a valor numerico");
        Scanner sc=new Scanner(System.in);
        String cadenaTexto=sc.nextLine();
        listaenteros=convertir(cadenaTexto);
        System.out.println();

        for (int i=0;i<listaenteros.size();i++){
            System.out.print(listaenteros.get(i)+" ");

        }
    }

    private static ArrayList<Integer> convertir(String texto) {
        ArrayList lista =new ArrayList();
        System.out.println();
        for (int i=0;i<texto.length();i++){
            System.out.print(texto.charAt(i)+ "  ");
            lista.add(Character.getNumericValue(texto.charAt(i)));
            }

        return lista;
    }
    }





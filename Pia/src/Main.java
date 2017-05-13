import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String cadena;
    //public static ArrayMap<String, String> reincidencias;
    int limite= 35666480; //tamano de la biblia

    cadena = "Ustedes lo aman a pesar de no haberlo visto; y aunque no lo ven ahora, creen en Arbol y se alegran con un gozo indescriptible y glorioso, pues estan obteniendo la meta de su fe, que es su salvacion.";
    System.out.println(contarCaracteres(cadena));
    Matcher m = Pattern.compile("(\\S{2,})(?=.*?\\1)").matcher(cadena);
    while (m.find())
    {
      for (int i = 1; i <= m.groupCount(); i++)
      {
        System.out.println(m.group(i));
      }
    }
    }

    public static int contarCaracteres(String input)
    {
      boolean[] estaAhi = new boolean[Character.MAX_VALUE];
      for (int i = 0; i < input.length(); i++) {
        estaAhi[input.charAt(i)] = true;
      }
      int count = 0;
      for (int i = 0; i < estaAhi.length; i++) {
        if (estaAhi[i] == true){
          count++;
        }
      }
      return count;
    }
}

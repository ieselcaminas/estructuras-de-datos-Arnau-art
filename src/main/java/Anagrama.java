import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



    public class Anagrama {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/main/resources/spanish-dict.txt")
            );

            String line;
            ArrayList<String> palabras = new ArrayList<>();

            // Leer todas las palabras del archivo
            while ((line = reader.readLine()) != null) {
                palabras.add(line.trim());
            }
            reader.close();

            // Crear el mapa de anagramas
            HashMap<String, ArrayList<String>> mapa = anagrams(
                    palabras.toArray(new String[0])
            );

            // Imprimir todos los grupos de anagramas
            for (ArrayList<String> grupo : mapa.values()) {
                System.out.println(grupo);
            }
        }

        // Método para alfabetizar una palabra
        public static String alphabetize(String s) {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            return new String(a);
        }

        // Método para agrupar palabras por anagramas
        public static HashMap<String, ArrayList<String>> anagrams(String[] palabras) {
            HashMap<String, ArrayList<String>> map = new HashMap<>();

            for (String palabra : palabras) {
                String clave = alphabetize(palabra);
                map.putIfAbsent(clave, new ArrayList<>());
                map.get(clave).add(palabra);
            }

            return map;
        }
    }







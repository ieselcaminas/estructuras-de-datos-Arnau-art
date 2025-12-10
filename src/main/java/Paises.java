import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Paises {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> mapa = new HashMap<>();
        FileReader fr = new FileReader("src/main/resources/Colfuturo-Seleccionados.csv");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        String [] colunas;
        while ((linea = br.readLine()) != null) {
            colunas = linea.split(",");
            mapa.put(colunas[6], mapa.getOrDefault(colunas[6],0)+1);
        }
        br.close();
        fr.close();
        for (String pais : mapa.keySet()){
            System.out.println(pais+": "+mapa.get(pais));
        }




    }
}

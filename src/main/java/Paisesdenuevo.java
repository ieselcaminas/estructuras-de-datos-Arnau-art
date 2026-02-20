import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Paisesdenuevo {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> mapa = new HashMap<>();
        FileReader fr = new FileReader("src/main/resources/Colfuturo-Seleccionados.csv");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        String Columna;
        while((linea=br.readLine())!=null){
            Columna=linea.split(",")[6];
            mapa.put(Columna, mapa.getOrDefault(Columna, 0) + 1);
        }

        for(String key:mapa.keySet()){
            System.out.println(key + ": " + mapa.get(key));
        }

    }
}

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Botin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Map<Integer,ArrayList<Integer>> botin = repartirbotin(2, new ArrayList<>(List.of(10,20,50,200,500)));
        System.out.println(botin);

    }
    public static Map<Integer,ArrayList<Integer>> repartirbotin(int cuantos, ArrayList<Integer> billetes){
    Map<Integer,ArrayList<Integer>> botin = new HashMap<>();
    ArrayList<Integer> reparto = new ArrayList<>();
    for(int i=0;i<billetes.size();i++){
        int indice = i % cuantos;
        reparto = botin.get(indice);
        if(reparto==null){
            reparto = new ArrayList<>();
        }
        reparto.add(billetes.get(i));
        botin.put(indice,reparto);
    }
    return botin;
    }
}

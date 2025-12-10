package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class positivosnegativos {
    public static void main(String[] args) {
        List<Integer> SueñodePablo = new ArrayList<>(Arrays.asList(1,3,2,4,5,6,-1,-3,12,-4));

        long positivos= SueñodePablo.stream()

                .filter(p->p>0)
                .count();

        long negativos = SueñodePablo.stream()

                .filter(p->p<0)

                .count();

        System.out.printf("Hay %d números positivos, y hay %d números negativos.", positivos, negativos);
    }
}

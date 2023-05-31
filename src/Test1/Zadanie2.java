package Test1;

import java.util.Arrays;

public class Zadanie2 {
    public static boolean czyPosortowana(int[] tablica){
        int[] sortedTablica= Arrays.stream(tablica).sorted().toArray();
        if(Arrays.equals(sortedTablica, tablica)){
            return true;
        }
        return false;
    }
}

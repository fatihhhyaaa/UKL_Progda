import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
        int[] Array = {5,-3,7,9,-1};
        ArrayList<Integer> negatif = new ArrayList<>();
        for (int num : Array) {
            if (num < 0) {
                negatif.add(num);
        }
    }
    if (!negatif.isEmpty()) {
        System.out.println("array mengandung elemen negatif: " + negatif);
    }else {
        System.out.println("array tidak mengandung elemen negatif");
    }
}
}
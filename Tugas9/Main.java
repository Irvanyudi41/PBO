
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
   public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("Halo");
    arrayList.add("Dunia");
    arrayList.add("!");

    arrayList.forEach((str) -> {
        System.out.println(str);
       });

    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    arrayDeque.add(1);
    arrayDeque.add(2);
    arrayDeque.add(3);

    arrayDeque.forEach((num) -> {
        System.out.println(num);
       });
  }
    
}

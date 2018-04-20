import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SandboxMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        doTimings("array List", arrayList);
        doTimings("linked List", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {

        for(int i = 0; i < 1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        // time for adding to end of list   ARRAY LIST MUCH FASTER
//        for(int i = 0; i<1E5; i++){
//            list.add(i);
//        }
        // time for adding to beginning of list
        for(int i = 0; i<1E5; i++){
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("time elapsed: " + (start - end) + " ms for " + type);
    }
}

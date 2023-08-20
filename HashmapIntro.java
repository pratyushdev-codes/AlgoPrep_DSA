import java.util.HashMap;

public class HashmapIntro{
    public static void main(String[] args) {
        HashMap<Integer,Integer>map= new HashMap<>();
        map.put(10,70);
        map.put(20,80);
        map.put(30,90);
        System.out.println(map.get(10));
        System.out.println(map.get(20));
    }
}
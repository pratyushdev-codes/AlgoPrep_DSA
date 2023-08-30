import javax.sql.rowset.spi.SyncResolver;

public class Constructors {  
    public static void main(String[] args) {
        // Pair p1 = new Pair();
        // System.out.println(p1.x);

        // Pair p2 = new Pair();
        // p2.x = 100;
        // System.out.println(p2.x);

        Pair p1 = new Pair(10, 20);
        System.out.println(p1.x);
        System.out.println(p1.y); 
        Pair p2= new Pair();  
        System.out.println(p2.x);
    }
        
    public static class Pair {
        int x;
        int y;

        Pair(int v1, int v2) {
            x = v1;
            y = v2;
        }
        Pair(){

        }
    }
}

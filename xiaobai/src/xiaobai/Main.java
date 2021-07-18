package xiaobai;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Man> lists = new ArrayList<Man>();
        lists.add(new Man(1,"x1"));
        lists.add(new Man(2,"x2"));
        lists.add(new Man(3,"x3"));
        lists.add(new Man(4,"x4"));
        for(Man m : lists)
        {
            System.out.println(m);
        }
    }
}

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/7/4
 * Time: 22:51
 */

public class Main {
    public static void main(String[] args) {
        Collection a = new HashSet();
        a.add("aa");
        a.add("bb");
        a.add("cc");
//        a.forEach(obj-> System.out.println(obj));
        for(Iterator i = a.iterator();i.hasNext();){
            System.out.println(i);
            a.remove(i);
        }
    }
}

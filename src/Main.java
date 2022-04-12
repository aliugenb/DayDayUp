import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/7/4
 * Time: 22:51
 */

public class Main {
    public static void main(String[] args) {
//        Collection a = new HashSet();
//        a.add("aa");
//        a.add("bb");
//        a.add("cc");
////        a.forEach(obj-> System.out.println(obj));
//        for (Iterator i = a.iterator(); i.hasNext(); ) {
//            System.out.println(i);
//            a.remove(i);
//        }
        String[] a = {"d", "a", "a", "b", "b", "c"};
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        for (int i = 0; i < a.length; i++) {
//            map.put(a[i], map.getOrDefault(a[i], i));
//        }
//        String[] res = new String[map.keySet().size()];
//        for (String s : map.keySet()) {
//            String rs =
//        }
        String tmp = "";
        for (int i = 0; i < a.length; i++) {
            tmp = tmp + a[i];
        }
        System.out.println(tmp);
        String tmp2 = "";
        for (int j = 0; j < tmp.length(); j++) {
            if (tmp.lastIndexOf(a[j]) > j) {
                continue;
            }
            tmp2 = tmp2 + a[j];
        }
        System.out.println(tmp2);
    }
}

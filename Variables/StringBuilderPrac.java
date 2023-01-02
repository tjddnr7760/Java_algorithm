//성능을 포기하고 싶지 않다면 StringBuilder를 사용한다.
//java.lang.StringBuilder

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.List;

public class StringBuilderPrac {
    static List<String> names = Arrays.asList("A", "B", "C", "fef", "eee", "abc");
    static StringBuilder sb = new StringBuilder();
    
    //append
    public void pracStringBuilder() {
        for (String name : names) {
            sb.append(name);
            sb.append(",");
        }

        sb.setLength((sb.length() - 1));
        
        //reversed
        sb.reverse();
        
        //insert
        sb.insert(5, "value");
        
        //Delete
        sb.delete(5, 7);
        
        //Replace
        sb.replace(5, 9, "there");
        
        String result = sb.toString();
        System.out.println(result);
    }
}

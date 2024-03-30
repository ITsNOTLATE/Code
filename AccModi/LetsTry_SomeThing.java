package AccModi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetsTry_SomeThing {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("element1", "element2", "element3");

        List<String> collectedList = s.stream()
                .filter((String ac) -> ac.length()>1)
                .collect(Collectors.toList());
        System.out.println(collectedList);
    }
}

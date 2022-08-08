package abhi.java8.stream.debug;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDebug {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(40, 20, 57, 20,13, 30, 33, 67, 20, 10);
        System.out.println(list);

        List<Integer> resultList = list.stream()
                .filter(i->i%2==0)
                .map(i -> i+2)
                .distinct()
                .sorted()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}

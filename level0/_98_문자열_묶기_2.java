package level0;

import java.util.*;
import java.util.stream.Collectors;

/*
 */
public class _98_문자열_묶기_2 {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values()
                .stream().max(Comparator.comparing(List::size)).orElse(Collections.emptyList()).size();
    }
}

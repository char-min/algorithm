package level0;

public class _43_문자열의_뒤의_n글자 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }
}

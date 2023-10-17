import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExpresseRegular{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[1-9] {3}");
        Matcher n = p.matcher("123ABC");

        while(n.find()){
            System.out.println(n.group());
        }
    }
}
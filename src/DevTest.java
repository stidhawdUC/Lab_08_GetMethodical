import java.util.Scanner;
import java.util.regex.Pattern;
public class DevTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String bigQuestion = "T67, give me something that's NOT actually an SSN but follows";
        String sampleNum = "^\\d{3}-\\d{2}-\\d{4}";
        String littleAnswer = "";
        littleAnswer = SafeInput.getRegExString(in, bigQuestion, sampleNum);

        System.out.println("You typed " + littleAnswer);

    }
}

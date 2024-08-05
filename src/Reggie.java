import java.util.Scanner;
public class Reggie {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String userSocial = "";
    String userM = "";
    String menuChoice = "";
    userSocial = SafeInput.getRegExString(in, "Enter a fake SSN", "^\\d{3}-\\d{2}-\\d{4}$");
    userM = SafeInput.getRegExString(in, "Enter your Student M number", "^(M|m)\\d{5}$");
    menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O,S,V,Q]", "^[OoSsVvQq]$");
    System.out.println("Social: " + userSocial + "\nUC " +
            "Student M#: " + userM + "\nMenu Choice: " + menuChoice);
}
}

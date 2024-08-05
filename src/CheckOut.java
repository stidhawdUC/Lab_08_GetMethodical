import java.util.Scanner;
public class CheckOut {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double total = 0;
    boolean done = false;
    int itemCount = 0;
    System.out.println("Welcome to the $10 Store Checkout!");
    do{
        itemCount++;
        System.out.print("\nItem " + itemCount);
        total = total + SafeInput.getRangedDouble(in, "Enter the price " +
                "of the item", .50, 10.00);
        done = SafeInput.getYNConfirm(in, "Will that be all?");
    }while(!done);
    System.out.println(itemCount + " items entered. Total:");
    System.out.printf("$" + "%.2f", total);
}
}

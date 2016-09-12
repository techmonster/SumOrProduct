package holloway.nate.SumOrProduct;

import java.util.Scanner;

/**
 * Created by nathanielholloway on 9/10/16.
 * This class has display methods.
 */
 class Display {


    private Scanner sc;

    Display(){
        this.sc = new Scanner(System.in);
    }

    int promptOperation(){
        displayMessage("What do you want to calculate?\n" +
                "Choose a number:\n" +
                "1) Sum\n"+
                "2) Product");
        return sc.nextInt();
    }

    int promptNumber() {
        displayMessage("Enter a number..");
        return sc.nextInt();

    }

    void displayMessage(String msg) {
        System.out.println(msg);
    }
}

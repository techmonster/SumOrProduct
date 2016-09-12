package holloway.nate.SumOrProduct;

/**
 * Created by nathanielholloway on 9/10/16.
 * This class does the work of the program.
 */

 class Operation {
    private Display userDisplay;
    private Logic calcLogic;


    Operation(){
        userDisplay = new Display();
        calcLogic = new Logic();
    }

    void logic(){

        int userInput = userDisplay.promptOperation();
        int userNumber = userDisplay.promptNumber();
        setTotal(userInput, userNumber);
    }

    private void setTotal(int operation, int number){
        switch(operation){
            case(1):
                userDisplay.displayMessage("The answer is : " + calcLogic.sumOf(number));
                break;
            case(2):
                userDisplay.displayMessage("The answer is : " + calcLogic.productOf(number));
                break;
        }




    }


}

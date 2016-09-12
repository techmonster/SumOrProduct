package holloway.nate.SumOrProduct;

/**
 * Created by nathanielholloway on 9/10/16.
 * This class is the brains of the program.
 */
class Logic {

    int sumOf(int n) {

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += i;
        }

        return answer;
    }

    int productOf(int n) {
        int answer = 0;
        if (n != 0) {
            answer = 1;
            for (int i = 1; i <= n; i++) {
                answer *= i;

            }
        }
        return answer;
    }
}

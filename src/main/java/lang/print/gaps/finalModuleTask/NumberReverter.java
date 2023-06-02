package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = 0;
        while(number > 0){
            int nextDigit = number%10;
            number/=10;
            result  = result*10+nextDigit;
        }
        System.out.println(result);
    }
}

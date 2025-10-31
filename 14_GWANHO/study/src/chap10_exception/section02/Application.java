package chap10_exception.section02;

import chap10_exception.section02.exception.MoneyNegativeException;
import chap10_exception.section02.exception.NotEnoughMoneyException;
import chap10_exception.section02.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {

        ExceptionTest test = new ExceptionTest();
        try {

            test.checkEnoughMoney(10000, -50000);

        } catch (PriceNegativeException pe) {
            System.out.println(pe.getMessage());

        } catch (MoneyNegativeException me) {
            System.out.println(me.getMessage());

        } catch (NotEnoughMoneyException neme) {
            System.out.println(neme.getMessage());

        }
    }
}

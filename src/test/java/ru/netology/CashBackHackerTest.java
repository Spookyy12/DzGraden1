package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashBackHackerTest {
    @Test
    public void bonusIfNotEnough() {
        CashBackHacker service = new CashBackHacker();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifBonusEqualsZero() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
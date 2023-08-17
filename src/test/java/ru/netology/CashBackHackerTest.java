package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerTest {
    @Test
    public void bonusIfNotEnough() {
        CashBackHacker service = new CashBackHacker();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifBonusEqualsZero() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HACKER
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @Test
    public void testGetBalanceIsZeroOnNewAccount() {
        Account instance = new Account();
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetBalanceIs500AfterDeposit500() {
        double cash = 500.0;
        Account instance = new Account();
        instance.deposit(cash);
        double expResult = 500.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetBalanceIs100AfterDeposit500ThenWithdraw400() {
        double cash = 500.0;
        Account instance = new Account();
        instance.deposit(cash);
        double withdraw=400.0;
        instance.withdraw(withdraw);
        double result = instance.getBalance();
        double expResult = 100.0;
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetBalanceIsZeroAfterDeposit500ThenClose() 
    {
        double cash = 500.0;
        Account instance = new Account();
        instance.deposit(cash);
        instance.close(true);
        double result = instance.getBalance();
        double expResult = 0.0;
        assertEquals(expResult, result, 0.0);
    }
    
    
    
}

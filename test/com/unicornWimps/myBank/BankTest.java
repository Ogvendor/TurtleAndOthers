package com.unicornWimps.myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void bankExistsTest() {
        assertNotEquals(null, bank);
    }

    @Test
    void accountCanBeCreatedTest() {
        //given that there is a bank
        //when i create an account
        //check that number of account created is 1
        bank.createAccountFor("Vendor OG ", "1234");
        assertEquals(1, bank.getNumberOfCustomers());
    }

    @Test
    void createAccount_findAccountByAccountNumber() {
        bank.createAccountFor("Vendor OG ", "1234");
        assertEquals(1, bank.getNumberOfCustomers());

        Account account = bank.findAccount("1");
        assertEquals("Vendor OG ", account.getName());
    }
    @Test
    void customerCanDepositInHerAccountTest(){
        bank.createAccountFor("Vendor OG","1234");
        bank.deposit(2000,"1");

        Account bankeAccount = bank.findAccount("1");
        assertEquals(2000,bankeAccount.getBalance("1234"));
    }
    @Test
    void customerCanWithdraw(){
        bank.createAccountFor("Vendor OG ", "1234");
        bank.deposit(2000,"1");

        Account bankeAccount = bank.withdraw(500,"1");
        assertEquals(1500,bankeAccount.getBalance("1234"));
    }
    @Test
    void customerCanNotWithdrawMoreThanBalance(){
        bank.createAccountFor("Vendor OG ", "1234");
        bank.deposit(2000,"1");

        Account bankeAccount = bank.withdraw(2100,"1");
        assertEquals(2000,bankeAccount.getBalance("1234"));
    }


}
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter number 1: ");
//        int userInput = input.nextInt();
//
//        int largestNumber = userInput;
//        int lowestNumber = userInput;
//
//        int count = 1;
//        while (count < 5) {
//
//            System.out.println("Enter Number: " + (count + 1));
//             userInput = input.nextInt();
//
//            var userInputIsLarger = userInput;
//            var userInputIsLower = userInput ;
//
//            if (userInput > largestNumber) {
//                largestNumber = userInput;
//            }
//            if (userInput < lowestNumber) {
//                lowestNumber = userInput;
//            }
//            count++;
//        }
//        System.out.println("The largest number is " + largestNumber);
//        System.out.println("The lowest number is " + lowestNumber);
//
//    }
//    }


//        int maximum = 0;
//        int minimum = 0;
//       for (int v = 0; v < 5; v++) {
//           System.out.println("Enter Number: ");
//           int number = input.nextInt();
//
//           if(number > maximum) {
//               maximum = number;
//           }else if(number < minimum)
//             minimum = number;
//
//               }
//           System.out.println("Maximum " + maximum);
//           System.out.println("Minimum " + minimum);
//       }

//        System.out.println("Enter Number: ");
//        int num = input.nextInt();
//
//        System.out.println("Enter Number: " );
//        int num2 = input.nextInt();
//
//        System.out.println("Enter Number: ");
//        int num3 = input.nextInt();
//
//        System.out.println("Enter Number: ");
//        int num4 = input.nextInt();
//
//        System.out.println("Enter Number: ");
//        int num5 = input.nextInt();
//
//
//      int number = Math.max(num,Math.max(num2,Math.max(num3,Math.max(num4,num5))));
//        System.out.println("Highest number is " + number);




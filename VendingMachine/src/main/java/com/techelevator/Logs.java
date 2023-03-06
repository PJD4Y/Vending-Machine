package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logs {

    //purchase log
    //feed money
    //item log

    File log = new File("C:\\Users\\Student\\workspace\\module-1-capstone-team-3\\src\\main\\resources\\log.txt");
    File salesLog = new File("C:\\Users\\Student\\workspace\\module-1-capstone-team-3\\src\\main\\resources\\saleslog.txt");

    //boolean append = log.exists();

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    String formatDateTime = now.format(formatter);
//
//    public void feedMoneyLog(VendingMachineCLI vendingMachineCLI) {
//        BigDecimal moneyIn = vendingMachineCLI.paymentCalculator.feedMoney(vendingMachineCLI.paymentCalculator.feedAmount);
//        try (PrintWriter writer = new PrintWriter(new FileOutputStream(log, append))) {
//            writer.println(formatDateTime);
//            writer.println(moneyIn);
//            writer.println(vendingMachineCLI.paymentCalculator.getCurrentMoney());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("File not found.");
//        }
//        //num of transactions
//    }

    public void purchaseLog(VendingMachineCLI cli, String slotChoice) {
        String productName = cli.inventory.get(slotChoice).getName();
        BigDecimal productPrice = cli.inventory.get(slotChoice).getPrice();
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(log, true))) {
            writer.print(formatDateTime);
            writer.print(" " + productName);
            writer.print(" " + slotChoice);
            writer.println(" " + productPrice);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found.");
        }
    }




//    public void noTransaction(VendingMachine vendingMachineCLI, String slotChoice) {
//        try (PrintWriter writer = new PrintWriter(new FileOutputStream(log, append))) {
//            String curr_date = DateFormat.format(c.getTime());
//            writer.println(curr_date);
//            writer.println(moneyIn);
//            writer.println(vendingMachineCLI.paymentCalculator.getCurrentMoney());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("File not found.");
//        }
//    }


//}
//
//
//    public void exitLog(VendingMachine vendingMachineCLI, String slotChoice) {
//        try (PrintWriter writer = new PrintWriter(new FileOutputStream(log, append))) {
//            String curr_date = DateFormat.format(c.getTime());
//            writer.println(curr_date);
//
//        }
//    }
//
//    public void salesLog(VendingMachine vendingMachineCLI, String slotChoice) {
//        try (PrintWriter writer = new PrintWriter(new FileOutputStream(log, append))) {
//            String curr_date = DateFormat.format(c.getTime());
//            writer.println(curr_date);
//
//        }
}





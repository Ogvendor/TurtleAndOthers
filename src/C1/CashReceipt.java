package C1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


 class CashReceipt {
    static Scanner input = new Scanner(System.in);
    static Date date = new Date();
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  hh/mm/ss");

    static String receiptName;
    static ArrayList receiptItem = new ArrayList<>();
    static ArrayList<Integer> quantityBought = new ArrayList<>();
    static ArrayList<Double> amountBought = new ArrayList<>();
    static ArrayList<Double> disCount =  new ArrayList<>();


    public static void main(String[] args) {
      receiptDetails();
    }

    public static void receiptDetails(){
        String receiptName = null;
        if(receiptName == null){
            System.out.println("Enter customer name: ");
            String name = input.nextLine();
            receiptName = name;
        }
        System.out.print("Enter what the user buy: ");
         String item = input.nextLine();
         receiptItem.add(item);
         
         System.out.println("Enter how many pieces: ");
          int quantity = input.nextInt();
          quantityBought.add(quantity);

          System.out.println("How much per unit: ");
          double unit = input.nextDouble();
          amountBought.add(unit);

          addOption();
        
    }
    public static void addOption(){
        input.nextLine();
        System.out.print("Add More Item? yes or no: ");
        String quit = input.nextLine();

        switch(quit){
            case "Yes":
               receiptDetails();
               break;
            case "No":
               cashier();
               break;
        }
    }
    static String cashierName;
    public static void cashier(){
        System.out.print("What is your Name: ");
        cashierName = input.nextLine();

        System.out.print("How much Discount: ");
        double discount = input.nextDouble();
        disCount.add(discount);

        printInvoice();
    }
    static double total;
    static double subTotal;
    static double discount;
    static double vat;
    static double billTotal;

    public static void calculateTotal(){
        for(int i=0;i<receiptItem.size();i++){
            total = quantityBought.get(i) * amountBought.get(i);
            System.out.printf("%6s%15d%23.2f%18.2f%n",receiptItem.get(i),quantityBought.get(i),amountBought.get(i));
        }
        calculateSubTotal();
    }
    public static void calculateSubTotal(){
        for(int i=0;i<disCount.size();i++) {
            subTotal += total;
            discount = subTotal / (disCount.get(i) * 100);
            vat = (17.50 / 100) * subTotal;
            billTotal = subTotal + discount + vat;
        }

    }
    public static void printInvoice(){

        System.out.print("147 Store"+ "\n"+
                         "Main Branch"+"\n"+
                        "Location: 1,Cannabis way,Smoke Island,CODE"+ "\n"+
                        "ContactNumber: +1 805 309 6977"+ "\n"+
                        "Date:"+ simpleDateFormat.format(date)+"\n"+
                        "Cashier: "+ cashierName+ "\n"+
                        "Customer Name: "+ receiptName + "\n"+
                        "====================================================="+"\n"+
                         "ITEM              QTY           Price          Total(NGN)" + "\n"+
                         "========================================================"+ "\n");
        calculateTotal();
        System.out.println("----------------------------------------------------------------"+"\n"+
                          "                               "+ "SUB TOTAL: "+"     "+"subTotal"+ "\n"+
                          "                               "+ "DISCOUNT: "+"      "+"discount"+ "\n"+
                          "                               "+ "VAT: "    +"       "+"vat"     + "\n"+
                          "==================================================================="+"\n"+
                          "                               "+ "BILL TOTAL"+"      "+"billTotal");
    }

}

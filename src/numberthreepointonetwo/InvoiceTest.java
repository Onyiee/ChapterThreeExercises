package numberthreepointonetwo;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice myInvoice = new Invoice("12","single unit Ac",45,2000);


        System.out.println("Enter part number: ");
        String partNumber = input.nextLine();

        System.out.println("Enter part description: ");
        String partDescription = input.nextLine();

        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter price: ");
        double price = input.nextDouble();

        myInvoice.setPartNumber(partNumber);
        myInvoice.setPartDescription(partDescription);
        myInvoice.setPrice(price);
        myInvoice.setQuantity(quantity);

        System.out.printf("Your invoice amount is %f%n", myInvoice.getInvoiceAmount());
    }



}

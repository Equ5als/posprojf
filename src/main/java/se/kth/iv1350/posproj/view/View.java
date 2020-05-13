package se.kth.iv1350.posproj.view;

import se.kth.iv1350.posproj.controller.Controller;
import se.kth.iv1350.posproj.dto.ItemDTO;

/**
 * Responsible to get the input from the user and pass them.
 */
public class View {
    private Controller controller;

    /**
     * Create the interface for the user to start using the software.
     * @param controller call the appropriate methods and pass the input.
     */
    public View(Controller controller) {
        this.controller = controller;
        this.controller.addRegisterObserver(new TotalRevenueView());
    }

    /**
     * Hard-code simulating a user usage in real life.
     */
    public void getSaleStarted() {
        startNewSale();
        registerItem(5);
        registerItem(7);
        registerItem(1);
        registerItem(15);
        registerItem(3);
        registerItem(1);
        registerItem(5);
        registerItem(8);
        registerItem(100);
        registerItem(1);
        registerItem(10);
        endSale();
        enterPayment(500);

        startNewSale();
        registerItem(6);
        registerItem(10);
        registerItem(10);
        registerItem(2);
        registerItem(1);
        registerItem(8);
        registerItem(7);
        registerItem(1);
        registerItem(11);
        registerItem(1);
        registerItem(5);
        endSale();
        enterPayment(1000);

        startNewSale();
        registerItem(2);
        registerItem(2);
        registerItem(4);
        registerItem(1);
        registerItem(8);
        registerItem(8);
        registerItem(3);
        registerItem(4);
        registerItem(9);
        registerItem(10);
        registerItem(10);
        endSale();
        enterPayment(1000);
    }

    private void startNewSale() {
        controller.startNewSale();
        System.out.println("\n----------New sale has started----------\n");
    }

    private void registerItem(int Id) {
        ItemDTO product = controller.registerItem(Id);
        if(product != null) {

            System.out.println("Product: " + product.getItemDescription() + ", Cost: " + product.getItemPrice() +
                    " kr, Total Price: " + controller.getTotalPriceWithVat() + " kr.");
        }
    }

    private void endSale() {
        System.out.println("\nTotal Cost: " + controller.getTotalPriceWithVat() + " kr.\n");
    }

    private void enterPayment(double payment) {
        controller.enterPayment(payment);
    }
}
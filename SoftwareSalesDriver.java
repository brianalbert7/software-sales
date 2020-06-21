package softwaresales;

/**
 *
 * @author Brian Albert
 */
public class SoftwareSalesDriver {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        SoftwareSales mySoftwareSales;
        int newNumberSold = 60; //Change this if you want to test a different quantity

        //Creation of object passing parameters
        mySoftwareSales = new SoftwareSales(1);
        mySoftwareSales.setNumberOfUnitsSold(newNumberSold);

        //Displaying getters
        System.out.printf("Quantity: "
                + mySoftwareSales.getNumberOfUnitsSold());
        System.out.printf("\nDiscount %%: "
                + mySoftwareSales.getDiscountPercent());
        System.out.printf("\nDiscount Amount: %.2f",
                mySoftwareSales.getDiscountAmount());
        System.out.printf("\nTotal Cost: %.2f \n",
                mySoftwareSales.getTotalCost());

        //Changing object using setter
        newNumberSold = 100; //Change this to the 2nd desired quantity
        mySoftwareSales.setNumberOfUnitsSold(newNumberSold);

        //Displaying object using toString method
        System.out.print(mySoftwareSales.toString() + "\n");
    }
}

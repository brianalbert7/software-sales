package softwaresales;

/**
 *
 * @author Brian Albert
 */
public class SoftwareSales {

    /**
     * @param args the command line arguments
     */
    private int numberOfUnitsSold;
    private int discountPercent;
    private double discountAmount;
    private double totalCost;
    private String discountAmountString;
    private String totalCostString;

    /**
     * Constructor
     *
     * @param initialNumberSold value for numberOfUnitsSold field
     */
    public SoftwareSales(int initialNumberSold) {
        numberOfUnitsSold = initialNumberSold;
    }

    /**
     * The getNumberOfUnitsSold method returns the value stored in the
     * numberOfUnitsSold field.
     *
     * @return value from numberOfUnitsSold field
     */
    public int getNumberOfUnitsSold() {
        return numberOfUnitsSold;
    }

    /**
     * The getDiscountPercent method returns the value stored in the
     * discountPercent field.
     *
     * @return value from discountPercent field
     */
    public int getDiscountPercent() {
        return discountPercent;
    }

    /**
     * The getDiscountAmount method returns the value stored in the
     * discountAmount field.
     *
     * @return value from discountAmount field
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * The getTotalCost method returns the value stored in the totalCost field.
     *
     * @return value from totalCost field
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * The setNumberOfUnitsSold method accepts an argument which is stored in
     * the numberOfUnitsSold field.
     *
     * @param newNumberSold value for numberOfUnitsSold field
     */
    public void setNumberOfUnitsSold(int newNumberSold) {
        numberOfUnitsSold = newNumberSold;

        if (numberOfUnitsSold < 10) {
            discountPercent = 0;
        } else if (numberOfUnitsSold >= 10 && numberOfUnitsSold <= 19) {
            discountPercent = 20;
        } else if (numberOfUnitsSold >= 20 && numberOfUnitsSold <= 49) {
            discountPercent = 30;
        } else if (numberOfUnitsSold >= 50 && numberOfUnitsSold <= 99) {
            discountPercent = 40;
        } else if (numberOfUnitsSold >= 100) {
            discountPercent = 50;
        }

        discountAmount = (double) numberOfUnitsSold * 99
                * discountPercent / 100;
        discountAmountString = String.format("%.2f", discountAmount);

        totalCost = (double) numberOfUnitsSold
                * 99 - discountAmount;
        totalCostString = String.format("%.2f", totalCost);
    }

    /**
     * toString method returns the data in the Software Sales object
     *
     * @return data in the Software Sales object
     */
    public String toString() {
        return "Quantity: " + numberOfUnitsSold + "\nDiscount %: "
                + discountPercent + "\nDiscount Amount: " + discountAmountString
                + "\nTotal Cost: " + totalCostString;
    }
}

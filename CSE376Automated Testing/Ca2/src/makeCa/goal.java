package makeCa;

public class goal {

    public double discount(double cost, int item) {

        double di = 0.0;

        // Apply discount based on the number of items
        if (item >= 100) {
            di = 0.2;
        } else if (item >= 50) {
            di = 0.1;
        } else if (item >= 10) {
            di = 0.05;
        }

        
        double to = item * cost * di;
        
        // Calculate final price after applying the discount
        double finalPrice = (cost * item) - to;
        
        return finalPrice;
    }
}

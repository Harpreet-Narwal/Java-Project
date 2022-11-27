import java.util.Scanner;

public class Main {

    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {

        return exploreCombinations(n, 0, 0, bundleQuantities, bundleCosts);
    }

    static int exploreCombinations(int budget, int currentQuantity, int currentCost, int[] bundleQuantities, int[] bundleCosts) {
        int maxQuantity = currentQuantity;
        for (int i = 0; i < bundleQuantities.length; i++) {
            if (currentCost + bundleCosts[i] <= budget) {

                int amount = exploreCombinations(budget, currentQuantity + bundleQuantities[i], currentCost + bundleCosts[i], bundleQuantities, bundleCosts);

                //                System.out.println("Buy "+ bundleQuantities[i] + "From shop" + i + "at" + bundleCosts[i]);

                if (maxQuantity < amount) {
                    if (maxQuantity < amount)
//                        System.out.println("Buy "+ bundleQuantities[i] + "From shop" + i + "at" + bundleCosts[i]);
                    maxQuantity = amount;

                }

            }

        }
        return maxQuantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] quantities = {20, 19};
        int[] costs = {24, 20};
        for (int i=0;i<quantities.length;i++)
        {
            System.out.println(quantities[i]+" Kg is of "+costs[i]+" Rupees at shop "+(i+1));
        }
        System.out.println("Enter your Budget");
        int b = sc.nextInt();
        int i = budgetShopping(b, quantities, costs);
        System.out.println("Total amount shopped: "+i+" Kg ");
    }
}
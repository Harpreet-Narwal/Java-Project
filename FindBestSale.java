import  java.util.*;
class Main {
    public int shoppingOffers(ArrayList<Integer> price, ArrayList<ArrayList<Integer>> special, ArrayList<Integer> needs) {
        return helper(price, special, needs, 0);
    }

    public int helper(ArrayList<Integer> price, ArrayList<ArrayList<Integer>> special, ArrayList<Integer> needs, int pos) {
        int sum = 0, len = price.size();
        for (int i = 0; i < len; i++) sum += needs.get(i)*price.get(i);

        for (int i = pos; i < special.size(); i++) {
            ArrayList<Integer> list = special.get(i);
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j= 0; j < needs.size(); j++) {
                if (needs.get(j) < list.get(j)) {
                    temp =  null;
                    break;
                }
                temp.add(needs.get(j) - list.get(j));
            }
            if (temp != null) {
                sum = Math.min(sum, list.get(list.size() - 1) + helper(price, special, temp, i));
            }
        }
        return sum;
    }
    public static void main (String[] args) {
        char c = 'A';
        char c1='A';
        int n;
        Scanner sc = new Scanner(System.in);
ArrayList<Integer> price = new ArrayList<>();
ArrayList<ArrayList<Integer>> special = new ArrayList<>();
ArrayList<Integer> needs = new ArrayList<>();
price.add(2);
price.add(5);
ArrayList<Integer> a1 = new ArrayList<>();
a1.add(3);
a1.add(0);
a1.add(5);
ArrayList<Integer> a2 = new ArrayList<>();
a2.add(1);
a2.add(2);
a2.add(10);
special.add(a1);
special.add(a2);
for(int i =0;i < price.size();i++)
{
    System.out.println("Price of "+(c++)+" is "+price.get(i)+"₹");
    System.out.println("Enter the piece of "+(c1++)+" needed");
    n = sc.nextInt();
    needs.add(n);
}
System.out.println();
System.out.println("In special offer 1, you can pay 5₹ for 3 piece of A and 0 piece of B \nIn special offer 2, you can pay 10₹ for 1 piece of A and 2 piece of B." );
System.out.println();
int s;
Main obj = new Main();
s = obj.shoppingOffers(price,special,needs);
System.out.println("Best price you can pay is "+s+"₹");
System.out.println("\nDescription: You need to buy 3 piece of A and 2 piece of B, so you may pay 10₹ for 1 piece of A and 2 piece of B (special offer #2),\nand 4₹ for 2 piece of A(Origional Price)\n");
System.out.println("Note: This description is applicable only if choose to buy 3 piece of A and 2 piece of B but the code works for any quantity needed");
    }
}
import java.util.Scanner;

 

 class Weight {

    private int kg;

    private int gm;

 

    public Weight() {

        kg = 0;

        gm = 0;

    }

 

    public Weight(int kg, int gm) {

        this.kg = kg;

        this.gm = gm;

    }

 

    public void readWeight() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight in kg: ");

        kg = sc.nextInt();

        System.out.print("Enter the weight in gm: ");

        gm = sc.nextInt();

    }

 

    public void displayWeight() {

        System.out.println("Weight: " + kg + " kg " + gm + " gm");

    }

 

    public Weight addWeight(Weight w) {

        Weight sum = new Weight();

        sum.kg = kg + w.kg;

        sum.gm = gm + w.gm;

        if (sum.gm >= 1000) {

            sum.kg += sum.gm / 1000;

            sum.gm %= 1000;

        }

        return sum;

    }

 

    public Weight subtractWeight(Weight w) {

        Weight diff = new Weight();

        if (kg < w.kg || (kg == w.kg && gm < w.gm)) {

            System.out.println("Error: Cannot subtract a larger weight from a smaller weight");

            return diff;

        }

        diff.kg = kg - w.kg;

        if (gm < w.gm) {

            diff.kg--;

            diff.gm = gm + 1000 - w.gm;

        } else {

            diff.gm = gm - w.gm;

        }

        return diff;

    }

}

 

public class WeightOperations {

    public static void main(String[] args) {

        Weight w1 = new Weight();

        w1.readWeight();

        w1.displayWeight();

 

        Weight w2 = new Weight();

        w2.readWeight();

        w2.displayWeight();

 

        Weight sum = w1.addWeight(w2);

        System.out.print("Sum of weights: ");

        sum.displayWeight();

 

        Weight diff = w1.subtractWeight(w2);

        System.out.print("Difference of weights: ");

        diff.displayWeight();

    }

}

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {
    private ArrayList<String> flowers;
    private double total;

    public FlowerShop() {

        //Instantiating and populating flower list
        flowers = new ArrayList<>();

        flowers.add("Rose");
        flowers.add("Mælkebøtte");
        flowers.add("Forglemmigej");
        flowers.add("Solsikke");
        flowers.add("Påskelilje");
        flowers.add("Tidsel");
        flowers.add("Tulipan");
        flowers.add("Krokus");
        flowers.add("Vintergæk");
        flowers.add("Valmue");
    }

    private void displayList() {
        for (String flower : flowers) {
            System.out.println((flowers.indexOf(flower) + 1) + ") " + flower);
        }
        System.out.println("\n"+ "Prisliste:" +
                "\n" + "Blomst 1-4: 20kr" +
                "\n" + "Blomst 5-7: 40kr" +
                "\n" + "Blomst 8-10: 80kr " +
                "\n" + "Buket: 50kr");
    } //displayList end

    public void runDialog() {
        ArrayList<String> choices = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;

        displayList();

        for (int i = 0; i < 3; i++) {

            System.out.println("Skriv tal på blomst du vil lægge i kurven og tryk enter");
            while (true) {
                if(input.hasNextInt()) {
                    choice = input.nextInt();
                    input.nextLine();

                    if (choice >= 1 && choice <= 10) {
                        choices.add(flowers.get(choice - 1));

                        if (choice <= 4) {
                            total += 20;
                        } else if (choice <= 7) {
                            total += 40;
                        } else {
                            total += 80;
                        }

                        System.out.println(flowers.get(choice - 1) + " er lagt i kurven. Din total er: " + total + "kr");
                        break;
                    } else {
                        System.out.println("Vælg kun tal mellem 1 og 10 tak");
                    }
                } else {
                    System.out.println("Vælg venligst et gyldigt tal");
                    //flush invalid input
                    input.nextLine();
                }

            }
        }

        System.out.println("Vil du have bundet blomsterne i en buket? (y/n)");
        String bouquetAnswer = input.nextLine().trim();

        if (bouquetAnswer.equalsIgnoreCase("y")) {
            total += 50;
            System.out.println("Din buket består nu af: ");

            for (String flowerchoice : choices) {
                System.out.println(flowerchoice);
            }

            System.out.println("Du bedes betale " + total + "kr");

        } else if (bouquetAnswer.equalsIgnoreCase("n")) {
            System.out.println("Du bedes betale " + total + "kr");
        }

    } //runDialog end

} //Class end

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Cat> cats = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private static CatLogic catLogic = new CatLogic();

    public Game() {

    }

    public void gameStart() {

        while (true) {
            showMenu();
        }
    }

    private void createCat() {

        cats.add(catLogic.createCat());
    }

    private void printCats() {
        System.out.println(cats.toString());
    }

    private void showMenu() {
        System.out.println("0 : New cat");
        System.out.println("1 : Show cats");
        System.out.println("Or Exit");
        String choice = input.nextLine();
        switch (Integer.parseInt(choice)) {
            case 0:
                createCat();
                printCats();
                break;
            case 1:
                printCats();
                break;
            case 2:
                selectCat();
                break;
            default:
                System.exit(1);
                break;

        }
    }

    private void selectCat() {
        printCats();
        String selectedCat = input.nextLine();
        Cat cat = cats.get(Integer.parseInt(selectedCat) - 1);
        System.out.println("Du har valgt: " + cat.toString());
        catMenu(cat);
    }

    private void catMenu(Cat cat) {
        while (true) {
            System.out.println("0 : Age cat by 1 \n1 : Back to main menu");
            switch (Integer.parseInt(input.nextLine())) {
                case 0:
                    birthday(cat);
                    break;
                case 1:
                    return;
                default:
                    break;
            }
        }
    }

    private void birthday(Cat cat) {
        catLogic.ageCat(cat);
        System.out.println(cat.toString());
    }
}

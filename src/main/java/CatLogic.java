import java.util.Scanner;

public class CatLogic {
    public CatLogic(){}

    public Cat createCat(){
        System.out.println("Give cat age");

        Scanner input = new Scanner(System.in);
        Cat cat = new Cat();
        cat.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Give cat name");
        cat.setName(input.nextLine());
        return cat;
    }
    public Cat ageCat(Cat cat){
        cat.setAge(cat.getAge()+1);
        return cat;
    }
}

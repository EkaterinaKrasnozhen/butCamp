package homeWorkSem1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human1 = new Human("Irina", 68, Gender.Female, null, null);
        Human human2 = new Human("Leonid", 69, Gender.Male, null, null);
        Human human3 = new Human("Liudmila", 62, Gender.Female, null, null);
        Human human4 = new Human("Alexander", 65, Gender.Male,null, null);
        Human human5 = new Human("Kate", 36, Gender.Female, human2, human1);
        Human human6 = new Human("Pavel", 37, Gender.Male, human4, human3);
        Human human7 = new Human("Yaroslav", 7, Gender.Male, human6, human5);
        Human human8 = new Human("Sviatoslav", 3, Gender.Male, human6, human5);

        FamilyTree tree = new FamilyTree();
        tree.add(human1);
        tree.add(human2);
        tree.add(human3);
        tree.add(human4);
        tree.add(human5);
        tree.add(human6);
        tree.add(human7);
        tree.add(human8);
        // System.out.println(tree);
        // System.out.println("--------");
        
        // System.out.printf(" Объект - %s \n Мать Объекта -  %s Отец Объекта - %s", human7.getName(), human7.getMother(), human7.getFather());
        // System.out.println("--------");
        
        // System.out.printf("Дети Объекта: %s\n", human5.getChildren());
        // System.out.println("--------");
        
        // List<Human> findSisBro = human7.getSisBro();
        // System.out.printf("Братья/сестры Объекта \n %s", findSisBro);
        // System.out.println("--------");
        
        // List<Human> grands = human8.getGrands();
        // System.out.printf("Бабушки/дедушки Объекта: \n%s", grands);
        // System.out.println();
          
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Start search by Name: ");
        // String get_user = iScanner.nextLine();
        // iScanner.close();
        // List<Human> res = tree.getHumanbyName(get_user);
        // System.out.println(res);

        Writeble w = new TxtHander();

        // String [] result = w.read().replace(":", "").replace("[", "")
        //                            .replace("]", "").replace(",", "")
                                //    .split(" ");

        // for (String element : result) {
        //     System.out.print(element + " ");
        // } 
        FamilyTree tree1 = new FamilyTree();
        tree1 = w.read();
        System.out.println(tree1);

    }
}

//В классе `Function` осуществляется вызов функций исследования с приглашением к вводу имени человека
package OOP_DZ_1;

import java.util.Scanner;

public class Function {
    public static void PrintTree(Tree tree) {
        System.out.print("Введите имя члена семьи, родственные связи которого вы хотите отобразить: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        Research.printParent(name, tree);
        Research.printChildren(name, tree);
        Research.printBrother(name, tree);
        Research.printSister(name, tree);
        Research.printSpouse(name, tree);
        Research.printGrandParent(name, tree);
        Research.printGrandChildren(name, tree);
        Research.printAuntUncle(name, tree);
        Research.printNephewNiece(name, tree);
        Research.printCousine(name, tree);
        Research.printSisterInLaw(name, tree);
        Research.printBrotherInLaw(name, tree);
        Research.printParentInLaw(name, tree);
        Research.printChildrenInLaw(name, tree);
    }
}

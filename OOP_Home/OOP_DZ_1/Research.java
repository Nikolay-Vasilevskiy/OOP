//В классе `Research` определяются методы исследования генеалогического дерева
package OOP_DZ_1;

import java.util.List;

public class Research {
    public static void printParent(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.CHILD) {
                System.out.println(name + " are children: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printChildren(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.PARENT) {
                System.out.println(name + " are parent: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printBrother(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.BROTHER) {
                System.out.println(name + " are brother: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSister(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.SISTER) {
                System.out.println(name + " are sister: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSpouse(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.SPOUSE) {
                System.out.println(name + " are spouse: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printGrandParent(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.GRANDPARENT) {
                System.out.println(name + " are grandparent: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printGrandChildren(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.GRANDCHILDREN) {
                System.out.println(name + " are grandchildren: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printAuntUncle(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.NEPHEW) {
                System.out.println(name + " are nephew: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.NIECE) {
                System.out.println(name + " are niece: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printNephewNiece(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.UNCLE) {
                System.out.println(name + " are uncle: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.AUNT) {
                System.out.println(name + " are aunt: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printCousine(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.COUSINE) {
                System.out.println(name + " are cousine: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSisterInLaw(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.SISTER_IN_LAW) {
                System.out.println(name + " are sister-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printBrotherInLaw(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.BROTHER_IN_LAW) {
                System.out.println(name + " are brother-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printParentInLaw(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.DAUGHTER_IN_LAW) {
                System.out.println(name + " are daughter-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.SON_IN_LAW) {
                System.out.println(name + " are son-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printChildrenInLaw(String name, Tree tree) {
        List<Сonnections> links = tree.getLinks();

        for (Сonnections el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.MOTHER_IN_LAW) {
                System.out.println(name + " are mother-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
            if (el.getPersonFirst().getName().equals(name) && el.getLink() == family_ties.FATHER_IN_LAW) {
                System.out.println(name + " are father-in-law: " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }
}

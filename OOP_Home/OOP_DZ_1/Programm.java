//В классе `Programm` содержится тело программы и точка входа, перечислены несколько человек и прописаны их связи. 
//Отсюда же запускается `Function`
package OOP_DZ_1;

public class Programm {
    public static void main(String[] args) {
        Persona person = new Persona("Nikolay", "Ivanov");
        Persona person1 = new Persona("Zoya", "Ivanova");
        Persona person2 = new Persona("Lena", "Ivanova");
        Persona person3 = new Persona("Sweta", "Petrova");
        Persona person4 = new Persona("Alexandr", "Sidorov");
        Persona person5 = new Persona("Lyuba", "Sidorova");
        Persona person6 = new Persona("Dima", "Petrov");
        Persona person7 = new Persona("Misha", "Ivanov");
        Persona person8 = new Persona("Kseniya", "Ivanova");
        Persona person9 = new Persona("Ivan", "Petrov");
        Persona person10 = new Persona("Sergey", "Petrov");
        Persona person11 = new Persona("Aleksey", "Sidorov");
        Persona person12 = new Persona("Lida", "Sidorova");

        Tree tree = new Tree();
        tree.addLink(person, person1, family_ties.SPOUSE, family_ties.SPOUSE);
        tree.addLink(person, person2, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person, person3, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person1, person2, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person1, person3, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person2, person3, family_ties.SISTER, family_ties.SISTER);
        tree.addLink(person, person7, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person, person8, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person, person9, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person, person10, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person1, person7, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person1, person8, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person1, person9, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person1, person10, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);

        tree.addLink(person11, person12, family_ties.SPOUSE, family_ties.SPOUSE);
        tree.addLink(person11, person4, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person11, person5, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person12, person4, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person12, person5, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person4, person5, family_ties.BROTHER, family_ties.SISTER);
        tree.addLink(person11, person7, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person11, person8, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person12, person7, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);
        tree.addLink(person12, person8, family_ties.GRANDPARENT, family_ties.GRANDCHILDREN);

        tree.addLink(person2, person4, family_ties.SPOUSE, family_ties.SPOUSE);
        tree.addLink(person2, person7, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person2, person8, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person4, person7, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person4, person8, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person7, person8, family_ties.BROTHER, family_ties.SISTER);

        tree.addLink(person3, person6, family_ties.SPOUSE, family_ties.SPOUSE);
        tree.addLink(person3, person9, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person3, person10, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person6, person9, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person6, person10, family_ties.PARENT, family_ties.CHILD);
        tree.addLink(person9, person10, family_ties.BROTHER, family_ties.BROTHER);

        tree.addLink(person2, person9, family_ties.AUNT, family_ties.NEPHEW);
        tree.addLink(person2, person10, family_ties.AUNT, family_ties.NEPHEW);
        tree.addLink(person4, person9, family_ties.UNCLE, family_ties.NEPHEW);
        tree.addLink(person4, person10, family_ties.UNCLE, family_ties.NEPHEW);
        tree.addLink(person3, person7, family_ties.AUNT, family_ties.NEPHEW);
        tree.addLink(person3, person8, family_ties.AUNT, family_ties.NIECE);
        tree.addLink(person5, person7, family_ties.AUNT, family_ties.NEPHEW);
        tree.addLink(person5, person8, family_ties.AUNT, family_ties.NIECE);
        tree.addLink(person6, person7, family_ties.UNCLE, family_ties.NEPHEW);
        tree.addLink(person6, person8, family_ties.UNCLE, family_ties.NIECE);

        tree.addLink(person7, person9, family_ties.COUSINE, family_ties.COUSINE);
        tree.addLink(person7, person10, family_ties.COUSINE, family_ties.COUSINE);
        tree.addLink(person8, person9, family_ties.COUSINE, family_ties.COUSINE);
        tree.addLink(person8, person10, family_ties.COUSINE, family_ties.COUSINE);

        tree.addLink(person2, person5, family_ties.SISTER_IN_LAW, family_ties.SISTER_IN_LAW);
        tree.addLink(person3, person5, family_ties.SISTER_IN_LAW, family_ties.SISTER_IN_LAW);
        tree.addLink(person3, person4, family_ties.SISTER_IN_LAW, family_ties.BROTHER_IN_LAW);
        tree.addLink(person2, person6, family_ties.SISTER_IN_LAW, family_ties.BROTHER_IN_LAW);
        tree.addLink(person4, person6, family_ties.BROTHER_IN_LAW, family_ties.BROTHER_IN_LAW);

        tree.addLink(person, person4, family_ties.FATHER_IN_LAW, family_ties.SON_IN_LAW);
        tree.addLink(person, person6, family_ties.FATHER_IN_LAW, family_ties.SON_IN_LAW);
        tree.addLink(person1, person4, family_ties.MOTHER_IN_LAW, family_ties.SON_IN_LAW);
        tree.addLink(person1, person6, family_ties.MOTHER_IN_LAW, family_ties.SON_IN_LAW);
        tree.addLink(person11, person2, family_ties.FATHER_IN_LAW, family_ties.DAUGHTER_IN_LAW);
        tree.addLink(person12, person2, family_ties.MOTHER_IN_LAW, family_ties.DAUGHTER_IN_LAW);

        Function.PrintTree(tree);
    }

}

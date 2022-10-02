
/**
* В классе `Programm` содержится тело программы и точка входа, перечислены несколько человек 
(хозяин кошки и хозяин собаки) и животные. 
Отсюда же осуществляется вызов функций исследования класса `Research` c пробежкой по всем командам
*/
package oop_dz_2;

public class Programm {

    public static void main(String[] args) {

        HumanTree peoples = new HumanTree();

        peoples.add(new DogLover("Nikolay", 43));
        peoples.add(new CatLover("Oksana", 40));

        System.out.println("List of humans:\n" + peoples);

        AnimalTree animals = new AnimalTree();
        animals.add(new Cat("Sonja", 3));
        animals.add(new Dog("Manja", 5));

        System.out.println("List of animals:\n" + animals);

        Research.getCatLovers(peoples);
        Research.getDogLovers(peoples);
        Research.getCats(animals);
        Research.getDogs(animals);
        Research.getAction(peoples, animals, null);
    }
}

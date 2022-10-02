package oop_dz_2;
/**
 * в классе `CatLover` задается реакция кошки,когда ее зовет кошатница
 */
public class CatLover extends Human implements Action {

    public CatLover(String name, int age) {
        super(name, age);
    }

    @Override
    public void call(Animal animal, Commands command) {
        if (animal instanceof Cat) {
            System.out.printf("%s say to %s: %s\n", super.getName(), animal.getNickName(), command);
            switch (command) {
                case KISKIS -> animal.positiveReaction();
                case COME -> animal.come();
                case EAT -> animal.eat();
                case WHISTLE -> animal.ignoring();
                case WALK -> animal.ignoring();
                case BATHE -> animal.negativeReaction();
            }

        } else if (animal instanceof Dog) {
            System.out.printf("%s say to %s: %s\n", super.getName(), animal.getNickName(), command);
            switch (command) {
                case KISKIS -> animal.ignoring();
                case COME -> animal.come();
                case EAT -> animal.eat();
                case WHISTLE -> animal.positiveReaction();
                case WALK -> animal.positiveReaction();
                case BATHE -> animal.negativeReaction();
            }
        }
    }
}

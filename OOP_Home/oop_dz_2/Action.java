/*
 * Интерфейс `Action` переопределяется в классах `CatLover` и `DogLover` и задается разная реакция животных 
 * в зависимости от того, кошатник или собачник их зовёт
 */
package oop_dz_2;

public interface Action {

    void call(Animal animal, Commands command);
}

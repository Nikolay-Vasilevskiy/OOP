//В классе `Persona` описана модель человека с полями имя и фамилия
package OOP_DZ_1;

public class Persona {
    private String name;
    private String surname;

    public Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

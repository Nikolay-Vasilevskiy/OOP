//В классе `Сonnections` описываются родственные связи двух людей в обе стороны
package OOP_DZ_1;

public class Сonnections {
    private Persona personFirst;
    private Persona personSecond;
    private family_ties link;

    public Сonnections(Persona personFirst, Persona personSecond, family_ties link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Persona getPersonFirst() {
        return personFirst;
    }

    public Persona getPersonSecond() {
        return personSecond;
    }

    public family_ties getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "personFirst=" + personFirst +
                ", personSecond=" + personSecond +
                ", link=" + link +
                '}';
    }
}

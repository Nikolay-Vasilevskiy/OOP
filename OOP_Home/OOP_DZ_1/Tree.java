//В классе `Tree` хранятся связи двух людей в обе стороны
package OOP_DZ_1;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Сonnections> links = new ArrayList<>();

    public List<Сonnections> getLinks() {
        return links;
    }

    public void addLink(Persona p1, Persona p2, family_ties link1, family_ties link2) {
        Сonnections l1 = new Сonnections(p1, p2, link1);
        Сonnections l2 = new Сonnections(p2, p1, link2);

        links.add(l1);
        links.add(l2);
    }
}

package legoset;

import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws JAXBException {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber("75211");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper",2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper",1));
        legoSet.setMinifigs(minifigs);
        ArrayList<Weight> weights = new ArrayList<>();
        weights.add(new Weight("kg", 0.89));
        legoSet.setWeights(weights);
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        //System.out.println(legoSet);

        JAXBHelper.toXML(legoSet, System.out);

    }

}

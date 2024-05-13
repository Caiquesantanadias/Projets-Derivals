
import java.util.LinkedList;

record Place (String name, int distance) {}


class main {

    public static void main(String[] args) {

        LinkedList<Place> placetoVisit = new LinkedList<>();


        Place luxembourg = new Place("Luxembourg", 560);

        addPlace(placetoVisit, luxembourg );
        System.out.println(placetoVisit);
    }

    private static void addPlace(LinkedList<Place> list , Place place) {


        if (list.contains(place)){
            System.out.println("Found duplicate : " + place);
            return;
        }
        list.add(place);
    }
}


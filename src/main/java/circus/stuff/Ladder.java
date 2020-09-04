<<<<<<< HEAD:src/main/java/circus/Ladder.java
package circus;
=======
package circus.stuff;
>>>>>>> origin/improved:src/main/java/circus/stuff/Ladder.java

public class Ladder extends Equipment {

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 2;
    }
}

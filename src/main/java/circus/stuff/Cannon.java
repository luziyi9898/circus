<<<<<<< HEAD:src/main/java/circus/Cannon.java
package circus;
=======
package circus.stuff;
>>>>>>> origin/improved:src/main/java/circus/stuff/Cannon.java

public class Cannon extends Equipment {

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}

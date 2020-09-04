<<<<<<< HEAD:src/main/java/circus/Equipment.java
package circus;

public abstract class Equipment {
=======
package circus.stuff;

import circus.Asset;

public abstract class Equipment implements Asset {
>>>>>>> origin/improved:src/main/java/circus/stuff/Equipment.java
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}

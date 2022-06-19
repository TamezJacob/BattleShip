public class ShipColor {

    String currentColor;

    ShipColor() {
        this.currentColor = "Cyan";
    }

    ShipColor(String shipColor) {
        this.currentColor = shipColor;
    }

    void setShipColor(String shipColor) {
        this.currentColor = shipColor;
    }

    String getShipColor() {
        return this.currentColor;
    }

}

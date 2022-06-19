import java.awt.Color;

public class ShipColor {

    private Color shipColor;

    ShipColor() {
        this.shipColor = Color.cyan;
    }

    ShipColor(Color shipColor) {
        this.shipColor = shipColor;
    }

    Color getShipColor() {
        return shipColor;
    }

    void setShipColor(Color shipColor) {
        this.shipColor = shipColor;
    }

    void setShipColorString(String colorString){
        switch (colorString) {
            case "Cyan":
                setShipColor(Color.cyan);
                break;
            case "Red":
                setShipColor(Color.red);
                break;
            case "Blue":
                setShipColor(Color.blue);
                break;
            case "Yellow":
                setShipColor(Color.yellow);
                break;
            case "Green":
                setShipColor(Color.green);
                break;
            default:
                break;
        }
    }

}

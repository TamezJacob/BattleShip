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

    void setShipColor(String colorString){
        switch (colorString) {
            case "Cyan":
                setShipColor(Color.cyan);
                break;
            case "Red":
                setShipColor(new Color(204,0,0));
                break;
            case "Blue":
                setShipColor(new Color(51,153,255));
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

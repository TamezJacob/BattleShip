import java.awt.*;

public class BoardColor {

    private Color BoardColor;

    BoardColor() { this.BoardColor = Color.white;
    }

    BoardColor(Color BoardColor) {
        this.BoardColor = BoardColor;
    }

    Color getBoardColor() {
        return BoardColor;
    }

    void setBoardColor(Color BoardColor) {
        this.BoardColor = BoardColor;
    }

    void setBoardColor(String colorString){
        switch (colorString) {
            case "White":
                setBoardColor(Color.white);
                break;
            case "Cyan":
                setBoardColor(Color.cyan);
                break;
            case "Red":
                setBoardColor(Color.red);
                break;
            case "Blue":
                setBoardColor(new Color(51,153,255));
                break;
            case "Yellow":
                setBoardColor(Color.yellow);
                break;
            case "Green":
                setBoardColor(Color.green);
                break;
            default:
                break;
        }
    }
}

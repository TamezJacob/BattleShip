import java.awt.*;

public class BoardColor {

    private Color BoardColor;

    BoardColor() { this.BoardColor = Color.blue;
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
            case "Cyan":
                setBoardColor(Color.cyan);
                break;
            case "Red":
                setBoardColor(Color.red);
                break;
            case "Blue":
                setBoardColor(Color.blue);
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

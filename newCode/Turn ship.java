import java.util.ArrayList;
import java.util.Iterator;

//turn ship vertically towards north
public void addVerticalShip(Coordinate a, Coordinate b, Coordinate c)
    {
        Coordinate aNew = new Coordinate(a.getX(), a.getY());
        Coordinate bNew = new Coordinate(a.getX(), a.getY() - 1);
        Coordinate cNew = new Coordinate(a.getX(), a.getY() - 2);
        fleet.add(new Ship(aNew, bNew, cNew));
        setSelfData(aNew, bNew, cNew);
    }
//turn ship vertically towards south
public void addVerticalShip(Coordinate a, Coordinate b, Coordinate c)
    {
        Coordinate aNew = new Coordinate(a.getX(), a.getY());
        Coordinate bNew = new Coordinate(a.getX(), a.getY() + 1);
        Coordinate cNew = new Coordinate(a.getX(), a.getY() + 2);
        fleet.add(new Ship(aNew, bNew, cNew));
        setSelfData(aNew, bNew, cNew);
    }
//turn ship horiontally towards west
    public void addVerticalShip(Coordinate a, Coordinate b, Coordinate c){
        Coordinate aNew = new Coordinate(a.getX(), a.getY());
        Coordinate bNew = new Coordinate(a.getX()-1, a.getY() );
        Coordinate cNew = new Coordinate(a.getX()-2, a.getY() );
        fleet.add(new Ship(aNew, bNew, cNew));
        setSelfData(aNew, bNew, cNew);
    }
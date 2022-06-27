## GUI INFO

**PlayerScreen.java**  
	- Manages the shell screen that the player can interface with, but NOT the map grid map used for the game.  
	
**SelfGrid.java**  
	- Manages the grid that the game is taking place on.  

**BattleGrid.java**  
	- Creates the individual cells for the game map.  


## CLASS INFO

**BattleShip.java**  
	- *main()* function location.  
	- Implements the **GameState.java** interface

**Coordinate.java**  
	- Object for managing an x and y coordinates.  
	- Has getter functions for x and y, a boolean function for comparing whether two coordinate objects are equal, and a toString function.  
	- Other classes referenced in: **AttackGrid.java**, **PlayerData.java**, **SelfGrid.java**  

**Ship.java**  
	- Manages coordinate values of the ship.  
	- Manages boolean values for if a ship's "piece" is hit or not hit at a specific coordinate.  
	- Has a function that prints the coordinates of the ship.  
	- Other classes referenced in: **PlayerData.java**  
	
	
## GUI Implementation - Setting Colors on Board
**Follow the instructions below to implement an already built GUI button located in PlayerScreen.java:**  
1. Create an object class for the type to be implemented. The [ShipColor.java](https://bitbucket.org/cs-3398-su22-gorns/battlespaceship/src/master/src/main/java/ShipColor.java) class can be used as an example.  
2. Create an object of the class in [PlayerData.java](https://bitbucket.org/cs-3398-su22-gorns/battlespaceship/src/master/src/main/java/PlayerData.java) and initialize it in the constructor.  
3. Create getters and setters in [PlayerData.java](https://bitbucket.org/cs-3398-su22-gorns/battlespaceship/src/master/src/main/java/PlayerData.java) which invoke the color getters and setters in the class you created.
See the "setShipColor"  and "getShipColor" for example.  
4. Create or alter the existing color in the draw() function of the [SelfGrid.java](https://bitbucket.org/cs-3398-su22-gorns/battlespaceship/src/master/src/main/java/SelfGrid.java) class, where the player's board is drawn.  
For example, "thePanel.setBackground(tempPlayer.getShipColor());" became "thePanel.setBackground(tempPlayer.setShipColor();". The tempPlayer object contains all data for the color selections made in the player's GUI menu.  
5. Create and implement the action listener for your GUI button in [PlayerScreen.java](https://bitbucket.org/cs-3398-su22-gorns/battlespaceship/src/master/src/main/java/PlayerScreen.java). 
See the "playerColorBox" object's action listener, it can be copied and altered to reflect the setter methods you made earlier for your object, in steps 1 and 3.   
Make sure that the "getSelfGrid().draw();" function is called after setting the color, in order to make the changes applicable in every game state.  
6. Confirm that the implementation works, as intended.  You will need to click on the board after changing colors in the GUI menu, for the application to occur.  
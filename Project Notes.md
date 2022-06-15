## GUI INFO

**PlayerScreen.java**  
	- Manages the shell screen that the player can interface with, but NOT the map grid map used for the game.  
	
**SelfGrid.java**  
	- Manages the grid that the game is taking place on.  

**BattleGrid.java**  
	- Creates the individual cells for the game map.  


## CLASS INFO

**BattleShip.java**  
	- *main()* class location.
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
public class Patch{

    private String _label;
    private int _pxcor, _pycor;
    private Patch[][]_grid;
    private Neighbors _neighbors;

    public Patch(int x, int y, Patch[][]_grid){
	_label = "o";
	_neighbors = getNeighbors();
	_pxcor = x;
	_pycor = y;
	_grid = new Patch[50][50];
    }

    public int getX(){
	return _pxcor;
    }

    public int getY(){
	return _pycor;
    }

    public void turnOn(){
	_label = "X";
    }

    public void turnOff(){
	_label = "o";
    }

    public boolean isAlive(){
	return (_label.equals("X"));
    }

    public int gridSize(){
	return _grid.length;
    }

    public Neighbors getNeighbors(){
	int a = getX() - 1;
	int b = getY() - 1;
	int c = getX() + 1;
	int d = getY() + 1;
        if (getX() == 0)
	    a = gridSize() - 1;
        if (getY() == 0)
	    b = gridSize() - 1;
        if (getX() == gridSize() - 1)
	    c = 0;
        if (getX() == gridSize() - 1)
	    d = 0;
	_neighbors.add(_grid[a][b]);
	_neighbors.add(_grid[getX()][b]);
	_neighbors.add(_grid[c][b]);
	_neighbors.add(_grid[a][getY()]);
	_neighbors.add(_grid[c][getY()]);
	_neighbors.add(_grid[a][d]);
	_neighbors.add(_grid[getX()][d]);
	_neighbors.add(_grid[c][d]);
	return _neighbors;
    }

    public int countAlive(){
	int ans = 0;
	for(int index = 0; index<8; index++){
	    if(_neighbors.getList()[index].isAlive())
		ans++;
	}
	return ans;
    }

}
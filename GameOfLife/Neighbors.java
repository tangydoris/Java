public class Neighbors{

    private Patch[]_list;

    public Neighbors(){
	_list = new Patch[8];

    }

    public int getAliveNumber(){
	int ans = 0;
	int pass = 0;
	int index = 0;
	while(pass<_list.length){
	    if(_list[index].equals("X")){
		ans++;
	    }
	}
	return ans;
    }

    public void add(Patch x){
	for(int index = 0; index<_list.length; index++){
	    if(_list[index].equals(null)){
		_list[index] = x;
	    }
	}
    }

    public Patch[] getList(){
	return _list;
    }





}
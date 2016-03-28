package tree.parse.stanFactory;

public class AppVersionAndNameStaner implements Staner {

	public Object stan(StringBuffer arg) {
		//TODO ½âÎö³översion.
    	String str_version = arg.toString() ;
		String[] goal = str_version.split("-");
		if(goal != null && goal.length ==2){
			return goal;
		}else{
			return null;
		}
	}

}

package tree.parse.stanFactory;

public class ClassNameStaner implements Staner {

	public Object stan(StringBuffer arg) {
		arg = new StringBuffer(arg.substring((arg
				.lastIndexOf(".") + 1)));
		arg.trimToSize();

		return arg;
	}

}

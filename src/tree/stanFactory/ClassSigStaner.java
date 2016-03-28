package tree.stanFactory;

public class ClassSigStaner implements Staner {

	public Object stan(StringBuffer arg) {
		String str = arg.substring(1);
		arg = new StringBuffer(str.replace("/", "."));
		arg.trimToSize();

		return arg;
	}

}

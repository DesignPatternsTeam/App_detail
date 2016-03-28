package tree.stanFactory;

public class PackageNameStaner implements Staner {

	public Object stan(StringBuffer arg) {
		if (arg.lastIndexOf(".") < 0) {
			return arg;
		}

		arg = new StringBuffer(arg.substring(0, arg
				.lastIndexOf(".")));
		arg.trimToSize();
		return arg;
	}

}

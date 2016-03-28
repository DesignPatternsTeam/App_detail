package tree.parse.parserFactory;

public class MethodNameParser implements Parser {

	public Object parse(StringBuffer line) {
		StringBuffer methodname = new StringBuffer(line.substring(8));
		methodname.trimToSize();
		if (methodname.toString().contains(" ")) {
			int index = methodname.lastIndexOf(" ");
			methodname = new StringBuffer(methodname.substring(index + 1));

		}
		if (methodname.toString().endsWith(";")) {
			methodname = new StringBuffer(methodname.substring(0, ((methodname
					.length()) - 1)));

		}

		return methodname;
	}

}

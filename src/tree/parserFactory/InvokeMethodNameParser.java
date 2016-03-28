package tree.parserFactory;

public class InvokeMethodNameParser implements Parser {

	public StringBuffer parse(StringBuffer line) {
		// TODO Auto-generated method stub
		try {
			int index = line.indexOf("->");

			line = new StringBuffer(line.substring(index + 2));
			line.trimToSize();

			if (line.toString().endsWith(";")) {
				line = new StringBuffer(line
						.substring(0, ((line.length()) - 1)));
			}

		} catch (Exception e) {
		}
		return line;
	}

}

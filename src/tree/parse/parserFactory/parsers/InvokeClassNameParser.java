package tree.parse.parserFactory.parsers;

import tree.parse.parserFactory.Parser;

public class InvokeClassNameParser implements Parser {

	public StringBuffer parse(StringBuffer line) {
		// TODO Auto-generated method stub
		try {
			int index1 = line.indexOf("},");
			int index2 = line.indexOf("->");

			line = new StringBuffer(line.substring((index1 + 3), (index2 - 1)));
			line.trimToSize();

		} catch (Exception e) {
		}

		return line;
	}

}

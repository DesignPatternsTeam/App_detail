package tree.parse.parserFactory.parsers;

import tree.parse.parserFactory.Parser;

public class ClassNameParser implements Parser {

	public Object parse(StringBuffer line) {
		StringBuffer classname = new StringBuffer((line.substring(7, (line
				.length()) - 1)));
		classname.trimToSize();
		if (classname.toString().contains(" ")) {
			int index = classname.lastIndexOf(" ");
			classname = new StringBuffer(classname.substring(index + 1));
		}

		return classname;
	}

}

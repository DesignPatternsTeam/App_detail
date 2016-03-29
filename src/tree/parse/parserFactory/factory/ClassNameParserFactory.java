package tree.parse.parserFactory.factory;

import tree.parse.parserFactory.Parser;
import tree.parse.parserFactory.Provider;
import tree.parse.parserFactory.parsers.ClassNameParser;

public class ClassNameParserFactory implements Provider {

	public Parser produce() {
		// TODO Auto-generated method stub
		return new ClassNameParser();
	}

}

package tree.utils;

public class ParserUtils {
	
	public static boolean isArrayLetter(String letter) {
		if ("[".equals(letter))
			return true;
		return false;
	}
	
	public static boolean isObjectLetter(String letter) {
		if ("L".equals(letter))
			return true;
		return false;
	}
	
	public static boolean isBaseLetter(String letter) {
		if (("Z".equals(letter)) || ("B".equals(letter))
				|| ("S".equals(letter)) || ("C".equals(letter))
				|| ("I".equals(letter)) || ("J".equals(letter))
				|| ("F".equals(letter)) || ("D".equals(letter)))
			return true;
		return false;
	}
	
	public static boolean isArray(String returntype) {
		if (returntype.startsWith("["))
			return true;
		return false;
	}
	
	public static boolean isObject(String returntype) {
		if (returntype.startsWith("L"))
			return true;
		return false;
	}
	
	public static boolean isBaseType(StringBuffer returntype) {
		if (returntype.length() == 1)
			return true;
		return false;
	}
}

package tree.stanFactory;

public class StanFactory {
	public static Staner producePackageNameStaner(){
		return new PackageNameStaner();
	}
	
	public static Staner produceClassSigStaner(){
		return new ClassSigStaner();
	}
	
	public static Staner produceClassNameStaner(){
		return new ClassNameStaner();
	}
	
	public static Staner produceAppVersionAndNameStaner(){
		return new AppVersionAndNameStaner();
	}
}

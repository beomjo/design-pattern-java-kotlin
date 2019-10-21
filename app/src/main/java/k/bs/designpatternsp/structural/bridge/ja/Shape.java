package k.bs.designpatternsp.structural.bridge.ja;

public abstract class Shape {
	//Composition - implementor
	protected Color color;
	
	public Shape(Color c){
		this.color=c;
	}
	
	abstract public void applyColor();
}
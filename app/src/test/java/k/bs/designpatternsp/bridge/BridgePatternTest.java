package k.bs.designpatternsp.bridge;

import k.bs.designpatternsp.pattern.bridge.ja.GreenColor;
import k.bs.designpatternsp.pattern.bridge.ja.Pentagon;
import k.bs.designpatternsp.pattern.bridge.ja.RedColor;
import k.bs.designpatternsp.pattern.bridge.ja.Shape;
import k.bs.designpatternsp.pattern.bridge.ja.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
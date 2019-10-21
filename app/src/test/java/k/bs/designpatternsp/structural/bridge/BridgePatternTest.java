package k.bs.designpatternsp.structural.bridge;

import k.bs.designpatternsp.structural.bridge.ja.GreenColor;
import k.bs.designpatternsp.structural.bridge.ja.Pentagon;
import k.bs.designpatternsp.structural.bridge.ja.RedColor;
import k.bs.designpatternsp.structural.bridge.ja.Shape;
import k.bs.designpatternsp.structural.bridge.ja.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
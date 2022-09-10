package VisitorPattern;

public class Shopper implements Visitor<Double>{

	@Override
	public Double visit(NY n) {
		// TODO Auto-generated method stub
		System.out.println("Visit NY and spend 35000 on clothes and watches");
		return 35000.00;
	}

	@Override
	public Double visit(Vegas n) {
		// TODO Auto-generated method stub
		System.out.println("Visit Vegas and lose 50k in the casino");
		return 50000.5;
	}
	

}

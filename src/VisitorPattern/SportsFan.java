package VisitorPattern;

public class SportsFan implements Visitor<String> {

	@Override
	public String visit(NY n) {
		// TODO Auto-generated method stub
		System.out.println("Visit MSG");
		return "MSG";
	}

	@Override
	public String visit(Vegas n) {
		// TODO Auto-generated method stub
		System.out.println("Visit UFC");
		return "Casinos";
	}
	

}

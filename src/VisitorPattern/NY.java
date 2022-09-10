package VisitorPattern;

public class NY implements City{

	@Override
	public void accept(Visitor<?> v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	

}

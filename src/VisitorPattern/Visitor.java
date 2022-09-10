package VisitorPattern;

public interface Visitor<T> {
	T visit(NY n);
	T visit(Vegas n);
	

}

package Jcg.geometry;

//public interface DataDomain extends Comparable<DataDomain> {
public abstract class DataDomain implements Comparable<DataDomain> {
	
	/** To use as constructor for classes extending DataDomain:
	 *  if X extends DataDomain, X.constructor() returns new X(),
	 *  assumed to be the element 0 of X  **/
	public static DataDomain constructor() { return null; }
	
	/** Return the i-th coordinate **/
	public abstract Number getCartesian(int i);  
	/** Set the i-th coordinate **/
	public abstract void setCartesian(int i, Number x);
	/** Return the dimension of the data **/	
	public abstract int dimension();
	/** Return a string representation of the data.
	 *  For example, (1,2,7) will be represented by string "1,2,7". **/
	public abstract String toString();
	/** Test if equal. To be equal, DataDomains must have the same dimension. **/
	public abstract boolean equals(DataDomain d);
	
	/** Set to 0 **/
	public abstract void setOrigin();
	/** Set values to those of d. d must have the same dimension. **/
	public abstract void copy(DataDomain d);
	/** Return an independent copy. **/
	public abstract DataDomain copy();
	
	/** this += d **/
	public abstract void add(DataDomain d);
	/** this -= d **/
	public abstract void take(DataDomain d);
	/** this *= s **/
	public abstract void multiplyBy(Number s);
	/** this /= s **/
	public abstract void divideBy(Number s);
		
	/** Return this + d **/
	public abstract DataDomain plus(DataDomain d);
	/** Return this -= d **/
	public abstract DataDomain minus(DataDomain d);
	/** Return this * s **/
	public abstract DataDomain multipliedBy(Number s);
	/** Return this / s **/
	public abstract DataDomain dividedBy(Number s);
	/** Return inner product of this and d **/
	public abstract Number innerProduct(DataDomain d);
	/** Return squared norm **/
	public abstract Number norm2();
	/** Return norm **/
	public abstract Number norm();
	
}


class Orientation {
	
	static int CLOCKWISE=1;
	static int COUNTERCLOCKWISE=-1;
	static int COLLINEAR=0;
	
	private int or;
	
	public Orientation(int or) {
		this.or = or;
	}
	
	public boolean isClockwise() {
		return this.or == CLOCKWISE;
	}

	public boolean isCounterclockwise() {
		return this.or == COUNTERCLOCKWISE;
	}

	public boolean isCollinear() {
		return this.or == COLLINEAR;
	}
	
}


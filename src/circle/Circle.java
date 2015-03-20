package circle;

public class Circle {
	private double xC;
	private double yC;
	private double r;
	
	/**
	 * @param xC
	 * @param yC
	 * @param r
	 */
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		this.r = r;
	}
	
	/**
	 * @return the xC
	 */
	public double getXC() {
		return xC;
	}
	/**
	 * @param xC the xC to set
	 */
	public void setXC(double xC) {
		this.xC = xC;
	}
	/**
	 * @return the yC
	 */
	public double getYC() {
		return yC;
	}
	/**
	 * @param yC the yC to set
	 */
	public void setYC(double yC) {
		this.yC = yC;
	}
	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		if(r>0){
			this.r = r;
		}
		else{
			throw new IllegalArgumentException("The value of a must be differente from 0.");
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}

	public double getXMin(){
		return this.xC - this.r;
	}
	
	public double getYMin(){
		return this.yC - this.r;
	}
	
	public double getXMax(){
		return this.xC + this.r;
	}
	
	public double getYMax(){
		return this.yC + this.r;
	}
	
	public boolean contains(Circle c){
		boolean contain = false;
		if(this.getXMin()<=c.getXMin() && this.getYMin()<=c.getYMin() && this.getXMax()>=c.getXMax() && this.getYMax()>=c.getYMax()){
			contain = true;
		}
		return contain;
	}
}

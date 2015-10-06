package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

//5주차 1번 과
public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() { //DiscountSale클래스 생성자 파라미터 없는 경우. 변수에 0을 지정.
		/** 구현 하시오 **/ 
	    setName("No name yet.");
	    setPrice(0);
	    setDiscount(0);
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** 구현 하시오 **/ 
	    if(theName == null || theName.isEmpty()) { 
	      //만약 파라미터로 String이 null 또는 비어있는 값으로 호출된 경우.
	        setName("No name yet.");
	    }else{
	        setName(theName);    
	    }	    
        setPrice(thePrice);
        setDiscount(theDiscount);
	    
	}
	
	//DiscountSale의 생성자. 파라미터가 DiscountSale 객체인 경우.
	public DiscountSale(DiscountSale originalObject) {
		/** 구현 하시오 **/ 
	    setName(originalObject.getName());
	    setPrice(originalObject.getPrice());
	    setDiscount(originalObject.getDiscount());
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	//할인된 가격 계산하여 리턴해주는 메소드.
	public double bill() {
		/** 구현 하시오 **/
	    double discountPrice = getPrice() * (100-discount)/100;   
        return discountPrice;
	}
	
	public double getDiscount() {
		/** 구현 하시오 **/ 
	    return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		this.discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		/** 구현 하시오 **/ 
	    if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else {
            Sale otherSale = (Sale) otherObject;
            return (getName().equals(otherSale.getName()) && (getPrice() == otherSale.getPrice()));
        }
	}
	
	
	public DiscountSale clone() {
		/** 구현 하시오....  임시생성자 사용 **/ 
	    return new DiscountSale(this);
	}
}
package entities;

public class PriceSorter {
	
	public int compare(Product p1, Product p2){
        int returnVal = 0;

    if(p1.getProductPrice() < p2.getProductPrice()){
        returnVal =  -1;
    }else if(p1.getProductPrice() > p2.getProductPrice()){
        returnVal =  1;
    }else if(p1.getProductPrice() == p2.getProductPrice()){
        returnVal =  0;
    }
    return returnVal;

    }

}

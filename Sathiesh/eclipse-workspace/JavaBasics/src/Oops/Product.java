package Oops;

public class Product {
	    private int pId;
	    private String pName;
	    private int availablestock;
	    private float productcost;
	    public Product()
	    {
	        
	    }
	    public Product(int pId, String pName, int availablestock, float productcost) {
	        
	        this.pId = pId;
	        this.pName = pName;
	        this.availablestock = availablestock;
	        this.productcost = productcost;
	    }
	    @Override
	    public String toString() {
	        return "Product [pId=" + pId + ", pName=" + pName + ", availablestock=" + availablestock + ", productcost="
	                + productcost + "]";
	    }
	    
	    public void setpId(int pId)
	    {
	        this.pId=pId;
	    }
	    public int getpId()
	    {
	        return pId;
	    }
	    

	    public void setpName(String pName)
	    {
	        this.pName=pName;
	    }
	    public String getpName()
	    {
	        return pName;
	    }
	    public void setavailablestock(int availablestock)
	    {
	        this.availablestock=availablestock;
	    }
	    public int getavailablestock()
	    {
	        return availablestock;
	    }
	    public void setproductcost(float productcost)
	    {
	        this.productcost=productcost;
	    }
	    public float getproductcost()
	    {
	        return productcost;
	    }
	}


package Classes;

import java.io.Serializable;

public class Items implements Serializable{ //calvin's
    private static final long serialVersionUID = 12351313553L; //12351313553L;
    private String itemName;
    private String iid; //item id
    private double price;
    private int stock;

    
    public Items(String iid){
        this.iid = iid;
    }
    public Items(String itemName, String iid, double price, int stock) {
        this.itemName = itemName;
        this.iid = iid;
        this.price = price;
        this.stock = stock;
    }

    public Items() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "> " + this.itemName+ " ($" + this.price +"    Stock:"+this.stock+ ")";
    }
}
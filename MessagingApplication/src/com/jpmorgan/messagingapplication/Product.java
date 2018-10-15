
package com.jpmorgan.messagingapplication;

/**
 *
 * @author gajendra.phulare
 */
public class Product {
    
    /**
     * product attributes
     */
    public int id;
    public String name;
    public double price;
    public double adjustment;

    /**
     *no arg constructor
     */
    public Product() {
        
    }

    /**
    * arg constructor
    */
    public Product(int id, String name, double price, double adjustment) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.adjustment = adjustment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(double adjustment) {
        this.adjustment = adjustment;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", adjustment=" + adjustment + '}';
    }

    
    
    
}

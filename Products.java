package gestionLogistique;

import java.io.*;
import java.util.*;

public class Products implements Serializable {
	
	private String id;
    private String name;
    private String category;
    private int quantity;
    private int price;

    public Products(String id, String name, String category, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public String getString(String string) {
		// TODO Auto-generated method stub
		return null;
	}



}

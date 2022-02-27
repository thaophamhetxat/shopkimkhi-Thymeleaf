package thethao.kimkhi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class CartItem {
    private Long productId;
    private String name;
    private int quantity;
    private double price;
    private Date dateAdd;

    public CartItem() {
    }

    public CartItem(Long productId, String name, int quantity, double price, Date dateAdd) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.dateAdd = dateAdd;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }
}

package thethao.kimkhi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private short status;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

//	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//	private Set<OrderDetail> orderDetails;


    public Order(int orderId, Date orderDate, double amount, short status, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.amount = amount;
        this.status = status;
        this.customer = customer;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

package thethao.kimkhi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@Column(columnDefinition = "nvarchar(100) not null")
	private String name;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(nullable = false)
	private double unitPrice;
	
	@Column(length = 200)
	private String image;
	
	@Column(columnDefinition = "nvarchar(4000) not null")
	private String desciption;
	
	@Column(nullable = false)
	private double discount;
	
	@Temporal(TemporalType.DATE)
	private Date enteredDate;
	
	@Column(nullable = false)
	private short status;
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
//	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//	private Set<OrderDetail> orderDetails;


	public Product() {
	}

	public Product(Long productId, String name, int quantity, double unitPrice, String image, String desciption,
				   double discount, Date enteredDate, short status, Category category) {
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.image = image;
		this.desciption = desciption;
		this.discount = discount;
		this.enteredDate = enteredDate;
		this.status = status;
		this.category = category;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}

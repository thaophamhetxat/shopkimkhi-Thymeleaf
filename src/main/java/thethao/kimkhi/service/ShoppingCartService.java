package thethao.kimkhi.service;


import thethao.kimkhi.models.CartItem;

import java.util.Collection;

public interface ShoppingCartService{

	int getCount();

	double getAmount();

	void update(Long id, int quantity);

	void clear();

	Collection<CartItem> getCartItems();

	void remove(Long id);

	void add(CartItem item);

}

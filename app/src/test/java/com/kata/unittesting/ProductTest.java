package com.kata.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Sergio Casero on 21/04/2016.
 */
public class ProductTest {
    @Test
    public void shouldIdSetterAndGetterCorrect() {
        Product product = new Product();
        product.setId(10);

        assertEquals(10, product.getId());
    }

    @Test
    public void shouldPriceSetterAndGetterCorrect() {
        Product product = new Product();
        product.setPrice(10.50);

        assertEquals(10.50, product.getPrice(), 0);
    }

    @Test
    public void shouldTypeSetterAndGetterCorrect() {
        Product product = new Product();

        product.setType(Product.Type.COLD);
        assertEquals(Product.Type.COLD, product.getType());

        product.setType(Product.Type.HOT);
        assertEquals(Product.Type.HOT, product.getType());
    }

    @Test
    public void shouldTwoProductsWithDifferentIdAreNotTheSame() {
        Product product1 = new Product();
        product1.setId(1);

        Product product2 = new Product();
        product2.setId(2);

        assertNotEquals(product1, product2);

        assertNotEquals(product1.hashCode(), product2.hashCode());
    }

    @Test
    public void shouldProductNotBeNull() {
        Product product = new Product();

        assertNotEquals(product, null);
    }

    @Test
    public void shouldProductToStringWorksFine() {
        Product product = new Product();
        product.setId(1);
        product.setType(Product.Type.COLD);
        product.setPrice(10);

        String toString = "Product{id=1, price=10.0, type=COLD}";

        assertEquals(product.toString(), toString);
    }
}

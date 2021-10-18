package hu.ekcu.inf.framework.model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ShoppingCartTest {


    @InjectMocks
    ShoppingCart shoppingCart;

    @Test
    @DisplayName("Empty Shopping Cart Happy Path")
    void shouldEmptyShoppingCartBeFree(){
        // given
        final double expected = 0.0;
        // when
        final double actual = shoppingCart.cost();
        // then
        assertThat(actual).isEqualTo(expected, Offset.offset(1e-4));
    }

    @Test
    void shouldShoppingCartCostIncreaseWithThePriceOfTheProductInserted(){
        // given
        Product product = new UnitProduct("Chocolate Bar", "1234", 10.0);
        final double expected = 10.0;
        shoppingCart.addProduct(product);
        // when
        final double actual = shoppingCart.cost();
        // then
        assertThat(actual).isEqualTo(expected, Offset.offset(1e-4));
    }

}
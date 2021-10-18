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
    void shouldEmptyShoppingCartBeFree() {
        // given
        final double expected = 0.0;
        // when
        final double actual = shoppingCart.cost();
        // then
        assertThat(actual).isEqualTo(expected, Offset.offset(1e-4));
    }

    @Test
    void shouldShoppingCartCostIncreaseWithThePriceOfTheProductInserted() {
        // given
        Product product = TestDataProvider.getChocolateBar();
        final double expected = TestDataProvider.CHOCOLATE_BAR_UNIT_COST;
        shoppingCart.addProduct(product);
        // when
        final double actual = shoppingCart.cost();
        // then
        assertThat(actual).isEqualTo(expected, Offset.offset(1e-4));
    }

    private static class TestDataProvider {

        static final double CHOCOLATE_BAR_UNIT_COST = 10.0;

        public static UnitProduct getChocolateBar() {
            return new UnitProduct("Chocolate Bar", "1234", CHOCOLATE_BAR_UNIT_COST);
        }
    }

}
package hu.ekcu.inf.framework.model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;


class UnitProductTest {

    @Test
    @DisplayName("Unit Product Instantiation Happy Path")
    void shouldUnitProductsInstantiatedProperlyWithValidArguments(){
        // given
        final String productName = "Chocolate Bar";
        final String id = "1234";
        final double cost = 10.0;
        // when
        UnitProduct actual = new UnitProduct(productName, id, cost);
        // then
        assertThat(actual.getName()).isEqualTo(productName);
        assertThat(actual.getId()).isEqualTo(id);
        assertThat(actual.cost()).isEqualTo(cost, Offset.offset(1e-4));
    }

    @Test
    @DisplayName("Testing Name with Invalid Value")
    void shouldThrowIllegalArgumentExceptionWhenNameIsEmpty(){
        // given // isolation, setting up environment
        final String invalidProductName = "";
        final String id = "1234";
        final double cost = 10.0;
        // when // acting, calling the service tested
        assertThatThrownBy(()-> {
          new UnitProduct(invalidProductName, id, cost);
        }).isInstanceOf(IllegalArgumentException.class);
        // then // self validation
    }

}
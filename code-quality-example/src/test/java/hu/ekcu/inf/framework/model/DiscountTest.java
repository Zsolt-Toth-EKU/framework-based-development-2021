package hu.ekcu.inf.framework.model;


import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class DiscountTest {

    final double percentage = 10.0;

    @Mock
    Payable payable;

    @InjectMocks
    Discount discount;

    @Test
    void shouldDiscountBeInitializedWithTenPercent(){
        // given
        // when
        final double actual = discount.getPercentage();
        // then
        assertThat(actual).isEqualTo(percentage, Offset.offset(1e-4));
    }

    @Test
    @DisplayName("Discount Happy Path")
    void shouldDiscountPriceBeNinetyPercentOfOriginalPrice(){
        // given
        when(payable.cost()).thenReturn(100.0);
        final double expected = 90.0;
        // when
        final double actual = discount.cost();
        // then
        assertThat(actual).isEqualTo(expected, Offset.offset(1e-4));
    }


}
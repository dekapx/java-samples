package com.dekapx.java.designpatterns.structural.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeverageTest {
    @Test
    @DisplayName("Create DarkRoast Mocha and Whip and calculate cost")
    public void createDarkRoastMochaAndWhip() {
        Beverage darkRoast = new DarkRoast();
        Beverage mocha = new Mocha(darkRoast);
        Beverage whip = new Whip(mocha);
        assertThat(whip.cost()).isEqualTo(7.85);
    }

    @Test
    @DisplayName("Create HouseBlend Mocha and Whip and calculate cost")
    public void createHouseBlendMochaAndWhip() {
        Beverage houseBlend = new HouseBlend();
        Beverage soy = new Soy(houseBlend);
        Beverage mocha = new Mocha(soy);
        Beverage whip = new Whip(mocha);
        assertThat(whip.cost()).isEqualTo(6.15);
    }
}

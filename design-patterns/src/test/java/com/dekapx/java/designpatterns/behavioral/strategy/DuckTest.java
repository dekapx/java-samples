package com.dekapx.java.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class DuckTest {
    @Test
    @DisplayName("Create a ModelDuck and verify behaviour")
    public void createAndVerifyModelDuck() {
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new Quack());

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        assertAll("modelDuck",
                () -> assertThat(modelDuck).isNotNull().isInstanceOf(ModelDuck.class),
                () -> assertThat(modelDuck.getFlyBehavior()).isNotNull().isInstanceOf(FlyRocketPowered.class),
                () -> assertThat(modelDuck.getQuackBehavior()).isNotNull().isInstanceOf(Quack.class));
    }

    @Test
    @DisplayName("Create a MallardDuck and verify behaviour")
    public void createAndVerifyMallardDuck() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        assertAll("mallardDuck",
                () -> assertThat(mallardDuck).isNotNull().isInstanceOf(MallardDuck.class),
                () -> assertThat(mallardDuck.getFlyBehavior()).isNotNull().isInstanceOf(FlyWithWings.class),
                () -> assertThat(mallardDuck.getQuackBehavior()).isNotNull().isInstanceOf(Quack.class));
    }
}

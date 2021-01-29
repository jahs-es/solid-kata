package com.codurance.lsp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FillingStationShould {

    private static final int FULL = 100;
    private final FillingStation fillingStation = new FillingStation();

    @Test
    public void refuel_a_petrol_car(){
        PetrolCar car = new PetrolCar();

        fillingStation.fill(car);

        assertThat(car.fuelTankLevel())
                .isEqualTo(FULL);
    }

    @Test
    public void recharge_an_electric_car() {
        ElectricCar car = new ElectricCar();

        fillingStation.fill(car);

        assertThat(car.batteryLevel())
            .isEqualTo(FULL);
    }

}

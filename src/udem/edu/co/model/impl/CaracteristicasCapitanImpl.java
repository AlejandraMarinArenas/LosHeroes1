package udem.edu.co.model.impl;

import udem.edu.co.controller.CaracteristicasCapitanUseCase;
import java.util.List;

public class CaracteristicasCapitanImpl implements CaracteristicasCapitanUseCase {
    private List<HeroesImpl> heroes;

    public CaracteristicasCapitanImpl(List<HeroesImpl> heroes) {
        this.heroes = heroes;
    }
}

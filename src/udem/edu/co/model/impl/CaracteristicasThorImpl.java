package udem.edu.co.model.impl;

import udem.edu.co.model.CaracteristicasIroman;

import java.util.List;

public class CaracteristicasThorImpl implements CaracteristicasIroman {
    private List<HeroesImpl> heroes;

    public CaracteristicasThorImpl(List<HeroesImpl> heroes) {
        this.heroes = heroes;
    }
}

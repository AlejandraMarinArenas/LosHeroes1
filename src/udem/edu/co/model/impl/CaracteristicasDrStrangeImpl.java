package udem.edu.co.model.impl;

import udem.edu.co.model.CaracteristicasDrStrange;
import udem.edu.co.model.CaracteristicasIroman;
import java.util.List;

public class CaracteristicasDrStrangeImpl implements CaracteristicasDrStrange {
    private List<HeroesImpl> heroes;

    public CaracteristicasDrStrangeImpl(List<HeroesImpl> heroes) {
        this.heroes = heroes;
    }
}

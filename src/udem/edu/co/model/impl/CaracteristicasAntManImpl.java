package udem.edu.co.model.impl;

import udem.edu.co.model.CaracteristicasAntMan;
import java.util.List;

public class CaracteristicasAntManImpl implements CaracteristicasAntMan {
    private List<HeroesImpl> heroes;

    public CaracteristicasAntManImpl(List<HeroesImpl> heroes) {
        this.heroes = heroes;
    }
}

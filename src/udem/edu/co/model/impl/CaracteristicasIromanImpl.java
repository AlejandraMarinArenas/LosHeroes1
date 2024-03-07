package udem.edu.co.model.impl;

import udem.edu.co.model.CaracteristicasIroman;

import java.util.ArrayList;
import java.util.List;

public class CaracteristicasIromanImpl implements CaracteristicasIroman {
    private List<HeroesImpl> heroes;

    public CaracteristicasIromanImpl() {
        this.heroes = new ArrayList<>();
    }

    @Override
    public void agregarIronman(HeroesImpl heroe) {
        heroes.add(heroe);
    }
}


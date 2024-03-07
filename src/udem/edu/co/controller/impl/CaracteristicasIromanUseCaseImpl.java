package udem.edu.co.controller.impl;

import udem.edu.co.controller.CaracteristicasIromanUseCase;
import udem.edu.co.controller.CaracteristicasThorUseCase;
import udem.edu.co.model.CaracteristicasIroman;
import udem.edu.co.model.impl.CaracteristicasIromanImpl;
import udem.edu.co.model.impl.HeroesImpl;


public interface CaracteristicasIromanUseCase {
    void agregarIronman(HeroesImpl heroe);
}

public class CaracteristicasIromanUseCaseImpl implements CaracteristicasIromanUseCase{
    private CaracteristicasIromanImpl caracteristicasIroman;

    public CaracteristicasIromanUseCaseImpl(CaracteristicasIromanImpl caracteristicasIroman) {
        this.caracteristicasIroman = caracteristicasIroman;
    }

    @Override
    public void agregarIronman(HeroesImpl heroe) {
        caracteristicasIroman.agregarIronman(heroe);
    }
}

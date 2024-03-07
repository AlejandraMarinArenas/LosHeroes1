package udem.edu.co.model.impl;

import udem.edu.co.model.HeoresInteligente;

import java.util.ArrayList;
import java.util.List;


public class HeoreInteligenteImpl implements HeoresInteligente {
    private List<HeroesImpl> heroes;

    public HeoreInteligenteImpl(List<HeroesImpl> heroes) {
        this.heroes = heroes;
    }

    public void listarHeoreInteligente(HeroesImpl heroes) {
        HeroesImpl heroes1 = null;
        for ()

}


    }

    public void agregarAvengerInteligente(AvengerImpl avenger) {
        AvengerImpl avengerExistente = null;
        for (AvengerImpl existingAvenger : avengers) {
            if (existingAvenger.getNombre().equals(avenger.getNombre())) {
                avengerExistente = existingAvenger;
                break;
            }
        }

        if (avengerExistente != null) {
            avengerExistente.getClasificaciones().add("Avenger Inteligente");
        } else {
            avenger.getClasificaciones().add("Avenger Inteligente");
            avengers.add(avenger);
        }
    }
}
package udem.edu.co.model.impl;

import udem.edu.co.model.Heroes;

public class HeroesImpl implements Heroes {
    private String nombre;
    private List<String> habilidades;
    private List<String> debilidades;

    public HeroesImpl(String nombre, List<String> habilidades, List<String> debilidades) {
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.debilidades = debilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<String> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(List<String> debilidades) {
        this.debilidades = debilidades;
    }
}


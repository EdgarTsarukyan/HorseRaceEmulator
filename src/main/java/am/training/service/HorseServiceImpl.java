package am.training.service;

import am.training.beans.Horse;

import java.util.List;

public class HorseServiceImpl implements HorseService{

    private List<Horse> horses;

    public HorseServiceImpl(List<Horse> horses) {
        this.horses = horses;
    }
    @Override
    public List<Horse> getHorses() {
        return horses;
    }
}

package am.training.beans;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Race {

    private List<Horse> participatingHorses;
    private long length;
    private LocalDate startDate;

    public Race() {
    }

    public Race(List<Horse> participatingHorses, long length, LocalDate startDate) {
        this.participatingHorses = participatingHorses;
        this.length = length;
        this.startDate = startDate;
    }

    public List<Horse> getParticipatingHorses() {
        return participatingHorses;
    }

    public void setParticipatingHorses(List<Horse> participatingHorses) {
        this.participatingHorses = participatingHorses;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return length == race.length && Objects.equals(participatingHorses, race.participatingHorses) && Objects.equals(startDate, race.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participatingHorses, length, startDate);
    }

    @Override
    public String toString() {
        return "Race{" +
                "participatingHorses=" + participatingHorses +
                ", length=" + length +
                ", startDate=" + startDate +
                '}';
    }
}

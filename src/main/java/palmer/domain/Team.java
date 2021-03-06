package palmer.domain;

import java.time.LocalDate;

/**
 * Created by Cristina on 13/10/2016.
 */
public class Team {
    private long id;
    private String name;
    private String city;
    private LocalDate date;

    public Team() {}

    public Team(String name, String city, LocalDate date) {
        this.name = name;
        this.city = city;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Team{" +
                "date=" + date +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

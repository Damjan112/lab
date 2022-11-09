package mk.finki.ukim.lab.model;

import lombok.Data;

@Data
public class Balloon {

    private String name;
    private String description;
    private Long id;
    private Manufacturer manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Balloon(String name, String description) {
        this.id=(long)(Math.random()*1000);
        this.name = name;
        this.description = description;

    }
    public Balloon(String name, String description, Manufacturer manufacturer) {
        this.id=(long)(Math.random()*1000);
        this.name = name;
        this.description = description;
        this.manufacturer=manufacturer;
    }
}

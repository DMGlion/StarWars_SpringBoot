package com.example.star_wars_springboot.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StarShip {


    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    /**
     * Model of the space Ship
     */
    private String model;

    /**
     * Manufacturer of the space ship
     */
    private String manufacturer;

    /**
     * Cost of the space ship in credits
     */
    private String costInCredits;

    /**
     * Lenght of the space ship
     */
    private String length;

    /**
     * The maximum speed of this starship in the atmosphere.
     * "N/A" if this starship is incapable of atmospheric flight
     */
    private String maxAtmospheringSpeed;

    /**
     * The number of personnel needed to run or pilot this starship.
     */
    private String crew;

    /**
     * The number of non-essential people this starship can transport.
     */
    private String passengers;

    /**
     * The maximum number of kilograms that this starship can transport.
     */
    private String cargoCapacity;

    /**
     * The maximum length of time that this starship can provide
     * consumables for its entire crew without having to resupply.
     */
    private String consumables;

    /**
     * The class of this starships hyperdrive.
     */
    private String hyperdriveRating;

    /**
     * The Maximum number of Megalights this starship can travel in a standard hour.
     * A "Megalight" is a standard unit of distance and has never been defined
     * before within the Star Wars universe. This figure is only really useful
     * for measuring the difference in speed of starships. We can assume it is
     * similar to AU, the distance between our Sun (Sol) and Earth.
     */
    private String MGLT;

    /**
     * The class of this starship, such as "Starfighter" or "Deep Space Mobile Battlestation"
     */
    private String starshipClass;


    /**
     * the ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    /**
     * the hypermedia URL of this resource.
     */
    private String url;
}

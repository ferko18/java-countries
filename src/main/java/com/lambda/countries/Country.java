package com.lambda.countries;

import java.util.concurrent.atomic.AtomicLong;

public class Country
{
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String countryName;
    private long population;
    private long landmassSize;
    private int medianAge;

    public Country( String countryName, long population, long landmassSize, int medianAge)
    {
        this.id = counter.incrementAndGet();
        this.countryName = countryName;
        this.population = population;
        this.landmassSize = landmassSize;
        this.medianAge = medianAge;
    }
}

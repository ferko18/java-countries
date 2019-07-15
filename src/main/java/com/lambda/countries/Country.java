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

    public long getId()
    {
        return id;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public long getPopulation()
    {
        return population;
    }

    public void setPopulation(long population)
    {
        this.population = population;
    }

    public long getLandmassSize()
    {
        return landmassSize;
    }

    public void setLandmassSize(long landmassSize)
    {
        this.landmassSize = landmassSize;
    }

    public int getMedianAge()
    {
        return medianAge;
    }

    public void setMedianAge(int medianAge)
    {
        this.medianAge = medianAge;
    }

    @Override
    public String toString()
    {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                ", landmassSize=" + landmassSize +
                ", medianAge=" + medianAge +
                '}';
    }
}

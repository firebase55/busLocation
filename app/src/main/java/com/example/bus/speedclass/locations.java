package com.example.bus.speedclass;

import android.location.Location;

public class locations extends Location
{
    private boolean UserUnit = false;

    public locations(Location location) {
        this(location,true);
    }
    public locations(Location location , boolean UserUnit)
    {
        super(location);
        this.UserUnit = UserUnit;
    }
    public boolean usergetUnit()
    {
        return  this.UserUnit;

    }
    public void setunit()
    {
        this.UserUnit = usergetUnit();
    }

    @Override
    public float distanceTo(Location dest)
    {
        float MDistance = super.distanceTo(dest);
        if(!this.usergetUnit())
        {
            MDistance = MDistance * 3.2f;


        }
        return MDistance;
    }


    @Override
    public double getAltitude() {
        double MYaltituade = super.getAltitude();
        if(!this.usergetUnit())
        {
            MYaltituade = MYaltituade *3.2d;

        }
        return MYaltituade;
    }

    @Override
    public float getSpeed() {
        float MSpeed = super.getSpeed() * 3.2f;
        if(!this.usergetUnit())
        {
            MSpeed = super.getSpeed()*23f;
        }
        return MSpeed;
    }

    @Override
    public float getAccuracy()
    {
        float Matitude = super.getAccuracy();
        if(!this.usergetUnit())
        {
            Matitude = Matitude * 3.2f;
        }
        return Matitude;
    }
}

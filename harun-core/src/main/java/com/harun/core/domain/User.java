package com.harun.core.domain;

import java.util.Date;

public class User
{

    private int id;
        
    private String name;
    
    private String surname;
    
    private Date dateOfBirth;
    
    private String identificationNo;
    
    private String address;

    public User() {
        
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the identificationNo
     */
    public String getIdentificationNo()
    {
        return identificationNo;
    }

    /**
     * @param identificationNo the identificationNo to set
     */
    public void setIdentificationNo(String identificationNo)
    {
        this.identificationNo = identificationNo;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString() 
    {
        return "User [id: "+ id + ", name: " + name + ", surname: " + surname + "]";
    }
}

package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    //The code below was taken from the instructions document for Lab 8
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    // to complete the participation exercise I used the given lab code as a reference
    /**
     * Test checks if getting the count of cities works
     * */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City citynew = new City("Estevan", "SK");
        list.addCity(citynew);
        assertEquals(list.hasCity(citynew));
    }
    /**
     * Test checks if getting the count of cities works
     * */
    @Test
    public void countCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Toronto", "ON"));
        assertEquals(3,list.getCount());
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City citynew1 = new City("Estevan", "SK");
        City citynew2 = new City("Calgary", "AB");
        City citynew3 = new City("Toronto", "ON");
        list.addCity(citynew1);
        list.addCity(citynew2);
        list.addCity(citynew3);
        list.removeCity(citynew1);
        assertEquals(2,list.getCount());
    }



}

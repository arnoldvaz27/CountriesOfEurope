package com.arnold.countriesofeurope.listeners;

import com.arnold.countriesofeurope.entites.Country;

public interface CountryListeners {

    void onItemClicked(Country country, int position); //event listener after clicking on the view

}

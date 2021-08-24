package com.arnoldvaz27.countriesofeurope.listeners;

import com.arnoldvaz27.countriesofeurope.entites.Country;

public interface CountryListeners {

    void onItemClicked(Country country, int position); //event listener after clicking on the view

}

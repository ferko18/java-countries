package com.lambda.countries;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/countries")
public class CountryController
{
    //localhost:2219/countries/names/all
    @RequestMapping(value ="/names/all", produces ={"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<?> getAllNations()
    {
        CountriesApplication.myCountryList.countryList.sort((c1, c2)->c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return  new ResponseEntity<>( CountriesApplication.myCountryList.countryList, HttpStatus.OK);
    }
}

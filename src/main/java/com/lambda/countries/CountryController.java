package com.lambda.countries;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/countries")
public class CountryController
{
    //1.Get all country names ordered alphabetically
    //localhost:2219/countries/names/all
    @RequestMapping(value ="/names/all", produces ={"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<?> getAllNations()
    {
        return  new ResponseEntity<>( CountriesApplication.myCountryList.getCountryNames(), HttpStatus.OK);
    }

    //2. return the countries alphabetically that begin with the given letter

    @RequestMapping(value ="/names/start/{letter}", produces ={"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<?> getSomeNations(@PathVariable char letter)
    {
        char upperLetter = Character.toUpperCase(letter);
        return  new ResponseEntity<>( CountriesApplication.myCountryList.getSomeCountryNames(upperLetter), HttpStatus.OK);
    }
}



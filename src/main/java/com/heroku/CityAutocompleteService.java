// Coveo Backend Coding Challenge
// Design an API endpoint that provides auto-complete suggestions for large cities.
// This software may be modified and distributed under the terms
// of the MIT license. See the LICENSE file for details.

package com.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CityAutocompleteService {

    public static void main(String[] args) {
        SpringApplication.run(CityAutocompleteService.class, args);
    }

}

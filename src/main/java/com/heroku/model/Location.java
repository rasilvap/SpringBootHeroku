// Coveo Backend Coding Challenge
// Design an API endpoint that provides auto-complete suggestions for large cities.
//
//
// This software may be modified and distributed under the terms
// of the MIT license. See the LICENSE file for details.

package com.heroku.model;

public class Location {

    private final Double latitude;
    private final Double longitude;

    /**
     * Constructs a location object
     *
     * @throws IllegalArgumentException if latitude is not in the [-90.0, 90.0] range
     *                                  or longitude is not in the [-180.0, 180.0] range
     */
    public Location(Double latitude, Double longitude) {
        if (latitude >= -90.0 && latitude <= 90.0 && longitude >= -180.0 && longitude <= 180.0) {
            this.latitude = latitude;
            this.longitude = longitude;
        } else {
            throw new IllegalArgumentException("Invalid latitude and/or longitude");
        }
    }

    /**
     * Returns latitude
     *
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Returns longitude
     *
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }
}

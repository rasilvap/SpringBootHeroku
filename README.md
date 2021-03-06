[![Actions Status](https://github.com/rasilvap/SpringBootHeroku/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/rasilvap/SpringBootHeroku/actions)

# SpringBootHeroku

# Requirements
Design an API endpoint that provides auto-complete suggestions for large cities.

The endpoint is exposed at /suggestions
The partial (or complete) search term is passed as a querystring parameter q
The caller's location can optionally be supplied via querystring parameters latitude and longitude to help improve relative scores
The endpoint returns a JSON response with an array of scored suggested matches
The suggestions are sorted by descending score
Each suggestion has a score between 0 and 1 (inclusive) indicating confidence in the suggestion (1 is most confident)
Each suggestion has a name which can be used to disambiguate between similarly named locations
Each suggestion has a latitude and longitude

# "The rules"
You can use the language and technology of your choosing. It's OK to try something new (tell us if you do), but feel free to use something you're comfortable with. We don't care if you use something we don't; the goal here is not to validate your knowledge of a particular technology.
End result should be deployed on a public Cloud (Heroku, AWS etc. all have free tiers you can use).

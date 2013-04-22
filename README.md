vg-java-mapquestjson
====================

This is a simple for parsing JSON results returned from the MapQuest Open API (http://open.mapquestapi.com/). It builds structured Java objects for a limited subset of the MapQuest Open API; if you need more, follow the design of the existing JSON objects and submit an integration request.

JSON objects are built by class constructors in a simple, easy-to-read and easy-to-extend format. Actual JSON parsing to build the objects is performed by the JsonParser class of vg-java-jsonparser.

It leverages the open-source vg-java-jsonparser Java library available here: https://bitbucket.org/stormont/vg-java-jsonparser
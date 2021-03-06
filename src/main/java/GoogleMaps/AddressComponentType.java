package GoogleMaps;

/**
 * The Address Component types. Please see <a
 * href="https://developers.google.com/maps/documentation/geocoding/intro#Types">Address Types and
 * Address Component Types</a> for more detail.
 */
public class AddressComponentType {

    /** A precise street address. *//*
    STREET_ADDRESS("street_address"),

    *//** A named route (such as "US 101"). *//*
    ROUTE("route"),

    *//** A major intersection, usually of two major roads. *//*
    INTERSECTION("intersection"),

    *//** A political entity. Usually, this type indicates a polygon of some civil administration. *//*
    POLITICAL("political"),

    *//** A national political entity, typically the highest order type returned by the Geocoder. *//*
    COUNTRY("country"),

    *//**
     * A first-order civil entity below the country level. Within the United States, these
     * administrative levels are states. Not all nations exhibit these administrative levels.
     *//*
    ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),

    *//**
     * A second-order civil entity below the country level. Within the United States, these
     * administrative levels are counties. Not all nations exhibit these administrative levels.
     *//*
    ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),

    *//**
     * A third-order civil entity below the country level. This type indicates a minor civil division.
     * Not all nations exhibit these administrative levels.
     *//*
    ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),

    *//**
     * A fourth-order civil entity below the country level. This type indicates a minor civil
     * division. Not all nations exhibit these administrative levels.
     *//*
    ADMINISTRATIVE_AREA_LEVEL_4("administrative_area_level_4"),

    *//**
     * A fifth-order civil entity below the country level. This type indicates a minor civil division.
     * Not all nations exhibit these administrative levels.
     *//*
    ADMINISTRATIVE_AREA_LEVEL_5("administrative_area_level_5"),

    *//** A commonly-used alternative name for the entity. *//*
    COLLOQUIAL_AREA("colloquial_area"),

    *//** An incorporated city or town political entity. *//*
    LOCALITY("locality"),

    *//**
     * A specific type of Japanese locality, used to facilitate distinction between multiple locality
     * components within a Japanese address.
     *//*
    WARD("ward"),

    *//**
     * A first-order civil entity below a locality. For some locations may receive one of the
     * additional types: sublocality_level_1 to sublocality_level_5. Each sublocality level is a civil
     * entity. Larger numbers indicate a smaller geographic area.
     *//*
    SUBLOCALITY("sublocality"),
    SUBLOCALITY_LEVEL_1("sublocality_level_1"),
    SUBLOCALITY_LEVEL_2("sublocality_level_2"),
    SUBLOCALITY_LEVEL_3("sublocality_level_3"),
    SUBLOCALITY_LEVEL_4("sublocality_level_4"),
    SUBLOCALITY_LEVEL_5("sublocality_level_5"),

    *//** A named neighborhood. *//*
    NEIGHBORHOOD("neighborhood"),

    *//** A named location, usually a building or collection of buildings with a common name. *//*
    PREMISE("premise"),

    *//**
     * A first-order entity below a named location, usually a singular building within a collection of
     * buildings with a common name.
     *//*
    SUBPREMISE("subpremise"),

    *//** A postal code as used to address postal mail within the country. *//*
    POSTAL_CODE("postal_code"),

    *//** A postal code prefix as used to address postal mail within the country. *//*
    POSTAL_CODE_PREFIX("postal_code_prefix"),

    *//** A postal code suffix as used to address postal mail within the country. *//*
    POSTAL_CODE_SUFFIX("postal_code_suffix"),

    *//** A prominent natural feature. *//*
    NATURAL_FEATURE("natural_feature"),

    *//** An airport. *//*
    AIRPORT("airport"),

    *//** A named park. *//*
    PARK("park"),

    *//**
     * A named point of interest. Typically, these "POI"s are prominent local entities that don't
     * easily fit in another category, such as "Empire State Building" or "Statue of Liberty."
     *//*
    POINT_OF_INTEREST("point_of_interest"),

    *//** The floor of a building address. *//*
    FLOOR("floor"),

    *//** Typically indicates a place that has not yet been categorized. *//*
    ESTABLISHMENT("establishment"),

    *//** A parking lot or parking structure. *//*
    PARKING("parking"),

    *//** A specific postal box. *//*
    POST_BOX("post_box"),

    *//**
     * A grouping of geographic areas, such as locality and sublocality, used for mailing addresses in
     * some countries.
     *//*
    POSTAL_TOWN("postal_town"),

    *//** The room of a building address. *//*
    ROOM("room"),

    *//** The precise street number of an address. *//*
    STREET_NUMBER("street_number"),

    *//** The location of a bus stop. *//*
    BUS_STATION("bus_station"),

    *//** The location of a train station. *//*
    TRAIN_STATION("train_station"),

    *//** The location of a subway station. *//*
    SUBWAY_STATION("subway_station"),

    *//** The location of a transit station. *//*
    TRANSIT_STATION("transit_station"),

    *//** The location of a light rail station. *//*
    LIGHT_RAIL_STATION("light_rail_station"),

    *//**
     * Indicates an unknown address component type returned by the server. The Java Client for Google
     * Maps Services should be updated to support the new value.
     *//*
    UNKNOWN("unknown");*/

    private String addressComponentType;

    public AddressComponentType(String addressComponentType) {
        this.addressComponentType = addressComponentType;
    }

    public String getAddressComponentType() {
        return addressComponentType;
    }

    public void setAddressComponentType(String addressComponentType) {
        this.addressComponentType = addressComponentType;
    }
}
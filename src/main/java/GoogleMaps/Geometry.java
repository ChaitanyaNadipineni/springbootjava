package GoogleMaps;

/** The geometry of a Geocoding result. */
public class Geometry {
    /**
     * The bounding box which can fully contain the returned result (optionally returned). Note that
     * these bounds may not match the recommended viewport. (For example, San Francisco includes the
     * Farallon islands, which are technically part of the city, but probably should not be returned
     * in the viewport.)
     */
    public Bounds bounds;

    /**
     * The geocoded latitude/longitude value. For normal address lookups, this field is typically the
     * most important.
     */
    public LatLng location;

    /** The level of certainty of this geocoding result. */
    public LocationType location_type;

    /**
     * The recommended viewport for displaying the returned result. Generally the viewport is used to
     * frame a result when displaying it to a user.
     */
    public Bounds viewport;
}
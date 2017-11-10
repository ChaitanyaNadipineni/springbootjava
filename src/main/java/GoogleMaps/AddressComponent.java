package GoogleMaps;

public class AddressComponent {
    /** The full text description or name of the address component as returned by the Geocoder. */
    private String long_name;

    /**
     * An abbreviated textual name for the address component, if available. For example, an address
     * component for the state of Alaska may have a longName of "Alaska" and a shortName of "AK" using
     * the 2-letter postal abbreviation.
     */
    private String short_name;

    /** Indicates the type of each part of the address. Examples include street number or country. */
    private AddressComponentType[] types;

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public AddressComponentType[] getTypes() {
        return types;
    }

    public void setTypes(AddressComponentType[] types) {
        this.types = types;
    }
}

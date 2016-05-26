package entity;

/**
 * Address
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Address {
    private String city;
    private String street;
    private String building;
    private String apartment;

    public Address(String city, String street, String building) {
        this(city, street, building, Integer.toString(1));
    }

    public Address(String city, String street, String building, String apartment) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        try {
            Address address = (Address) super.clone();
            address.city = city;
            address.street = street;
            address.building = building;
            address.apartment = apartment;
            return address;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return city != null ? city.equals(address.city) : address.city == null &&
                (street != null ? street.equals(address.street) : address.street == null &&
                        (building != null ? building.equals(address.building) : address.building == null &&
                                (apartment != null ? apartment.equals(address.apartment) : address.apartment == null)));

    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (building != null ? building.hashCode() : 0);
        result = 31 * result + (apartment != null ? apartment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}

package ng.com.createsoftware.servbyte.model;

public enum City {
    ABUJA("Abuja"),
    LAGOS("Lagos"),
    IBADAN("Ibadan"),
    UYO("Uyo"),
    PORTHARCOURT("Portharcourt"),
    ENUGU("Enugu"),
    ASABA("Asaba"),
    KANO("Kano"),
    UMUAHIA("Umuahia"),
    ONITSHA("Onitsha"),
    ABA("Aba"),
    OWERRI("Owerri");

    private final String city;


   private City(String city) {
       this.city = city;
    }

    public String getCity(){
       return city;
    }

}

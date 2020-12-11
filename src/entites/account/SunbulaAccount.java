package entites.account;

public class SunbulaAccount extends Account implements Design,AirportShuttle{
    @Override
    public String name() {
        return SunbulaAccount.class.getSimpleName();
    }

    @Override
    public String color() {
        return "#3C3C3C";
    }

    @Override
    public boolean shuttleAvailable() {
        return true;
    }
}

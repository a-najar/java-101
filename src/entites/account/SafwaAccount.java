package entites.account;

public class SafwaAccount extends Account implements AirportShuttle{
    @Override
    public String name() {
        return SafwaAccount.class.getSimpleName();
    }


    @Override
    public boolean shuttleAvailable() {
        return true;
    }
}

package by.gsu.epamlab;

public class BusinessTrip {
    private final static int DAILY_ALLOWANCE_PART = 5000;
    private String account;
    private int transportationExpenses;
    private int numberOfDays;

    public BusinessTrip() {
    }

    public BusinessTrip(String account, int transportationExpenses, int numberOfDays) {
        this.account = account;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public int getTransportationExpenses() {
        return transportationExpenses;
    }
    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    public int getTotal(){
        return transportationExpenses+DAILY_ALLOWANCE_PART*numberOfDays;
    }
    public void show(){
            System.out.println("Employee`s account: " + account +
                    "\nTransportation expenses: " + transportationExpenses/100+'.'+transportationExpenses%100+ " BYN" +
                    "\nNumber of days: " + numberOfDays +
                    "\nTotal: " + getTotal()/100+'.'+getTotal()%100 + " BYN");
    }
    @Override
    public String toString() {
        return "BusinessTrip:\n" +
                account + ';' +
                transportationExpenses/100+'.'+transportationExpenses%100 + ';'+
                numberOfDays + ';'+
                getTotal()/100+'.'+getTotal()%100;
    }
}

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
        return (transportationExpenses+DAILY_ALLOWANCE_PART * numberOfDays);
    }
    public static String convertingToRubles(int pennyToConverting){
        return String.format("%d.%02d", pennyToConverting / 100, pennyToConverting % 100);
    }
    public void show(){
        System.out.printf("Employee`s account: %s \nTransportation expenses: %s \nNumber of days: %d \nTotal: %s\n",
                account,convertingToRubles(transportationExpenses),numberOfDays,convertingToRubles(getTotal()));
    }
    @Override
    public String toString() {
        return String.format("%s;%s;%d;%s",
                account,convertingToRubles(transportationExpenses), numberOfDays, convertingToRubles(getTotal()));
    }
}

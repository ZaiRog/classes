import by.gsu.epamlab.BusinessTrip;

public class Runner {

    public static void main(String[] args) {

        BusinessTrip[] businessTrips1 = new BusinessTrip[]{new BusinessTrip("Anton", 1000, 30),
        new BusinessTrip("Egor", 1100, 21),
        null, new BusinessTrip("Polina", 1050,19),
        new BusinessTrip()};

        int maxTotal = businessTrips1[0].getTotal();
        for(BusinessTrip businessTrip2: businessTrips1){

            if(businessTrip2 == null){
                continue;
            }

            businessTrip2.show();
            System.out.println();

            if(businessTrip2.getTotal()>maxTotal){
                maxTotal = businessTrip2.getTotal();
            }

        }
        System.out.println("Business trip with max cost: " + maxTotal/100+"."+maxTotal%100 + "\n");

        businessTrips1[businessTrips1.length-1].setTransportationExpenses(1001);
        businessTrips1[businessTrips1.length-1].show();

        System.out.println("\nDuration of trips: " + (businessTrips1[0].getNumberOfDays()+businessTrips1[1].getNumberOfDays()));

        for(BusinessTrip businessTrip: businessTrips1){
            System.out.println(businessTrip);
            System.out.println();
        }

    }

}

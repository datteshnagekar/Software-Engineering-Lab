public class ElevatorBhau extends Mainclass{

    int currentfloor;


    public ElevatorBhau() {
        currentfloor = 0;
    }



    public void check(int floorno) {
        if (currentfloor == floorno) {
            System.out.println("hav asa thaich asa on" + floorno +"floor no");


        } else if (currentfloor > floorno) {

            goupElevator(floorno);

        } else {

            godownElevator(floorno);
        }
    }


    public void goupElevator(int floorno) {
        if (currentfloor < floorno) {

            for (int i = currentfloor; i <= floorno; i++) {

                System.out.println("Elevator on " + i + " Floor");

                currentfloor = i;
            }
            System.out.println("Elevator has reached" + currentfloor + " Floor");
        }
    }

    public void godownElevator(int floorno) {

        if (currentfloor > floorno) {

            for (int i = currentfloor; i >= floorno; i--) {

                System.out.println("Elevator on " + i + " Floor");

                currentfloor = i;
            }
            System.out.println("Elevator has reached" + currentfloor + " Floor");
        }

    }

}
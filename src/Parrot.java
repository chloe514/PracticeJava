public class Parrot {
}
public boolean parrotTrouble(boolean talking, int hour) {
    // We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    return (talking && (hour <7  || hour >20));

}

public class Human {
    private Brain br; // shows that brain is a part of human (whole-part relationship)

    public Human() {
        br = new Brain(); // shows that ownership and lifetime relationship
    }

    public String getLoad() {
        return br.getLoad(); // return "Heavy" because br.getLoad() returns "Heavy"
    }
}

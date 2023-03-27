public class Person {

    private  String name;
    private  String lastName;
    private  int tickets;

    public Person(String name, String lastName, int tickets) {
        this.name = name;
        this.lastName = lastName;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}

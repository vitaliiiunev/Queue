import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = generateClients();
        Queue<Person> attr = new LinkedList<>(people);

        while (!attr.isEmpty()) {
            Person person = attr.poll();
            int tickets = person.getTickets();
            tickets = tickets - 1;
            person.setTickets(tickets);
            System.out.printf("\n%s %s прокатисля на аттракционе, осталось %d билетов.", person.getName(), person.getLastName(), person.getTickets());
            System.out.println();
            if (tickets > 0) {
                attr.offer(person);
            }
        }

    }

    public static List<Person> generateClients() {
        return List.of(
                new Person("Джеймс", "Бонд", 7),
                new Person("Человек", "Паук", 3),
                new Person("Злой", "Халк", 5),
                new Person("Дэд", "Пул", 5),
                new Person("Чарли", "Браун", 4)
        );
    }
}

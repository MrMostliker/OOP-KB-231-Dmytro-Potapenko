import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sprint {
    private final int timeCapacity;
    private final int ticketLimit;
    private final List<Ticket> tickets = new ArrayList<>();
    private int totalEstimate = 0;

    public Sprint(int timeCapacity, int ticketLimit) {
        this.timeCapacity = timeCapacity;
        this.ticketLimit = ticketLimit;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted()) return false;
        if (tickets.size() >= ticketLimit) return false;
        if (totalEstimate + userStory.getEstimate() > timeCapacity) return false;

        tickets.add(userStory);
        totalEstimate += userStory.getEstimate();
        return true;
    }

    public boolean addBug(Bug bug) {
        if (bug == null || bug.isCompleted()) return false;
        if (tickets.size() >= ticketLimit) return false;
        if (totalEstimate + bug.getEstimate() > timeCapacity) return false;

        tickets.add(bug);
        totalEstimate += bug.getEstimate();
        return true;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(new ArrayList<>(tickets));
    }

    public int getTotalEstimate() {
        return totalEstimate;
    }
}
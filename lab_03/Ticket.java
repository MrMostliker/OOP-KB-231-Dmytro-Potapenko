public class Ticket {
    private static int counter = 1;
    private final int id;
    private String name; 
    private int estimate;
    private boolean isCompleted;


    public Ticket(String name, int estimate) {
        this.id = counter++;
        this.name = name;
        this.estimate = estimate;
        this.isCompleted = false;
    }

  
    public int getId() { return id; }
    public String getName() { return name; }
    public int getEstimate() { return estimate; }
    public boolean isCompleted() { return isCompleted; }

    public void complete() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", estimate=" + estimate +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
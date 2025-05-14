public class Bug extends Ticket {
    private UserStory userStory;

    private Bug(String name, int estimate, UserStory userStory) {
        super(name, estimate);
        this.userStory = userStory;
    }

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || !userStory.isCompleted()) return null;
        return new Bug(name, estimate, userStory);
    }

    @Override
    public String toString() {
        return "[Bug " + getId() + "] " + userStory.getName() + ": " + getName();
    }
}
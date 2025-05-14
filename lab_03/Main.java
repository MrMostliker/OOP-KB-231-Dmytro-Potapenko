import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sprint sprint = new Sprint(100, 10);

        
        UserStory story1 = new UserStory("Login Feature", 5, null);
        UserStory story2 = new UserStory(
                "Registration",
                8,
                Arrays.asList(story1) 
        );

        story1.complete();

        Bug bug = Bug.createBug(2, "Crash on Start", 2, story1);

        sprint.addUserStory(story2);
        sprint.addBug(bug);

        System.out.println("Total estimate: " + sprint.getTotalEstimate());
        sprint.getTickets().forEach(System.out::println);
    }
}
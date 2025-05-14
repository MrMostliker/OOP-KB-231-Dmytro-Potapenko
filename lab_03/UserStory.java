import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserStory extends Ticket {
    private List<UserStory> dependencies;


    public UserStory(String name, int estimate, List<UserStory> dependencies) {
        super(name, estimate);

        this.dependencies = new ArrayList<>(dependencies != null ? dependencies : Collections.emptyList());
    }

    @Override
    public void complete() {
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) return;
        }
        super.complete();
    }

    public List<UserStory> getDependencies() {
        return Collections.unmodifiableList(new ArrayList<>(dependencies));
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}
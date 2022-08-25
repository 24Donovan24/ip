package duke;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    //ArrayList to store tasks
    private List<Task> lst;
    //Constant string to represent a line break
    private final String LINE_BREAK = "____________________________________________________________";

    public TaskList() {
        this.lst = new ArrayList<>();
    }
    public TaskList(List<Task> lst) {
        this.lst = lst;
    }

    public List<Task> getTasks() {
        return lst;
    }

    public Task getTask(int i) {
        return lst.get(i);
    }

    public int getSize() {
        return lst.size();
    }

    public void addTask(Task task) {
        lst.add(task);
    }

    /**
     * @param index An int representing the index of task to be marked
     * @throws DukeException
     */
    public void markTask(int index) throws DukeException {
        int size = lst.size();
        if (index >= size || index < 0) {
            throw new DukeException("OOPS! The index of the task does not exists.");
        } else {
            Task taskToBeMarked = lst.get(index);
            taskToBeMarked.markAsDone();
        }
    }

    /**
     * @param index An int representing the index of task to be unmarked
     * @throws DukeException
     */
    public void unmarkTask(int index) throws DukeException {
        int size = lst.size();
        if (index >= size || index < 0) {
            throw new DukeException("OOPS! The index of the task does not exists.");
        } else {
            Task taskToBeUnmarked = lst.get(index);
            taskToBeUnmarked.markAsUndone();
        }
    }

    /**
     * @param index An int representing the index of task to be deleted
     * @throws DukeException
     */
    public Task deleteTask(int index) throws DukeException {
        int size = lst.size();
        if (index >= size || index < 0) {
            throw new DukeException("OOPS! The index of the task does not exists.");
        } else {
            Task taskToBeDeleted = lst.get(index);
            lst.remove(index);
            return taskToBeDeleted;
        }
    }
}

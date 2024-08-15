
## Core Requirements

- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.


| Class | Variable                         | Method                               | Scenario                                   | Outcome / Note                                                                                   |
|-------|----------------------------------|--------------------------------------|--------------------------------------------|--------------------------------------------------------------------------------------------------|
| `ToDo` | `ArrayList<Pair<String, Boolean>>` |                                      |                                            | Contains all tasks to be done                                                                    |
|       |                                  | `void addTask(String task)`          | user wants to add a task                   | task is added taskList                                                                           |
|       |                                  | `void seeAllTasks()`                 | user wants to see all tasks                | all tasks are printed to console                                                                 |
|       |                                  | `void seeAllCompleteTasks()`         | user wants to see all complete tasks       | all complete tasks are printed to console                                                        |
|       |                                  | `void seeAllIncompleteTasks()`        | user wants to see all incomplete tasks     | all incomplete tasks are printed to console                                                      |
|       |                                  | `void markTask(String task)`         | user wants to swap the mark of a task      | the task boolean in swapped                                                                      |
|       |                                  | `boolean checkTaskExists(String task)` | user wants to see if a task exists         | if task exists return true<br/>if task doesnt exist, print a message to console and return false |
|       |                                  | `boolean removeTask(String task)`    | user wants to remove a task                | if task exists, then remove it.                                                                  |
|       |                                  | `void listTasksAscendingOrder()`     | user wants to list all tasks asc order     | all tasks are printed to console in asc order.                                                   |
|       |                                  | `void listTasksDescendingOrder()`    | user wants to list all tasks in desc order | all tasks are printed to console in desc order                                                   |

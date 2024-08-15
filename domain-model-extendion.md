
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

## Extention requirements

- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.


| Class       | Variable               | Method                                | Scenario                                          | Outcome                                                                        |
|-------------|------------------------|---------------------------------------|---------------------------------------------------|--------------------------------------------------------------------------------|
| `TodoList`  | HashMap<Integer, Task> |                                       |                                                   |                                                                                |
|             |                        | `addTask(String task)`                | user wants to add a task                          | task is added to tasks list                                                    |
|             |                        | `removeTask(String task)`             | user wants to remove task                         | task is removed from list                                                      |
|             |                        | `seeAllTasks()`                       | user wants to see all tasks                       | all tasks are printed to console                                               |
|             |                        | `seeAllCompletedTasks()`              | user wants to see completed tasks                 | all completed tasks are printed to console                                     |
|             |                        | `seeAllIncompletedTasks()`            | user wants to see incompleted tasks               | all incompleted tasks are printed to console                                   |
|             |                        | `checkIfTaskExists(String task)`      | user wants to check if a task exists              | if exists: print status of task<br/>if not: print missing task message to user |
|             |                        | `listTasksAscendingOrder()`           | user wants to see all tasks in asc order          | prints all tasks in asc order                                                  | 
|             |                        | `listTasksDescendingOrder()`          | user wants to see all tasks in desc order         | prints all tasks in desc order                                                 |
|             |                        | `getTaskByUniqueId(int id)`           | user wants to find a task by id                   | status of task is printed                                                      |
|             |                        | `setTaskName(String newName, int id)` | user wants to set a new name for task by given id | task by id is given a new name                                                 |
|             |                        | `markTaskById(int id)`                | user wants to mark a task by id                   | task is updated if exists                                                      |
|             |                        | `getCreatedDate(int id)`              | user wants to see the date a task is created      | date is printed to console and returned                                        |
| `Task`      | String task            |                                       |                                                   |                                                                                |
|             | boolean isMarked       |                                       |                                                   |                                                                                |
|             | LocalDate date         |                                       |                                                   |                                                                                |
|             |                        | `setNewTaskName(String newName)`      | user wants to give a task a new name              | the task is updated                                                            |
|             |                        | `getIsMarked()`                       | user wants to check if task is marked             | status is returned                                                             |
|             |                        | `mark()`                              | user wants to mark a task                         | isMarked boolean is swapped                                                    |

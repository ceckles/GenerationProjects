let TaskList = JSON.parse(localStorage.getItem("savedTasks")) || [];


// Add an 'onsubmit' event listener
const newTaskForm = document.querySelector('#taskForm');
newTaskForm.addEventListener('submit', (event) => {
    // Prevent default action
    event.preventDefault();
    validFormFieldInput();
});

function validFormFieldInput(){
    const newTask = {
        taskName: document.querySelector('#taskName').value,
        taskAssignedTo: document.querySelector('#assignedTo').value,
        taskDescription: document.querySelector('#taskDescription').value,
        taskDate: document.querySelector('#dueDate').value
    };

    if(isNaN(newTask.taskName) && newTask.taskName.length > 1){
        if(isNaN(newTask.taskAssignedTo) && newTask.taskAssignedTo.length > 1){
            if(newTask.taskDescription.length > 1){
                //Passed Validation start working with the data.
                TaskList.push(new Task(newTask.taskName,newTask.taskAssignedTo,newTask.taskDescription,newTask.taskDate,'TODO', TaskList.length +1));
                //console.log(TaskList);
                updateHTML(); //update dom with current task list.
                document.getElementById("taskForm").reset(); //reset form
                saveTask(); //save task
                AlertMessage("success", "Success Message"); //display success alert
            }else{
                //console.log("Error: Task Description must have more than 1 Char.");
                AlertMessage("warning", "Error: Task Description must have more than 1 Char.");
            }
        }else{
            //console.log("Error: AssignedTo must be a String and Longer than 1 Char long.")
            AlertMessage("warning", "Error: Assigned To must be a String and Longer than 1 Char long.");
        }
    }else{
        //console.log("Error: Task Name must be a String and Longer than 1 Char long.")
        AlertMessage("warning", "Error: Task Name must be a String and Longer than 1 Char long.");
    }
}

function AlertMessage(type, message){
    document.querySelector('#alertZone').innerHTML = `
    <div class="alert alert-${type} alert-dismissible fade show" role="alert" align="center">
    <strong>${message}</strong>
    <svg data-bs-dismiss="alert" xmlns="http://www.w3.org/2000/svg" width="32" height="32" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16">
    <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
    </svg>
    </div>
    `;
}

function updateHTML(){
    //take task list call the get display html function and store it to array then join array for display in dom.
    let data = [];
    TaskList.forEach(tasks =>{
        data.push(tasks.displayHTML());
    });

    document.querySelector('#taskList').innerHTML = data.join('\n');
}

function removeTask(id){
    //Remove the specified task from list
    TaskList.splice((id-1) == -1 ? 0: id-1, 1);
    //update remaining ids to account for the removed id
    TaskList.forEach(task =>{
        task.id = (task.id-1) < 1 ? 1: task.id -1;
    });
    //update the dom with current task list
    saveTask();
    updateHTML();
}

function updateStatus(status,id) {
    //change the status of the specified task's id
    TaskList[id - 1].status = status;
    //update dom with current task and status
    updateHTML(); //update the display of html
    saveTask(); //update the saved list of tasks
}

function loadTasks(){
    const loadData = JSON.parse(localStorage.getItem("savedTasks"));
    TaskList = [];
    loadData.forEach(task =>{
        TaskList.push(new Task(task.name,task.assignedTo,task.description,task.dueDate,task.status, task.id));
    });
    updateHTML();
}

function saveTask(){
    localStorage.setItem('savedTasks', JSON.stringify(TaskList));
}

window.onload = function() {
   loadTasks();
}
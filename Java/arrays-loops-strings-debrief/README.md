# ArraysLoopsStrings
Lesson on Java Arrays, ArrayLists, Loops, Strings
## Directions to Clone and load in IntelliJ

- Go to this [Repo](https://github.com/ocskier/arrays-loops-strings-debrief.git) and FORK this repository onto your github
- Copy the HTTPS URL from the "Code" button on your GH
- Open your terminal (Git bash) and navigate to the appropriate location where you wish to save the folder to and run 
```bash 
git clone URL-you-copied-goes-here
```

- Open IntelliJ and click on new project
- Select Java and make sure you have a Project SDK selected and then click next
  - Leave the box for create project from template unchecked and click next
- Click on three dots ... next to project location. Change project location to the directory you just cloned to your machine. Click OK and then click Finish.

- `MSGrades` will be the entry point for your application.
- Click on the `MSGrades` java file and read thru the comments.
- Anytime you want to test the code right click on `MSGrades.java` the first time and 
  select `Build Module` which should open the Build output and then clicking the green
  hammer will compile future rebuilds
- To run the first time right click on `MSGrades.java` and click `Run MSGrades.main()` 
  which will also open the Run output and then on the Green play button will attempt
  further reruns
<br><br>

## Directions for Coding
-- Make all your instance fields / variables private and all your classes and methods public 
- [ ] Import the java util ArrayList class module at the top for good practice
- [ ] Create 4 ArrayLists instance variables below the teachers one all private constant(final)
   - [ ] a new instance of a students ArrayList storing strings
   - [ ] a new instance of a math grades ArrayList storing integers
   - [ ] a new instance of a science grades ArrayList storing integers
   - [ ] a new instance of a math grades ArrayList storing integers
<br>

- [ ] Inside the class constructor add some students and their grades to the ArrayLists
   - [ ] add two students to the students ArrayList
   - [ ] add two corresponding values for the two students to the math grades ArrayList
   - [ ] add two corresponding values for the two students to the science grades ArrayList
   - [ ] add two corresponding values for the two students to the english grades ArrayList
<br>

- [ ] Inside the printStudents public method
   - [ ] loop thru the students ArrayList with a For Each loop
     - [ ] print each students name on a new line as output
<br>

- [ ] Make a method that prints an individual students grades
    - It will be public, not have a return value, and have one int type parameter that is a students index
    - Inside the method:
        - [ ] Print the students name by using the index variable to index the students array
        - [ ] Print a concatenated string of say "Math: " + and the corresponding grade from that ArrayList of grades by index
        - [ ] Do this for the next two subjects
          (Total of four output statements)
<br>

-- Inside the main function before the first two given output statements
  - [ ] create a new instance of MSGrades class and store in a variable
    (anything like msGrade8)
  - [ ] look up how to print an empty new line for readability
<br>

-- After
```bash
System.out.println("Middle School Roster");
System.out.println("====================");
```
- [ ] invoke or run the printStudents method on our class instance
- [ ] Print another empty line if desired for readability
- [ ] Use a for loop to loop thru the given teachers array on the class instance
  - inside the loop
    - [ ] create a new variable that stores the result of "Teacher: " + teachers name from the array using the counter variable
    - [ ] Print the new variable as output
<br>

-- After
```bash
System.out.println("\nStudent Grades:\n");
```
- [ ] Use a for loop to loop thru students ArrayList on the class instance
  - inside the loop
    - [ ] pass the counter var as an index to the printStudentGrades method to print each students info
    - [ ] Print a new line if you want it to look presentable

<br>

## Directions for Pushing Revision to github
- Push your changes up to your repository. From your git bash terminal, enter the following commands:
```bash
git add .
git commit -m "Adds solutions to activity"
git push -u origin main
```
- Go to your GitHub repository. You should see your changes.
- If you want you can submit a PR to merge changes
<br>

## If you finish early, consider adding some additional functionality. Be original, add some of your own functionality to the application.


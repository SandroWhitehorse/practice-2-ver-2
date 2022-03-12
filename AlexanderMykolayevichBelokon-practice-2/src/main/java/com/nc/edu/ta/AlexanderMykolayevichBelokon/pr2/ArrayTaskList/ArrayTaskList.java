/**
 * Alexander Belokon & educators
 * <p>
 * Copyright (c) 2022 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker and for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.ArrayTaskList;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.AbstractTaskList.AbstractTaskList;
import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.task.Task;


/**
 * Class ArrayTaskList   .
 *
 * @author Alexander Belokon
 * @version 1.1 03 Feb 2021
 */
public class ArrayTaskList extends AbstractTaskList {
    private Task taskArray[];
    // task array objects class Task
    private int count;
    private int sizeofarray;
    private static final int extendVar = 2;
    private static final String START_OF_TASK_TITLE = "[EDUCTR][TA]"; //const variable for start of title strings
    public int countOfCreatedLists=0;
    //the size of the section in the sharedArray allocated to this message.

    //constructor for class ArrayTaskList
    public ArrayTaskList() {
        taskArray = new Task[1];//create Array of tasks with 1 task
        count = 0; //count of tasks in array
        sizeofarray = 1; // variable for array size = 1
        countOfCreatedLists++; //increment for created Lists
    }

    //Methods for adding / deleting task:

    public void add(Task task) {
        if (task != null) {
            task.setTitle(this.START_OF_TASK_TITLE+task.getTitle());
            //^^^Method for adding not unique tasks to list.
            // The ability to add empty tasks should be disabled by the implementation.
            if (count == sizeofarray) {
                //invoking the growSize() method that creates an array of bigger size
                Task temp[] = null;
                if (count == sizeofarray) {
                    //initialize a size + extension array of array
                    temp = new Task[sizeofarray + extendVar];
                    {
                        for (int i = 0; i < sizeofarray; i++) {
                            //copies all the elements of the old array
                            temp[i] = taskArray[i];
                        }
                    }
                }
                taskArray = temp;
                sizeofarray = sizeofarray + extendVar;
            }
            //appends an element at the end of the array
            taskArray[count] = task;
            count++;
        }

    }

    public void remove(Task task) {
//remove task

        //^^^Method for deleting all tasks which are equal input parameter.
        //The ability to delete an empty task should be disabled by the implementation.
        if (task != null) {
            //this if choose if task exist
            for (int i = 0; i < taskArray.length; i++)
            //this for loop is using for array elements
            {
                if (task == taskArray[i]) {
                    for (int j = count - 1; j >= i; j--) {
                        //shifting all the elements to the left from the specified index
                        taskArray[j + 1] = taskArray[j];
                    }

                }
            }
        }

    }

    public Task getTask(int index) {

        if ((index >= 0) & (index <= this.size())) {

            //^^^get a task under a given number (from scratch).
            //Checking the correctness of the input value must be implemented - valid
            return this.taskArray[index];
        } else {
            return null;
        }

    }
//get task by index number beginning 0.
}

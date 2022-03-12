/**
 * Alexander Belokon & educators
 * <p>
 * Copyright (c) 2022 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker and for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.AbstractTaskList;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.task.Task;

/**
 * Class AbstractTasklist   is a class which cannot be instantiated, meaning you cannot create new instances of an
 * abstract class. The purpose of an abstract class is to function as a base for subclasses.
 *
 * @version 1.1 03 Feb 2021
 * @author Alexander Belokon
 */
public abstract class AbstractTaskList {
    private Task taskArray[];
        // task array  objects class Task
        private int count;//number of Tasks in array
        private int sizeofarray;
        private static int extendVar=2;
    //the size of the section in the sharedArray allocated to this message.

        public AbstractTaskList()
        {//this is a constructor for initializing variables in classes
            taskArray = new Task[1];
            count = 0;
            sizeofarray = 1;
        }

    //this abstract void add for adding Task to TaskList
    abstract protected void add(Task task) ;

    //this abstract void remove for removing Task from TaskList
    abstract protected void remove(Task task) ;

    //this method size() return integer number of task in this list.
    public int size() {return this.count; }

    //this abstract methos return task by its number in array
    protected abstract Task getTask(int index);

}

/**
 * Alexander Belokon & educators
 * <p>
 * Copyright (c) 2022 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker and for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.task.Task;

/**
 * Class MainClass calculates and outputs to the console the matrix obtained
 * from the result of a mathematical operation on two input operands of the
 * range of numbers 1...10, given by a loop and passed to the Operation class
 * instance as an argument with returning the result to the MainClass .
 *
 * @author Alexander Belokon & educators
 * @version 1.1 03 Feb 2021
 */
public class MainClass {
    /**
     * This class I use for manual testing in my code creating instances of classes
     */
    public static <String> void main(String[] args) {
        Task task = new Task("Go english", 17);

        //System.out.println(task.getRepeatInterval());
        //System.out.println(task.getTitle());
        //System.out.println(task.isActive());
        //System.out.println(task.isRepeated());
        //System.out.println(task.toString());
        //System.out.println(task.nextTimeAfter(11));
        //System.out.println(task.getEndTime());

        Task task1 = new Task("Go American", 1, 10, 2);
    }
}


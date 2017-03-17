package org.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of task");
		int num = scn.nextInt(), task[] = new int[num];
		int deadline[] = new int[num], req[] = new int[num];
		
		for (int i = 0; i < task.length; i++) {
			task[i]=i;
			System.out.println("Assign Deadline for task ["+i+"]");
			deadline[i] = scn.nextInt();
			System.out.println("Assign Required time for task ["+i+"]");
			req[i] = scn.nextInt();
		}
		for (int d : deadline) {
			System.out.println(d);
		}
		System.out.println();
		for (int i : req) {
			System.out.println(i);
		}
		scn.close();

	}

}
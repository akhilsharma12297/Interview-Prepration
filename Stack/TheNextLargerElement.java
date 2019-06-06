package Stack;

//Java program to print next 
import java.util.*;
import java.io.*;

public class TheNextLargerElement {
	static class stack {
		int top;
		int items[] = new int[100];

		// Stack functions to be used by printNGE
		void push(int x) {
			if (top == 99) {
				System.out.println("Stack full");
			} else {
				items[++top] = x;
			}
		}

		int pop() {
			if (top == -1) {
				System.out.println("Underflow error");
				return -1;
			} else {
				int element = items[top];
				top--;
				return element;
			}
		}

		boolean isEmpty() {

			if (top == -1) {
				return true;
			}
			return false;
		}
	}

	/*
	 * prints element and NGE pair for all elements of arr[] of size n
	 */
	static void printNGE(int arr[], int n) {
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		printNGE(arr, n);
	}
}

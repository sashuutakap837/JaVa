/*Реализовать программу, получающую на вход в качестве аргумента имя че- ловекa и выводящую “Hello ” + имя, в противном случае, если параметр не переда- вался, “Hello world”*/
package task1;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
		System.out.println("Hello World");
		} else {
		System.out.println("Hello " + args[0]);
		}
		}
}

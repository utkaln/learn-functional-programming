package com.learnfp.fnprog;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FnprogApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FnprogApplication.class, args);
		List<Integer> numbers = List.of(45, 78, 34, 33, 56, 87, 54, 32, 74, 67, 98, 69);
		List<String> names = List.of("Managerial", "Business", "Marketing", "Operational", "Technical", "Legal");
		System.out.println("*********printEvenNumbers*************");
		printEvenNumbers(numbers);
		System.out.println("*********printSquareNumbers*************");
		printSquareNumbers(numbers);
		System.out.println("*********printSquareNumbersEven*************");
		printSquareNumbersEven(numbers);
		System.out.println("*********printFilteredNames*************");
		printFilteredNames(names);

	}

	private static void printEvenNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number % 2 == 0)
				.forEach(System.out::println); // method reference only, no invocation
	}

	private static void printFilteredNames(List<String> names) {
		names.stream()
				.filter(name -> name.contains("Technical"))
				.forEach(System.out::println);
	}

	private static void printSquareNumbers(List<Integer> numbers) {
		numbers.stream()
				.map(num -> num * num)
				.forEach(System.out::println);
	}

	private static void printSquareNumbersEven(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number % 2 == 0)
				.map(num -> num * num)
				.forEach(System.out::println);
	}

}

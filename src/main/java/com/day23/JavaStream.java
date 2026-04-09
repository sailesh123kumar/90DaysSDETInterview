package com.day23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {

		Emp e1 = new Emp(101, "Sailesh", 6000, "SDET");
		Emp e2 = new Emp(102, "Kirusha", 16000, "SDET");
		Emp e3 = new Emp(103, "Prathiksha", 10000, "SDET");
		Emp e4 = new Emp(104, "Viniksha", 36000, "SDET");

		List<Emp> empList = new ArrayList<Emp>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		List<Emp> filteredListwithMorethan10000 = empList.stream().filter(e -> e.getSalary() > 10000)
				.collect(Collectors.toList());

		filteredListwithMorethan10000.forEach(e -> System.out.println(e));

		System.out.println("=================");

		List<Emp> sortedEmpList = empList.stream()
				.sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
				.collect(Collectors.toList());

		sortedEmpList.forEach(e -> System.out.println(e));
	}

}

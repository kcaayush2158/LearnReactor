package com.application;

import java.util.Arrays;

import reactor.core.publisher.Flux;

public class SimplestFlux {
	public static void main(String[] args) {
		
		Flux<String> stringFlow = Flux.just("one","two","three");
		Flux<Integer> numberFlow=Flux.fromIterable(Arrays.asList(1,2,3));
		stringFlow.subscribe(i -> System.out.println(i));
		numberFlow.subscribe(i -> System.out.println(i));
		
		
	}

}

package com.application.parallel;

import reactor.core.publisher.Flux;

import reactor.core.scheduler.Schedulers;

public class Parallel {
	public static void main(String[] args) {
		
		Flux.range(1, 10)
		.parallel()
		.runOn(Schedulers.parallel())
		.subscribe(i-> System.out.println(Thread.currentThread().getName()+" => "+i));
	}

}

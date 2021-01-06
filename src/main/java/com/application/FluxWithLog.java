package com.application;

import reactor.core.publisher.Flux;

public class FluxWithLog {
	public static void main(String[] args) {
		
		//subscribe with consumer and error handler
        System.out.println("example for subscribe with consumer and error handler");
	    Flux<DivideIntegerSupplier> integerFluxwithException = Flux.just(
	 	         new DivideIntegerSupplier(1, 2),
	              new DivideIntegerSupplier(8, 2),
	              new DivideIntegerSupplier(20, 10),
	              new DivideIntegerSupplier(1, 0),
	              new DivideIntegerSupplier(2, 2)
	 		  
	 		   ).log();
	    
	    integerFluxwithException.subscribe(
	                integer -> integer.get(),
	                throwable -> System.out.println("get error " + throwable.getClass().getSimpleName() + " " + throwable.getMessage())
	        );
	
	}
}

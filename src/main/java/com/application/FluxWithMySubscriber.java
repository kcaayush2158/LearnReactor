package com.application;

import reactor.core.publisher.Flux;

public class FluxWithMySubscriber {
	@SuppressWarnings("deprecation")
	  
	public static void main(String[] args) {
	  //subscribe with consumer and error handler
    Flux<DivideIntegerSupplier> integerFlux = Flux.just(
 	         new DivideIntegerSupplier(1, 2),
              new DivideIntegerSupplier(8, 2),
              new DivideIntegerSupplier(20, 10),
              new DivideIntegerSupplier(2, 2)
 		  
 		   );
    MySubscriber<DivideIntegerSupplier> integerMySubscriber = new MySubscriber<>();
    
    integerFlux.subscribe(
 		   integer ->integer.get(),
 		   throwable -> throwable.getMessage(),
 		   () ->System.out.println("done"),
 		   integer -> integerMySubscriber.request(5));
 		   
    integerFlux.subscribe(integerMySubscriber);
    
    
    System.out.print("this is the end of the main");
	  }

}

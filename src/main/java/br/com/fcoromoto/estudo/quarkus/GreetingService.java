package br.com.fcoromoto.estudo.quarkus;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

  public String greeting2(String name){
    return "hello: "+name;
  }
}

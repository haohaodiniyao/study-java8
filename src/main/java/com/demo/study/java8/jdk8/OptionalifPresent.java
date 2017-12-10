package com.demo.study.java8.jdk8;
import java.util.Optional;
import java.util.function.Consumer;
public class OptionalifPresent {
    public static void main(String[] args) {
        Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
        //Using Optional.ifPresent
        Consumer<PrimeMinister> pmConsumer = (PrimeMinister p) -> System.out.println(p.getName());
        pm.ifPresent(pmConsumer);
   }
} 
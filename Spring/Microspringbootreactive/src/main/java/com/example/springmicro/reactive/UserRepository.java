package com.example.springmicro.reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Mono<User> findByName(String name);}


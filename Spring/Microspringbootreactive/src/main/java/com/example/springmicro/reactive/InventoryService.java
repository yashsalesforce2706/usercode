package com.example.springmicro.reactive;

import java.util.stream.Collectors;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;


@Service
class InventoryService {

    private ItemRepository itemRepository;

    private CartRepository cartRepository;

    InventoryService(ItemRepository repository,
                     CartRepository cartRepository) {
        this.itemRepository = repository;
        this.cartRepository = cartRepository;
    }

    public Mono<Cart> getCart(String cartId) {
        return this.cartRepository.findById(cartId);
    }

    public Flux<Item> getInventory() {
        return this.itemRepository.findAll();
    }

    Mono<Item> saveItem(Item newItem) {
        return this.itemRepository.save(newItem);
    }

    Mono<Void> deleteItem(String id) {
        return this.itemRepository.deleteById(id);
    }

}

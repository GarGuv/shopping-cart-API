package com.github.GarGuv.service;

import com.github.GarGuv.dtos.ItemDto;
import com.github.GarGuv.repository.entities.Item;
import org.springframework.http.ResponseEntity;

public interface ItemService {

    ResponseEntity<?> createNewItem(ItemDto itemDto);

    Item findByName(String name);

}

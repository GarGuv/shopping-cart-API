package com.github.GarGuv.controllers;

import com.github.GarGuv.dtos.ItemDto;
import com.github.GarGuv.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(("/api/v1/items"))
public class CartController {

    private final ItemService itemService;

    @PostMapping("/add")
    public ResponseEntity<?> createItem(@RequestBody ItemDto itemDto) {
        return itemService.createNewItem(itemDto);
    }

}

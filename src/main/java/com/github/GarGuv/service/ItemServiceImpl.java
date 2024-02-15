package com.github.GarGuv.service;

import com.github.GarGuv.dtos.ItemDto;
import com.github.GarGuv.repository.ItemRepository;
import com.github.GarGuv.repository.entities.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ItemRepository itemRepository;

    @Override
    public ResponseEntity<?> createNewItem(ItemDto itemDto) {
        Item item = new Item();
        item.setName(itemDto.getName());
        item.setPrice(itemDto.getPrice());
        item.setShortDescription(itemDto.getShortDescription());
        item.setLongDescription(itemDto.getLongDescription());
        itemRepository.save(item);
        return ResponseEntity.ok(itemDto);
    }

    @Override
    public Item findByName(String name) {
        return itemRepository.findItemByName(name).orElseThrow();
    }

}

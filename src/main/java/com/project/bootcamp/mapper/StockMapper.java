package com.project.bootcamp.mapper;

import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock active) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(active.getId());
        stockDTO.setName(active.getName());
        stockDTO.setPrice(active.getPrice());
        stockDTO.setVariation(active.getVariation());
        stockDTO.setDate(active.getDate());
        return stockDTO;
    }

    public List<StockDTO> toDto(List<Stock> list){
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

}

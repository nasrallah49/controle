package com.example.computerService.sevice.mappers;

import com.example.computerService.dao.entities.Computer;
import com.example.computerService.sevice.dtos.ComputerDTO;
import org.modelmapper.ModelMapper;

public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();


    public ComputerDTO fromComputerDTO(Computer computer) {
        return this.modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO) {
        return this.modelMapper.map(computerDTO, Computer.class);
    }
}

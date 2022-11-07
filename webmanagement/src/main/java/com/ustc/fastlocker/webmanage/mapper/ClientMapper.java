package com.ustc.fastlocker.webmanage.mapper;

import com.ustc.fastlocker.webmanage.dto.ClientIndexDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientMapper {
    List<ClientIndexDTO> listClient();
}

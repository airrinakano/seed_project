package com.example.spring_project.service;

import com.example.api.dto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemListService {

    public List<ItemDto> getRecentryHistory(String userId, Integer companyId) {

            return new ArrayList<ItemDto>();
        }
    }
}

package com.etc.ms.controller;

import com.etc.ms.service.MsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsController {

    @Autowired
    private MsService msService;

    @GetMapping("/ms")
    public boolean ms(int userId, int goodsId) {
        return msService.ms(goodsId, userId);
    }
}

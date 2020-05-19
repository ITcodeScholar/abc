package com.etc.ms.service;

import com.etc.ms.entity.Goods;
import com.etc.ms.entity.Order;
import com.etc.ms.repository.GoodsRepository;
import com.etc.ms.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Optional;

@Service
public class MsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public boolean ms(int goodsId, int userId) {
        Goods goods = goodsRepository.findById(goodsId);
        if (goods.getNum() > 0) {
            goods.setNum(goods.getNum() - 1);
            goodsRepository.save(goods);

            Order order = new Order(0, userId, goodsId, new Date());
            orderRepository.save(order);
            return true;
        } else {
            return false;
        }
    }
}

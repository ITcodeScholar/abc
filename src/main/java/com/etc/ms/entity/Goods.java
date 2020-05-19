package com.etc.ms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_goods")
@OptimisticLocking // 乐观锁
public class Goods {
    @Id
    @Column(name = "goods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "goods_name")
    private String name;
    @Column(name = "goods_price")
    private double price;
    @Column(name = "goods_num")
    private int num;

    @Version // 版本号
    private long version;
}

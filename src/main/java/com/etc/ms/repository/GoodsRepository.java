package com.etc.ms.repository;

import com.etc.ms.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {
//    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Goods save(Goods goods);

//    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Goods findById(int id);
}

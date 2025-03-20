package com.metacoding.storev1.store;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
// import lombok.RequiredArgsConstructor;
import jakarta.persistence.Query;

// @RequiredArgsConstructor // final 붙은 필드로만 생성자 만들어
@Repository
public class StoreRepository {

    private EntityManager em;

    public StoreRepository(EntityManager em) {
        this.em = em;
    }

    public void save(String name, int stock, int price) {
        Query query = em.createNativeQuery("insert into store_tb(name, stock, price) values('바나나', 40, 3000)");
        query.setParameter(1, name);
        query.setParameter(2, stock);
        query.setParameter(3, price);
        query.executeUpdate();
    }

}

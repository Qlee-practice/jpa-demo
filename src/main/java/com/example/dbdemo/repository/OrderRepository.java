package com.example.dbdemo.repository;

import com.example.dbdemo.entity.Order;
import com.example.dbdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


    @Query(value = "from Order o left join fetch o.user where o.id in :ids")
    public List<Order> fetchAllWithUser(@Param("ids") List<Long> ids);

}

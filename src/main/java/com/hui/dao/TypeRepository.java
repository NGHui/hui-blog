package com.hui.dao;

import com.hui.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by limi on 2017/10/16.
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    /**
     * 更具名字查询类型
     * @param name
     * @return
     */
    Type findByName(String name);
}

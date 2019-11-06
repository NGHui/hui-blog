package com.hui.dao;

import com.hui.po.Tag;
import com.hui.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    /**
     * 更据名字查询标签
     * @param name
     * @return
     */
    Tag findByName(String name);
}

package com.hui.service;

import com.hui.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by limi on 2017/10/16.
 */
public interface TypeService {

    /**
     * 添加类型
     * @param type
     * @return
     */
    Type saveType(Type type);

    /**
     * 更具id查找类型
     * @param id
     * @return
     */
    Type getType(Long id);

    /**
     * 根据名字查询类型
     * @param name
     * @return
     */
    Type getTypeByName(String name);

    /**
     * 类型分页
     * @param pageable
     * @return
     */
    Page<Type> listType(Pageable pageable);

    /**
     * 类型跟新 先查询,后更新
     * @param id
     * @param type
     * @return
     */
    Type updateType(Long id, Type type);

    /**
     * 根据id删除类型
     * @param id
     */
    void deleteType(Long id);
}

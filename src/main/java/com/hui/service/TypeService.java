package com.hui.service;

import com.hui.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/10
 */
public interface TypeService {

    /**
     * 添加分类
     * @param type
     * @return
     */
    Type saveType(Type type);

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    Type getType(Long id);

    /**
     * 根据名字查寻分类
     * @param name
     * @return
     */
    Type getTypeByName(String name);

    /**
     *分类分页
     * @param pageable
     * @return
     */
    Page<Type> listType(Pageable pageable);

    /**
     * 查询全部分类 一篇文章可以有多个分类
     * @return
     */
    List<Type> listType();

    /**
     *分类排序
     * @param size
     * @return
     */
    List<Type> listTypeTop(Integer size);

    /**
     * 先查询,后更新分类
     * @param id
     * @param type
     * @return
     */
    Type updateType(Long id, Type type);

    /**
     * 删除分类
     * @param id
     */
    void deleteType(Long id);
}

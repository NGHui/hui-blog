package com.hui.service;

import com.hui.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagService {

    /**
     * 新增类型
     * @param type
     * @return
     */
    Tag saveTag(Tag type);

    /**
     * 根据id查询标签
     * @param id
     * @return
     */
    Tag getTag(Long id);

    /**
     * 根据名字查询标签
     * @param name
     * @return
     */
    Tag getTagByName(String name);

    /**
     * 分页遍历查询标签
     * @param pageable
     * @return
     */
    Page<Tag> listTag(Pageable pageable);

    /**
     * 更新标签 先查询在跟新
     * @param id
     * @param type
     * @return
     */
    Tag updateTag(Long id, Tag type);

    /**
     * 删除标签
     * @param id
     */
    void deleteTag(Long id);
}

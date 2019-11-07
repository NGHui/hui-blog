package com.hui.service;

import com.hui.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

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

    /**
     * 根据传过来的id查询标签
     * @param ids
     * @return
     */
    List<Tag> listTag(String ids);

    /**
     * 查询所有的标签
     * @return
     */
    List<Tag> listTag();
}

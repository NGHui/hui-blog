package com.hui.service;

import com.hui.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/10
 */
public interface TagService {

    /**
     * 添加标签
     * @param type
     * @return
     */
    Tag saveTag(Tag type);

    /**
     * 根据ID查询标签
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
     * 标签分页
     * @param pageable
     * @return
     */
    Page<Tag> listTag(Pageable pageable);

    /**
     * 查询所有的标签
     * @return
     */
    List<Tag> listTag();

    /**
     * 标签排序
     * @param size
     * @return
     */
    List<Tag> listTagTop(Integer size);

    /**
     * 博文展示标签列表的集合
     * @param ids
     * @return
     */
    List<Tag> listTag(String ids);

    /**
     * 更新标签,先查询,后更新
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

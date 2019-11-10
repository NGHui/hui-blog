package com.hui.service;

import com.hui.po.Blog;
import com.hui.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/10
 */
public interface BlogService {

    /**
     * 根据博客ID查询博文
     * @param id
     * @return
     */
    Blog getBlog(Long id);

    /**
     *根据博客ID修改博文
     * @param id
     * @return
     */
    Blog getAndConvert(Long id);

    /**
     * 有条件的分页查询
     * @param pageable 分页
     * @param blog 查询的条件
     * @return
     */
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    /**
     * 博文分页
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(Pageable pageable);

    /**
     * 博客分页  根据博文的标签分类 分页
     * @param tagId 标签ID
     * @param pageable 分页
     * @return
     */
    Page<Blog> listBlog(Long tagId, Pageable pageable);

    /**
     * 全局搜索博文 分页查询  like 语句查询
     * @param query
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(String query, Pageable pageable);

    /**
     *博客推荐功能
     * @param size
     * @return
     */
    List<Blog> listRecommendBlogTop(Integer size);

    /**
     *博客归档
     * @return
     */
    Map<String,List<Blog>> archiveBlog();

    /**
     * 查询博客数量
     * @return
     */
    Long countBlog();

    /**
     * 博客发布
     * @param blog
     * @return
     */
    Blog saveBlog(Blog blog);

    /**
     * 博客更新
     * @param id
     * @param blog
     * @return
     */
    Blog updateBlog(Long id, Blog blog);

    /**
     * 博客删除
     * @param id
     */
    void deleteBlog(Long id);
}

package com.hui.service;

import com.hui.po.Comment;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/10
 */
public interface CommentService {

    /**
     * 博客评论列表
     * @param blogId
     * @return
     */
    List<Comment> listCommentByBlogId(Long blogId);

    /**
     * 发表评论
     * @param comment
     * @return
     */
    Comment saveComment(Comment comment);
}

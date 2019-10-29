package com.bkw.butterknife.library;

/**
 * 绑定目标类入口
 *
 * @author bkw
 */
public interface ViewBinder<T> {

    void bind(T target);
}

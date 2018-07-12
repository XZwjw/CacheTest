package com.example.wangjiawang.cachetest.adapter.test;

/**
 * Description:一个实体类，用于测试。
 * Created by wangjiawang on 2018/7/12.
 * complete
 */

public class EntityTest {
    private String id;
    private String name;

    public EntityTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

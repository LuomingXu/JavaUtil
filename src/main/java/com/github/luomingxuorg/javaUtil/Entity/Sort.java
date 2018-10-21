/*
 * Copyright 2018-2018 LuomingXuOrg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author : Luoming Xu
 * File Name : Sort.java
 * Url: https://github.com/LuomingXuOrg/JavaUtil
 */

package com.github.luomingxuorg.javaUtil.Entity;

import lombok.Data;

/**
 * 排序的定义类
 */
@Data
public class Sort
{
    public Sort() {}

    public Sort(String fieldName)
    {
        this.fieldName = fieldName;
    }

    public Sort(String fieldName, Direction direction)
    {
        this.direction = direction;
        this.fieldName = fieldName;
    }

    public enum Direction
    {
        DESC,
        ASC
    }

    /**
     * 排序方式, 默认倒序
     */
    private Direction direction = Direction.DESC;

    //需要进行排序的字段名
    private String fieldName;

    @Override
    public String toString()
    {
        return "Sort{" +
                "direction=" + direction +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}

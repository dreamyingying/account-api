package com.menglei.account.api.accountapi.dao;

import com.menglei.account.entity.BaseEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
  * @className IBaseDAO
  * Description 基础DAO
  * @author Menglei（lei.meng@cmgplex.com)
  * @date 2018/8/16 18:43
  * @version 1.0
  **/
public interface IBaseDAO<T extends BaseEntity> {

    /**
     * 新增单一对象
     *
     * @param entity 插入的对象
     * @return 返回是否成功 自增值在对象的ID字段里返回
     */
    int insert(T entity);

    /**
     * 按ID更新对象,如果属性为空，则不会进行对应的字段值更新,如果有字段要更新为null
     *
     * @param entity 要更新的实体对象
     * @return 成功更新的行数
     */
    int update(T entity);

    /**
     * 根据id删除记录
     *
     * @param id 要删除的id
     * @return 成功删除的行数
     */
    int deleteById(Object id);


    /**
     * 根据id进行对象查询
     *
     * @param id 要查询的id
     * @return 返回范型对象
     */
    T findById(Object id);


    /**
     * 返回全部记录集合（带排序）
     *
     * @param orderBy 排序条件
     * @return 返回范型对象集合
     */
    List<T> findAll(@Param("orderBy") Map<String, Object> orderBy);


    /**
      * Description 根据一个条件获取一条数据
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 17:43 2018/9/10
      * @param property 字段名称
      * @param value 字段值
      * @return T返回对象
      **/
    T findByProperty(@Param("property") String property, @Param("value") Object value);

    /**
     * Description 根据一个条件获取所有数据
     * @author Menglei（lei.meng@cmgplex.com)
     * @date 17:43 2018/9/10
     * @param property 字段名称
     * @param value 字段值
     * @return T返回对象
     **/
    List<T> findListByProperty(@Param("property") String property, @Param("value") Object value);


    /**
      * Description 多条件查询一条数据
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:43 2018/9/17
      * @param condition 查询条件
      * @return T
      **/
    T queryOne(@Param("condition") Map<String, Object> condition);


    /**
      * Description 条件查询数量总和
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 17:34 2018/12/14
      * @param condition 条件
      * @return int
      **/
    int queryCount(@Param("condition") Map<String, Object> condition);

    /**
     * 跟据条件组合查询对象集合，带翻页。
     *
     * @param condition 进行查询的条件集合
     * @param offset 起始位置
     * @param rows 限制记录数
     * @return 返回范型对象集合
     */
    List<T> queryPage(@Param("condition") Map<String, Object> condition, @Param("offset") Integer offset,
                             @Param("rows") Integer rows);
}
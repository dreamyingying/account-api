package com.menglei.account.api.accountapi.common;

import com.menglei.account.api.accountapi.dao.IBaseDAO;
import com.menglei.account.entity.BizData4PageAdmin;

import java.util.Map;

/**
  * @className BizData4PageAdminBuilder
  * Description 构建分页实体
  * @date 2018/12/14 17:28
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class BizData4PageAdminBuilder {

    public static BizData4PageAdmin simpleBuilder(IBaseDAO dao, Map<String,Object> condition, int pageNumber, int pageSize) {
        BizData4PageAdmin bizData4PageAdmin = new BizData4PageAdmin();
        bizData4PageAdmin.setSize(pageSize);
        int curPage = 0;
        if (pageNumber < 1) {
            curPage = 1;
        } else {
            curPage = pageNumber;
        }

        bizData4PageAdmin.setTotalElements(dao.queryCount(condition));
        int totalPage = bizData4PageAdmin.getTotalElements() / bizData4PageAdmin.getSize();
        if (bizData4PageAdmin.getTotalElements() % bizData4PageAdmin.getSize() > 0) {
            totalPage++;
        }
        if (totalPage <= 0) {
            totalPage = 1;
        }

        bizData4PageAdmin.setTotalPages(totalPage);

        if (curPage > totalPage) {
            curPage = totalPage;
        }

        if (curPage == 1) {
            bizData4PageAdmin.setFirst(true);
        }
        if (curPage == totalPage) {
            bizData4PageAdmin.setLast(true);
        }

        bizData4PageAdmin.setContent(dao.queryPage(condition, (curPage - 1) * bizData4PageAdmin.getSize(),
                bizData4PageAdmin.getSize()));

        bizData4PageAdmin.setNumber(curPage - 1);
        /**
         * 神逻辑，传入参数从1开始，传出参数从0开始
         **/

        return bizData4PageAdmin;
    }
}

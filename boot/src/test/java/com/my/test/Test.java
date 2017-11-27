package com.my.test;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/11/22.
 */
public class Test {
    public static void main(String[] args) {
        String sql = "\n" +
                "SELECT f.result,COUNT(*) FROM \n" +
                "(\n" +
                "SELECT e.result,e.reportName\n" +
                "FROM\n" +
                "(\n" +
                "SELECT d.`result`,d.`reportName`\n" +
                "FROM t_diag_detection d\n" +
                "INNER JOIN\n" +
                "(\n" +
                "SELECT reportName \n" +
                "FROM(\n" +
                "\tSELECT reportName ,productno,buildTime\n" +
                "\tFROM t_diag_reportinfo \n" +
                "\tWHERE 1=1\n" +
                "\tAND buildTime > '2016-11-22' AND buildTime < '2017-11-22'\n" +
                "\tORDER BY buildTime DESC\n" +
                "\t) a\n" +
                "GROUP BY a.productno\n" +
                "ORDER BY a.buildTime DESC\n" +
                ") b\n" +
                "ON d.`reportName` = b.reportName\n" +
                "WHERE 1=1\n" +
                "AND d.NAME LIKE 'apusic服务器默认密码修改检测_server%'\n" +
                "ORDER BY d.`result` ASC\n" +
                ")e\n" +
                "GROUP BY e.reportName\n" +
                ") f\n" +
                "GROUP BY result\n" +
                "ORDER BY result DESC\n";

        String str = "kdk";
        new ArrayList<String>()
                .stream()
                .filter((str1)->str1 != null)
                .collect(Collectors.<String>toList());
        System.out.println(str);

    }
}

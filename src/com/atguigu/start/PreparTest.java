package com.atguigu.start;

import com.atguigu.bean.Users;
import com.atguigu.service.PreparedService;

import java.util.List;
import java.util.Scanner;

public class PreparTest {
    private static PreparedService preparedService = new PreparedService();

    public static void main(String[] args) {
        //查询
         preparedService.QueryList().forEach(System.out::println);
        //添加
        System.out.println(preparedService.add(new Users(0, "李旭伟", "123456")));
        //修改
        System.out.println(preparedService.updateLine("李旭伟", "123"));
        //删除
        System.out.println(preparedService.delOne("李旭伟"));
    }
}

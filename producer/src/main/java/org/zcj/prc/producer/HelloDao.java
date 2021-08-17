package org.zcj.prc.producer;

import org.springframework.stereotype.Repository;

/**
 * Author: cunjunzhang
 * Date: 2020/6/19 10 19
 * Description:
 */
@Repository
public class HelloDao {

    public String hello(String hello) {
        return "hello welcome !!!"+hello;
    }
}

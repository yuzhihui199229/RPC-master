package org.zcj.rpc.server.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.zcj.rpc.common.config.NettyProperties;
import org.zcj.rpc.common.config.ZookeeperProperties;

/**
 * Author: cunjunzhang
 * Date: 2020/6/14 16 29
 * Description:
 */
@Configuration
@EnableConfigurationProperties({NettyProperties.class, ZookeeperProperties.class})
public class RpcServerAutoConfig {


}

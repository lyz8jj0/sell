package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 李新宇
 * 2019-04-01 16:19
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众平台授权url
     */
    public String weChatMpAuthorize;

    /**
     * 微信开放平台授权url
     */
    public String weChatOpenAuthorize;

    /**
     * 点餐系统
     */
    public String sell;

}

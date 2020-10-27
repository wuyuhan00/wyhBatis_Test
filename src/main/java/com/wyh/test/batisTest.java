package com.wyh.test;

import com.wyh.io.Resources;

import java.io.InputStream;

/**
 * @author wuyuhan
 * @date 2020/10/27 22:19
 */
public class batisTest {

    public void test(){
        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapperConfig.xml");
    }

}

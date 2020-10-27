package com.wyh.io;

import java.io.InputStream;

/**
 * @author wuyuhan
 * @date 2020/10/27 21:36
 */
public class Resources {

    //根据配置文件的路径，将配置文件加载为字节输入流，存放在内存中
    public static InputStream getResourceAsSteam(String path){
        InputStream resourceAsStream = Resources.class.getResourceAsStream(path);
        return resourceAsStream;
    }

}

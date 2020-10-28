package com.wyh.sqlSession;

import com.wyh.config.XMLConfigBuilder;
import com.wyh.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * @author wuyuhan
 * @date 2020/10/28 21:55
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream inputStream) throws PropertyVetoException, DocumentException {
        //1、使用demo4j解析配置文件，将解析出来的内容封装到configuration中

        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        Configuration configuration=xmlConfigBuilder.parseConfig(inputStream);

        //2、创建sqlSessionFactory对象


    }
}

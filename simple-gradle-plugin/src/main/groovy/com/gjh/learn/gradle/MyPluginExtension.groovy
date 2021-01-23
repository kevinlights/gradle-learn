package com.gjh.learn.gradle

/**
 *
 * created on 2021/1/23
 *
 * @author kevinlights
 */
class MyPluginExtension {
    String version = '1.0-SNAPSHOT';

    class Properties {
        Integer property1 = 19;
        String property2 = 'test';
    }
}

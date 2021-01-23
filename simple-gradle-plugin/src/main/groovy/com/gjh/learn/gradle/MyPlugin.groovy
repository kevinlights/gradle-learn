package com.gjh.learn.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 * created on 2021/1/23
 *
 * @author kevinlights
 **/
class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("beginning of plugin 'MyPlugin'")
    }
}

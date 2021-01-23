package com.gjh.learn.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 * created on 2021/1/23
 *
 * @author kevinlights*  */
class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("beginning of plugin 'MyPlugin'")

        writeProperty(project)
        setMyProperty(project)
    }
    void writeProperty(Project project) {
        println("write property")
        project.extensions.create('createproperty', MyPluginExtension)
    }

    void setMyProperty(Project project) {
        try {
            println("start find ext")
            project.extensions.findByName('ext').with {
                println("found ext")
                getProperty('properties').with {
                    println("found properties")
                    setProperty('property1', 30)
                    setProperty('property2', 'Hello')
                }
                setProperty('version', '1.0')
                println("modify properties completed")
            }
        } catch (Exception e) {
            println("modify properties error: " + e)
        }
        println("finish apply plugin 'MyPlugin'")
    }

    void writeTask(Project project) {
        project.task('myTask') {
            group 'helloworld'
            description 'This is a task named myTask, created in myPlugin'
            doFirst {
                println("run in myTask it $it")
            }
        }
    }
}

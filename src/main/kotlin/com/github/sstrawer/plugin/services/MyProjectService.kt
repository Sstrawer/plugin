package com.github.sstrawer.plugin.services

import com.intellij.openapi.project.Project
import com.github.sstrawer.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

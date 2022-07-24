package com.github.tanmays9.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.tanmays9.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package DI

import actions.jiraAction.JiraMoveDialog
import com.intellij.openapi.project.Project
import components.JiraComponent
import dagger.Module
import dagger.Provides

@Module
class JiraModule(
    private val view: JiraMoveDialog,
    private val project: Project
) {
    @Provides
    fun provideView() : JiraMoveDialog = view

    @Provides
    fun provideProject() : Project = project

    @Provides
    fun provideComponent() : JiraComponent =
        JiraComponent.getInstance(project)
}
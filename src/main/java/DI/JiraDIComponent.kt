package DI

import actions.jiraAction.JiraMoveDialog
import dagger.Component

@Component(modules = [JiraModule::class])
interface JiraDIComponent {
    fun inject(jiraMoveDialog: JiraMoveDialog)
}
package actions.jiraAction

import DI.DaggerJiraDIComponent
import DI.JiraModule
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.inject.Inject
import javax.swing.JComponent

class JiraMoveDialog constructor(project: Project):
    DialogWrapper(true) {

    @Inject
    lateinit var presenter: JiraMoveDialogPresenter
    private val panel : JiraMovePanel = JiraMovePanel()

    init {
        DaggerJiraDIComponent.builder()
            .jiraModule(JiraModule(this, project))
            .build().inject(this)
        isModal = true
        presenter.load()
        init()
    }

    override fun createCenterPanel(): JComponent? = panel

    fun setIssue(issue: String) = panel.setIssue(issue)
}
package actions.jiraAction

import com.intellij.openapi.project.Project
import components.JiraComponent
import git4idea.repo.GitRepositoryManager
import javax.inject.Inject

class JiraMoveDialogPresenter @Inject constructor(
    private val view: JiraMoveDialog,
    private val project: Project,
    private val component: JiraComponent
) {

    fun load() {
        getBranch()
    }

    private fun getBranch() {
        val repositoryManager = GitRepositoryManager.getInstance(project)
        val repository = repositoryManager.repositories.first()
        val ticket = repository.currentBranch!!.name
        val match = Regex(component.regex).find(ticket)
        match?.let {
            view.setIssue(match.value)
        }
    }
}
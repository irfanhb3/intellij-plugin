package components

import com.intellij.openapi.components.AbstractProjectComponent
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.project.Project
import com.intellij.util.xmlb.XmlSerializerUtil
import java.io.Serializable

@State(name = "JiraComponent", storages = [Storage(value = "jira_configuration.xml")])
class JiraComponent(project: Project? = null) : AbstractProjectComponent(project),
    Serializable, PersistentStateComponent<JiraComponent> {

    var name = ""
    var password = ""

    override fun getState(): JiraComponent? = this

    override fun loadState(state: JiraComponent) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object{
        fun getInstance(project: Project): JiraComponent = project.getComponent(JiraComponent::class.java)
    }

}
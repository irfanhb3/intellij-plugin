package settings

import com.intellij.openapi.options.Configurable
import com.intellij.openapi.project.Project
import components.JiraComponent
import javax.swing.*
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

class JiraSettings(private val project: Project): Configurable, DocumentListener {

    private var isModified = false

    override fun isModified(): Boolean = isModified

    override fun getDisplayName(): String = "My Jira Plugin"

    private val passwordField = JPasswordField()
    private val txtUsername = JTextField()

    override fun apply() {
        val config = JiraComponent.getInstance(project)
        config.name = txtUsername.name
        config.password = String(passwordField.password)
        isModified = false
    }

    override fun changedUpdate(e: DocumentEvent?) {
        isModified = true
    }

    override fun insertUpdate(e: DocumentEvent?) {
        isModified = true
    }

    override fun removeUpdate(e: DocumentEvent?) {
        isModified = true
    }

    override fun createComponent(): JComponent{
        val config = JiraComponent.getInstance(project)
        txtUsername.text = config.name
        passwordField.text = config.password

        val mainPanel = JPanel()
        mainPanel.setBounds(0, 0, 452, 120)
        mainPanel.layout = null

        val lblUsername = JLabel("Username")
        lblUsername.setBounds(30, 25, 83, 16)
        mainPanel.add(lblUsername)

        val lblPassword = JLabel("Password")
        lblPassword.setBounds(30, 74, 83, 16)
        mainPanel.add(lblPassword)

        passwordField.setBounds(125, 69, 291, 26)
        mainPanel.add(passwordField)

        txtUsername.setBounds(125, 20, 291, 26)
        mainPanel.add(txtUsername)
        txtUsername.columns = 10

        passwordField.document?.addDocumentListener(this)
        txtUsername.document?.addDocumentListener(this)

        return mainPanel
    }

}
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

    private val tokenField = JPasswordField()
    private val txtUsername = JTextField()
    private val txtUrl = JTextField()
    private val txtRegEx = JTextField()

    override fun apply() {
        val config = JiraComponent.getInstance(project)
        config.name = txtUsername.text
        config.token = String(tokenField.password)
        config.url = txtUrl.text
        config.regex = txtRegEx.text
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
        val mainPanel = JPanel()
        mainPanel.setBounds(0, 0, 452, 254)
        mainPanel.layout = null

        val lblUsername = JLabel("Username")
        lblUsername.setBounds(30, 25, 83, 16)
        mainPanel.add(lblUsername)

        val lblPassword = JLabel("Token")
        lblPassword.setBounds(30, 74, 83, 16)
        mainPanel.add(lblPassword)

        val lblUrl = JLabel("Jira URL")
        lblUrl.setBounds(30, 123, 83, 16)
        mainPanel.add(lblUrl)

        val lblRegEx = JLabel("RegEx")
        lblRegEx.setBounds(30, 172, 83, 16)
        mainPanel.add(lblRegEx)

        txtUsername.setBounds(125, 20, 291, 26)
        txtUsername.columns = 10
        mainPanel.add(txtUsername)

        tokenField.setBounds(125, 69, 291, 26)
        mainPanel.add(tokenField)

        txtUrl.setBounds(125, 118, 291, 26)
        txtUrl.columns = 10
        mainPanel.add(txtUrl)

        txtRegEx.setBounds(125, 167, 291, 26)
        txtRegEx.columns = 10
        mainPanel.add(txtRegEx)

        val config = JiraComponent.getInstance(project)
        txtUsername.text = config.name
        tokenField.text = config.token
        txtUrl.text = config.url
        txtRegEx.text = config.regex

        tokenField.document?.addDocumentListener(this)
        txtUsername.document?.addDocumentListener(this)
        txtUrl.document?.addDocumentListener(this)
        txtRegEx.document?.addDocumentListener(this)

        return mainPanel
    }

}
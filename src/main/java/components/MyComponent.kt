package components

import com.intellij.ide.plugins.PluginManager
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.components.ApplicationComponent
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.extensions.PluginId
import com.intellij.util.xmlb.XmlSerializerUtil
import com.intellij.util.xmlb.annotations.Attribute
import com.sun.tools.javac.util.Log

@State( name="MyConfiguration", storages=[Storage(value="myConfiguation.xml")])
class MyComponent : ApplicationComponent, PersistentStateComponent<MyComponent> {

    @Attribute
    private var localVersion: String = "0.0"
    private lateinit var version: String

    override fun initComponent() {
        super.initComponent()

        version = PluginManager.getPlugin(PluginId.getId("plugin.plugin"))!!.version

        if (!isNewVersion()) {
            updateLocalVersion()
            val notification = NotificationGroup("Plugin", NotificationDisplayType.BALLOON, true)
            notification.createNotification(
                "Plugin Updated", "This is the future", NotificationType.INFORMATION, null
            ).notify(null)
        }
    }

    private fun isNewVersion(): Boolean {
        val s1 = localVersion.split('-')[0].split(' ')
        val s2 = version.split('-')[0].split(' ')

        if (s1.size != s2.size)
            return true
        System.out.println("info "+s1[0]+" "+s2[0])
        var i = 0
        while (i < s1.size && i < s2.size) {
            if (s1[i] < s1[i])
                return true
            i++;
        }
        return false
    }

    private fun updateLocalVersion() {
        localVersion = version
    }

    override fun getState(): MyComponent? = this

    override fun loadState(state: MyComponent) = XmlSerializerUtil.copyBean(state, this)

}
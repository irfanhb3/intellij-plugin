package settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lsettings/JiraSettings;", "Lcom/intellij/openapi/options/Configurable;", "Ljavax/swing/event/DocumentListener;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "isModified", "", "tokenField", "Ljavax/swing/JPasswordField;", "txtRegEx", "Ljavax/swing/JTextField;", "txtUrl", "txtUsername", "apply", "", "changedUpdate", "e", "Ljavax/swing/event/DocumentEvent;", "createComponent", "Ljavax/swing/JComponent;", "getDisplayName", "", "insertUpdate", "removeUpdate", "plugin"})
public final class JiraSettings implements com.intellij.openapi.options.Configurable, javax.swing.event.DocumentListener {
    private boolean isModified;
    private final javax.swing.JPasswordField tokenField = null;
    private final javax.swing.JTextField txtUsername = null;
    private final javax.swing.JTextField txtUrl = null;
    private final javax.swing.JTextField txtRegEx = null;
    private final com.intellij.openapi.project.Project project = null;
    
    @java.lang.Override()
    public boolean isModified() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDisplayName() {
        return null;
    }
    
    @java.lang.Override()
    public void apply() {
    }
    
    @java.lang.Override()
    public void changedUpdate(@org.jetbrains.annotations.Nullable()
    javax.swing.event.DocumentEvent e) {
    }
    
    @java.lang.Override()
    public void insertUpdate(@org.jetbrains.annotations.Nullable()
    javax.swing.event.DocumentEvent e) {
    }
    
    @java.lang.Override()
    public void removeUpdate(@org.jetbrains.annotations.Nullable()
    javax.swing.event.DocumentEvent e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public javax.swing.JComponent createComponent() {
        return null;
    }
    
    public JiraSettings(@org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project) {
        super();
    }
}
package actions.jiraAction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lactions/jiraAction/JiraMoveDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "panel", "Lactions/jiraAction/JiraMovePanel;", "presenter", "Lactions/jiraAction/JiraMoveDialogPresenter;", "getPresenter", "()Lactions/jiraAction/JiraMoveDialogPresenter;", "setPresenter", "(Lactions/jiraAction/JiraMoveDialogPresenter;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "createCenterPanel", "Ljavax/swing/JComponent;", "doOKAction", "", "error", "throwable", "", "setIssue", "issue", "", "setTransitions", "transitionList", "", "Lactions/jiraAction/network/Transition;", "success", "plugin"})
public final class JiraMoveDialog extends com.intellij.openapi.ui.DialogWrapper {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public actions.jiraAction.JiraMoveDialogPresenter presenter;
    private final actions.jiraAction.JiraMovePanel panel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellij.openapi.project.Project project = null;
    
    @org.jetbrains.annotations.NotNull()
    public final actions.jiraAction.JiraMoveDialogPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    actions.jiraAction.JiraMoveDialogPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected javax.swing.JComponent createCenterPanel() {
        return null;
    }
    
    public final void setIssue(@org.jetbrains.annotations.NotNull()
    java.lang.String issue) {
    }
    
    public final void setTransitions(@org.jetbrains.annotations.NotNull()
    java.util.List<actions.jiraAction.network.Transition> transitionList) {
    }
    
    public final void error(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    protected void doOKAction() {
    }
    
    public final void success() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellij.openapi.project.Project getProject() {
        return null;
    }
    
    public JiraMoveDialog(@org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project) {
        super(null, false);
    }
}
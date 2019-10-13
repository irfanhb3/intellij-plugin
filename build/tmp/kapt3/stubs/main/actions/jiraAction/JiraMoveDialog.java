package actions.jiraAction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lactions/jiraAction/JiraMoveDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "panel", "Lactions/jiraAction/JiraMovePanel;", "presenter", "Lactions/jiraAction/JiraMoveDialogPresenter;", "getPresenter", "()Lactions/jiraAction/JiraMoveDialogPresenter;", "setPresenter", "(Lactions/jiraAction/JiraMoveDialogPresenter;)V", "createCenterPanel", "Ljavax/swing/JComponent;", "setIssue", "", "issue", "", "plugin"})
public final class JiraMoveDialog extends com.intellij.openapi.ui.DialogWrapper {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public actions.jiraAction.JiraMoveDialogPresenter presenter;
    private final actions.jiraAction.JiraMovePanel panel = null;
    
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
    
    public JiraMoveDialog(@org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project) {
        super(null, false);
    }
}
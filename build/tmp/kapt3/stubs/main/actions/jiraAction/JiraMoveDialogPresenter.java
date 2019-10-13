package actions.jiraAction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lactions/jiraAction/JiraMoveDialogPresenter;", "", "view", "Lactions/jiraAction/JiraMoveDialog;", "project", "Lcom/intellij/openapi/project/Project;", "component", "Lcomponents/JiraComponent;", "jiraService", "Lactions/jiraAction/network/JiraService;", "(Lactions/jiraAction/JiraMoveDialog;Lcom/intellij/openapi/project/Project;Lcomponents/JiraComponent;Lactions/jiraAction/network/JiraService;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "issue", "", "doTransition", "", "selectedItem", "Lactions/jiraAction/network/Transition;", "getAuthCode", "getBranch", "getTransitions", "load", "plugin"})
public final class JiraMoveDialogPresenter {
    private io.reactivex.disposables.Disposable disposable;
    private java.lang.String issue;
    private final actions.jiraAction.JiraMoveDialog view = null;
    private final com.intellij.openapi.project.Project project = null;
    private final components.JiraComponent component = null;
    private final actions.jiraAction.network.JiraService jiraService = null;
    
    public final void load() {
    }
    
    private final void getBranch() {
    }
    
    private final void getTransitions() {
    }
    
    public final void doTransition(@org.jetbrains.annotations.NotNull()
    actions.jiraAction.network.Transition selectedItem, @org.jetbrains.annotations.NotNull()
    java.lang.String issue) {
    }
    
    private final java.lang.String getAuthCode() {
        return null;
    }
    
    @javax.inject.Inject()
    public JiraMoveDialogPresenter(@org.jetbrains.annotations.NotNull()
    actions.jiraAction.JiraMoveDialog view, @org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull()
    components.JiraComponent component, @org.jetbrains.annotations.NotNull()
    actions.jiraAction.network.JiraService jiraService) {
        super();
    }
}
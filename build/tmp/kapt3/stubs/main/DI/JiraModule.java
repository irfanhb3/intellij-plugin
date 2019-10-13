package DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0003H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"LDI/JiraModule;", "", "view", "Lactions/jiraAction/JiraMoveDialog;", "project", "Lcom/intellij/openapi/project/Project;", "(Lactions/jiraAction/JiraMoveDialog;Lcom/intellij/openapi/project/Project;)V", "provideComponent", "Lcomponents/JiraComponent;", "provideProject", "provideView", "plugin"})
@dagger.Module()
public final class JiraModule {
    private final actions.jiraAction.JiraMoveDialog view = null;
    private final com.intellij.openapi.project.Project project = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final actions.jiraAction.JiraMoveDialog provideView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.intellij.openapi.project.Project provideProject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final components.JiraComponent provideComponent() {
        return null;
    }
    
    public JiraModule(@org.jetbrains.annotations.NotNull()
    actions.jiraAction.JiraMoveDialog view, @org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project) {
        super();
    }
}
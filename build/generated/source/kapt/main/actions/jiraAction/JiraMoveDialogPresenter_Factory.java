package actions.jiraAction;

import actions.jiraAction.network.JiraService;
import com.intellij.openapi.project.Project;
import components.JiraComponent;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JiraMoveDialogPresenter_Factory implements Factory<JiraMoveDialogPresenter> {
  private final Provider<JiraMoveDialog> viewProvider;

  private final Provider<Project> projectProvider;

  private final Provider<JiraComponent> componentProvider;

  private final Provider<JiraService> jiraServiceProvider;

  public JiraMoveDialogPresenter_Factory(
      Provider<JiraMoveDialog> viewProvider,
      Provider<Project> projectProvider,
      Provider<JiraComponent> componentProvider,
      Provider<JiraService> jiraServiceProvider) {
    assert viewProvider != null;
    this.viewProvider = viewProvider;
    assert projectProvider != null;
    this.projectProvider = projectProvider;
    assert componentProvider != null;
    this.componentProvider = componentProvider;
    assert jiraServiceProvider != null;
    this.jiraServiceProvider = jiraServiceProvider;
  }

  @Override
  public JiraMoveDialogPresenter get() {
    return new JiraMoveDialogPresenter(
        viewProvider.get(),
        projectProvider.get(),
        componentProvider.get(),
        jiraServiceProvider.get());
  }

  public static Factory<JiraMoveDialogPresenter> create(
      Provider<JiraMoveDialog> viewProvider,
      Provider<Project> projectProvider,
      Provider<JiraComponent> componentProvider,
      Provider<JiraService> jiraServiceProvider) {
    return new JiraMoveDialogPresenter_Factory(
        viewProvider, projectProvider, componentProvider, jiraServiceProvider);
  }
}

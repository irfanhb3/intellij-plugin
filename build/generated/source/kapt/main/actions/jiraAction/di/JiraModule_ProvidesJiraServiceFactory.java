package actions.jiraAction.di;

import actions.jiraAction.network.JiraService;
import components.JiraComponent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JiraModule_ProvidesJiraServiceFactory implements Factory<JiraService> {
  private final JiraModule module;

  private final Provider<JiraComponent> componentProvider;

  public JiraModule_ProvidesJiraServiceFactory(
      JiraModule module, Provider<JiraComponent> componentProvider) {
    assert module != null;
    this.module = module;
    assert componentProvider != null;
    this.componentProvider = componentProvider;
  }

  @Override
  public JiraService get() {
    return Preconditions.checkNotNull(
        module.providesJiraService(componentProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<JiraService> create(
      JiraModule module, Provider<JiraComponent> componentProvider) {
    return new JiraModule_ProvidesJiraServiceFactory(module, componentProvider);
  }
}

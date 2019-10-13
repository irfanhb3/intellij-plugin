package actions.jiraAction.di;

import components.JiraComponent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JiraModule_ProvideComponentFactory implements Factory<JiraComponent> {
  private final JiraModule module;

  public JiraModule_ProvideComponentFactory(JiraModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public JiraComponent get() {
    return Preconditions.checkNotNull(
        module.provideComponent(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<JiraComponent> create(JiraModule module) {
    return new JiraModule_ProvideComponentFactory(module);
  }
}

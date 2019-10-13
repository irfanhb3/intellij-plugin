package actions.jiraAction.di;

import actions.jiraAction.JiraMoveDialog;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JiraModule_ProvideViewFactory implements Factory<JiraMoveDialog> {
  private final JiraModule module;

  public JiraModule_ProvideViewFactory(JiraModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public JiraMoveDialog get() {
    return Preconditions.checkNotNull(
        module.provideView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<JiraMoveDialog> create(JiraModule module) {
    return new JiraModule_ProvideViewFactory(module);
  }
}

package actions.jiraAction.di;

import com.intellij.openapi.project.Project;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JiraModule_ProvideProjectFactory implements Factory<Project> {
  private final JiraModule module;

  public JiraModule_ProvideProjectFactory(JiraModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Project get() {
    return Preconditions.checkNotNull(
        module.provideProject(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Project> create(JiraModule module) {
    return new JiraModule_ProvideProjectFactory(module);
  }
}

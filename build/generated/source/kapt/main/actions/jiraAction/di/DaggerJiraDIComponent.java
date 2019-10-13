package actions.jiraAction.di;

import actions.jiraAction.JiraMoveDialog;
import actions.jiraAction.JiraMoveDialogPresenter;
import actions.jiraAction.JiraMoveDialogPresenter_Factory;
import actions.jiraAction.JiraMoveDialog_MembersInjector;
import actions.jiraAction.network.JiraService;
import com.intellij.openapi.project.Project;
import components.JiraComponent;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerJiraDIComponent implements JiraDIComponent {
  private Provider<JiraMoveDialog> provideViewProvider;

  private Provider<Project> provideProjectProvider;

  private Provider<JiraComponent> provideComponentProvider;

  private Provider<JiraService> providesJiraServiceProvider;

  private Provider<JiraMoveDialogPresenter> jiraMoveDialogPresenterProvider;

  private MembersInjector<JiraMoveDialog> jiraMoveDialogMembersInjector;

  private DaggerJiraDIComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideViewProvider = JiraModule_ProvideViewFactory.create(builder.jiraModule);

    this.provideProjectProvider = JiraModule_ProvideProjectFactory.create(builder.jiraModule);

    this.provideComponentProvider = JiraModule_ProvideComponentFactory.create(builder.jiraModule);

    this.providesJiraServiceProvider =
        JiraModule_ProvidesJiraServiceFactory.create(builder.jiraModule, provideComponentProvider);

    this.jiraMoveDialogPresenterProvider =
        JiraMoveDialogPresenter_Factory.create(
            provideViewProvider,
            provideProjectProvider,
            provideComponentProvider,
            providesJiraServiceProvider);

    this.jiraMoveDialogMembersInjector =
        JiraMoveDialog_MembersInjector.create(jiraMoveDialogPresenterProvider);
  }

  @Override
  public void inject(JiraMoveDialog jiraMoveDialog) {
    jiraMoveDialogMembersInjector.injectMembers(jiraMoveDialog);
  }

  public static final class Builder {
    private JiraModule jiraModule;

    private Builder() {}

    public JiraDIComponent build() {
      if (jiraModule == null) {
        throw new IllegalStateException(JiraModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerJiraDIComponent(this);
    }

    public Builder jiraModule(JiraModule jiraModule) {
      this.jiraModule = Preconditions.checkNotNull(jiraModule);
      return this;
    }
  }
}

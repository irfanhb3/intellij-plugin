package actions.jiraAction;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class JiraMoveDialog_MembersInjector implements MembersInjector<JiraMoveDialog> {
  private final Provider<JiraMoveDialogPresenter> presenterProvider;

  public JiraMoveDialog_MembersInjector(Provider<JiraMoveDialogPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<JiraMoveDialog> create(
      Provider<JiraMoveDialogPresenter> presenterProvider) {
    return new JiraMoveDialog_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(JiraMoveDialog instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }
}

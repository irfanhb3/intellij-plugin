package actions.jiraAction.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lactions/jiraAction/network/JiraService;", "", "doTransition", "Lio/reactivex/Completable;", "authKey", "", "issueId", "transitionData", "Lactions/jiraAction/network/TransitionData;", "getTransitions", "Lio/reactivex/Single;", "Lactions/jiraAction/network/TransitionsResponse;", "plugin"})
public abstract interface JiraService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "issue/{issueId}/transitions")
    public abstract io.reactivex.Single<actions.jiraAction.network.TransitionsResponse> getTransitions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "issueId")
    java.lang.String issueId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "issue/{issueId}/transitions")
    public abstract io.reactivex.Completable doTransition(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "issueId")
    java.lang.String issueId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    actions.jiraAction.network.TransitionData transitionData);
}
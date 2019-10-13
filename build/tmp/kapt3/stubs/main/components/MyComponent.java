package components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002R\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcomponents/MyComponent;", "Lcom/intellij/openapi/components/ApplicationComponent;", "Lcom/intellij/openapi/components/PersistentStateComponent;", "()V", "localVersion", "", "version", "getState", "initComponent", "", "isNewVersion", "", "loadState", "state", "updateLocalVersion", "plugin"})
@com.intellij.openapi.components.State(name = "MyConfiguration", storages = {@com.intellij.openapi.components.Storage(value = "myConfiguation.xml")})
public final class MyComponent implements com.intellij.openapi.components.ApplicationComponent, com.intellij.openapi.components.PersistentStateComponent<components.MyComponent> {
    @com.intellij.util.xmlb.annotations.Attribute()
    private java.lang.String localVersion;
    private java.lang.String version;
    
    @java.lang.Override()
    public void initComponent() {
    }
    
    private final boolean isNewVersion() {
        return false;
    }
    
    private final void updateLocalVersion() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public components.MyComponent getState() {
        return null;
    }
    
    @java.lang.Override()
    public void loadState(@org.jetbrains.annotations.NotNull()
    components.MyComponent state) {
    }
    
    public MyComponent() {
        super();
    }
}
package dev.androidbroadcast.news.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Ldev/androidbroadcast/news/main/NewsMainViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllArticlesUseCase", "Ljavax/inject/Provider;", "Ldev/androidbroadcast/news/main/GetAllArticlesUseCase;", "(Ljavax/inject/Provider;)V", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Ldev/androidbroadcast/news/main/State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "forceUpdate", "", "news-main_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NewsMainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<dev.androidbroadcast.news.main.State> state = null;
    
    @javax.inject.Inject()
    public NewsMainViewModel(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<dev.androidbroadcast.news.main.GetAllArticlesUseCase> getAllArticlesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<dev.androidbroadcast.news.main.State> getState() {
        return null;
    }
    
    public final void forceUpdate() {
    }
}
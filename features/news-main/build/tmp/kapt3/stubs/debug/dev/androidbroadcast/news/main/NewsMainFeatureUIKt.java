package dev.androidbroadcast.news.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0003\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0003\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0003\u001a\b\u0010\r\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0011H\u0003\u00a8\u0006\u0012"}, d2 = {"Article", "", "article", "Ldev/androidbroadcast/news/main/ArticleUI;", "Articles", "articles", "", "ErrorMessage", "state", "Ldev/androidbroadcast/news/main/State$Error;", "NewsMainContent", "currentState", "Ldev/androidbroadcast/news/main/State;", "NewsMainScreen", "viewModel", "Ldev/androidbroadcast/news/main/NewsMainViewModel;", "ProgressIndicator", "Ldev/androidbroadcast/news/main/State$Loading;", "news-main_debug"})
public final class NewsMainFeatureUIKt {
    
    @androidx.compose.runtime.Composable()
    public static final void NewsMainScreen() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void NewsMainScreen(@org.jetbrains.annotations.NotNull()
    dev.androidbroadcast.news.main.NewsMainViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void NewsMainContent(dev.androidbroadcast.news.main.State currentState) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ErrorMessage(dev.androidbroadcast.news.main.State.Error state) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ProgressIndicator(dev.androidbroadcast.news.main.State.Loading state) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void Articles(@androidx.compose.ui.tooling.preview.PreviewParameter(provider = dev.androidbroadcast.news.main.ArticlesPreviewProvider.class, limit = 1)
    java.util.List<dev.androidbroadcast.news.main.ArticleUI> articles) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void Article(@androidx.compose.ui.tooling.preview.PreviewParameter(provider = dev.androidbroadcast.news.main.ArticlePreviewProvider.class, limit = 1)
    @org.jetbrains.annotations.NotNull()
    dev.androidbroadcast.news.main.ArticleUI article) {
    }
}
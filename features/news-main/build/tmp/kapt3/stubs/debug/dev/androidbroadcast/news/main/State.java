package dev.androidbroadcast.news.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0017\b\u0004\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Ldev/androidbroadcast/news/main/State;", "", "articles", "", "Ldev/androidbroadcast/news/main/ArticleUI;", "(Ljava/util/List;)V", "getArticles", "()Ljava/util/List;", "Error", "Loading", "None", "Success", "Ldev/androidbroadcast/news/main/State$Error;", "Ldev/androidbroadcast/news/main/State$Loading;", "Ldev/androidbroadcast/news/main/State$None;", "Ldev/androidbroadcast/news/main/State$Success;", "news-main_debug"})
public abstract class State {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<dev.androidbroadcast.news.main.ArticleUI> articles = null;
    
    private State(java.util.List<dev.androidbroadcast.news.main.ArticleUI> articles) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<dev.androidbroadcast.news.main.ArticleUI> getArticles() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Ldev/androidbroadcast/news/main/State$Error;", "Ldev/androidbroadcast/news/main/State;", "articles", "", "Ldev/androidbroadcast/news/main/ArticleUI;", "(Ljava/util/List;)V", "news-main_debug"})
    public static final class Error extends dev.androidbroadcast.news.main.State {
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.util.List<dev.androidbroadcast.news.main.ArticleUI> articles) {
        }
        
        public Error() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Ldev/androidbroadcast/news/main/State$Loading;", "Ldev/androidbroadcast/news/main/State;", "articles", "", "Ldev/androidbroadcast/news/main/ArticleUI;", "(Ljava/util/List;)V", "news-main_debug"})
    public static final class Loading extends dev.androidbroadcast.news.main.State {
        
        public Loading(@org.jetbrains.annotations.Nullable()
        java.util.List<dev.androidbroadcast.news.main.ArticleUI> articles) {
        }
        
        public Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Ldev/androidbroadcast/news/main/State$None;", "Ldev/androidbroadcast/news/main/State;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "news-main_debug"})
    public static final class None extends dev.androidbroadcast.news.main.State {
        @org.jetbrains.annotations.NotNull()
        public static final dev.androidbroadcast.news.main.State.None INSTANCE = null;
        
        private None() {
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Ldev/androidbroadcast/news/main/State$Success;", "Ldev/androidbroadcast/news/main/State;", "articles", "", "Ldev/androidbroadcast/news/main/ArticleUI;", "(Ljava/util/List;)V", "news-main_debug"})
    public static final class Success extends dev.androidbroadcast.news.main.State {
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<dev.androidbroadcast.news.main.ArticleUI> articles) {
        }
    }
}
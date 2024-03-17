// Generated by Dagger (https://dagger.dev).
package dev.androidbroadcast.news.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NewsMainViewModel_Factory implements Factory<NewsMainViewModel> {
  private final Provider<GetAllArticlesUseCase> getAllArticlesUseCaseProvider;

  public NewsMainViewModel_Factory(Provider<GetAllArticlesUseCase> getAllArticlesUseCaseProvider) {
    this.getAllArticlesUseCaseProvider = getAllArticlesUseCaseProvider;
  }

  @Override
  public NewsMainViewModel get() {
    return newInstance(getAllArticlesUseCaseProvider);
  }

  public static NewsMainViewModel_Factory create(
      Provider<GetAllArticlesUseCase> getAllArticlesUseCaseProvider) {
    return new NewsMainViewModel_Factory(getAllArticlesUseCaseProvider);
  }

  public static NewsMainViewModel newInstance(
      Provider<GetAllArticlesUseCase> getAllArticlesUseCase) {
    return new NewsMainViewModel(getAllArticlesUseCase);
  }
}
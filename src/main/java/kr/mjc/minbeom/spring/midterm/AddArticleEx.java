package kr.mjc.minbeom.spring.midterm;

import kr.mjc.minbeom.java.jdbc.article.Article;
import kr.mjc.minbeom.java.jdbc.article.ArticleDao;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class AddArticleEx {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ArticleDao articleDao = context.getBean(ArticleDao.class);

        Article article = new Article();
        article.setTitle("중간고사 제목입니다.");
        article.setContent("테스트입니다.");
        article.setUserId(328);
        article.setName("김민범");
        articleDao.addArticle(article);

        log.debug("글을 저장했습니다. title={}", article.getTitle());
    }
}
package kr.mjc.minbeom.java.jdbc.article;


public class AddArticleEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        Article article = new Article();
        article.setTitle("테스트입니다.");
        article.setContent("테스트입니다.");
        article.setUserId(328);
        article.setName("김민범");
        articleDao.addArticle(article);
        System.out.println("글을 추가했습니다.");
    }
}

package kr.mjc.minbeom.java.jdbc.article;

public class GetArticleEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        Article article = articleDao.getArticle(305);
        System.out.println(article);
    }
}

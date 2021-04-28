package kr.mjc.minbeom.java.jdbc.article;

public class UpdateArticleEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        Article article = new Article();
        article.setArticleId(305);
        article.setTitle("제목 수정중입니다.");
        article.setContent("내용 수정중입니다.");
        article.setUserId(328);
        if (articleDao.updateArticle(article) > 0) {
            System.out.println("글을 수정했습니다.");
        } else {
            System.out.println("글을 수정하지 못했습니다.");
        }
    }
}

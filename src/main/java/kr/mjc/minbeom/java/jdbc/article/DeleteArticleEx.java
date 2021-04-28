package kr.mjc.minbeom.java.jdbc.article;

public class DeleteArticleEx {
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDaoImplUsingDbUtils();
        int deleteRows = articleDao.deleteArticle(1,1);
        if(deleteRows > 0)
            System.out.println("게시물을 삭제했습니다.");
        else
            System.out.println("게시물을 삭제할 수 없습니다.");
    }
}

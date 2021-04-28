package kr.mjc.minbeom.java.jdbc.user;

public class GetUserEx {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImplUsingDbUtils();
        User user = userDao.getUser(328);
        System.out.println(user);
    }
}


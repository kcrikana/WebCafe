package kr.mjc.minbeom.java.jdbc.user;

import kr.mjc.minbeom.java.jdbc.DataAccessException;

public class AddUserEx {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImplUsingDbUtils();
        User user = new User();
        user.setEmail("beom0109@naver.com");
        user.setPassword("blast");
        user.setName("김민범");
        try {
            userDao.addUser(user);
            System.out.format("사용자를 추가했습니다 : %s\n", user);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
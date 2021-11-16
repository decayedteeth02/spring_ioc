package cn.test.beans;

public class User {
    private Integer id;
    private String username;
    private String realname;

    public User() {
        System.out.println("User已加载");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }

}

package cn.test.beans;

public class User {
    private Integer id;
    private String username;
    private String realname;

    public User() {
        System.out.println("User已加载");
    }

    public Integer getId() {
        return id;
    }

    //基于setter的依赖注入
//    name属性对应set名字
    //比如setId ->Id  setXXX->XXX
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }

    public User(Integer id, String username, String realname) {
        this.id = id;
        this.username = username;
        this.realname = realname;
    }
}

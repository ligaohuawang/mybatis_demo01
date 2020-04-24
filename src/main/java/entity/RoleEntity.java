package entity;


public class RoleEntity {

    private Integer rid;
    private String rolename;
    private String roledesc;

    public RoleEntity(Integer rid, String rolename, String roledesc) {
        this.rid = rid;
        this.rolename = rolename;
        this.roledesc = roledesc;
    }

    public RoleEntity() {

    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "rid=" + rid +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                '}';
    }
}

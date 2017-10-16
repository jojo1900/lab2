package action;
import SqlCon.SqlCon;

public class TestAction {
	private String usrname;//此处名称应与jsp表单名一致
    private String pwd;
    public String getUsrname() {
        return usrname;
    }
    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    public String excute()
    {
        SqlCon mycon = new SqlCon();
        String insert = "insert into users values('"+getUsrname()+"','"+getPwd()+"');";
        mycon.executeUpdate(insert);
        return "SUCCESS";
    }
}

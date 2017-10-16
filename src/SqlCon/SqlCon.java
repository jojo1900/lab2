package SqlCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlCon {
	Connection con =null;
    Statement stat=null;
    ResultSet rs=null;
    
    public SqlCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//连接驱动
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","你自己设定的数据库密码");//连接数据库
            stat=con.createStatement();
            
        }
        
        catch(Exception e)
        {
            con=null;
        }
    
    }
    
    public ResultSet executeQuery(String sql)
    {
        try
        {
            
            rs=stat.executeQuery(sql);
        
        }
        
        catch(Exception e)
        {
            rs=null;
        }
        return rs;
    }
    
    public int executeUpdate(String sql)
    {
        try
        {
            stat.executeUpdate(sql);
            return 0;
        }
        catch(Exception e)
        {
            return -1;
        }
    }
}

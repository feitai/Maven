import org.example.Jisuan;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Description: Jisuan
 * Author: heyv
 * Time: 2023 2023/7/21 20:49
 */
public class TestAdd {

    @Test
    public void tyestAdd() {
        Jisuan jisuan = new Jisuan();

        int result1 = jisuan.add(12,15);
        int result2 = jisuan.add(12,10);
        int result3 = jisuan.add(1,7);

        Assert.assertEquals(27, result1);
        Assert.assertEquals(22, result2);
        Assert.assertEquals(8, result3);

    }

    @Test
    public void testCon() throws SQLException{
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cbg","root","a");
            System.out.println("连接成功");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}

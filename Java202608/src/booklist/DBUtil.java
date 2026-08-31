package booklist;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 접속 정보를 한 곳에 모아 둔다.
 * JSP마다 url·아이디·비밀번호를 복사해 넣던 것을 없애기 위한 클래스다.
 */
public class DBUtil {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "madang";
    private static final String PASSWORD = "madang";

    // MariaDB로 실습한다면 아래 URL을 쓴다.
    // "jdbc:mariadb://localhost:3306/madang"

    public static Connection getConnection() throws Exception {
        // JDBC 4.0(Java 6)부터 Class.forName() 은 필요 없다.
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

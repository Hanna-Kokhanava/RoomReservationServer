package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * Created by Ania on 17.09.2016.
 */

@WebServlet(name = "GetRoomsServlet")
public class GetRoomsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("==========================");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("asdf") ;
        out.flush();
//        response.getWriter().print("It works!!!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    //private void DBConnection() {
//
//		String DRIVER = "com.mysql.jdbc.Driver";
//		String URL = "jdbc:mysql://localhost:3306";
//		String USER = "root";
//		String PASS = "root";
//		String sql = "insert into rooms.all_rooms values(?, ?)";
//		Connection connection;
//
//
//		try {
//			Class.forName(DRIVER);
//			connection = (Connection) DriverManager.getConnection(URL, USER, PASS);
//			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
////			ps.setString(1, name);
////			ps.setInt(2, price);
//
//			int a = ps.executeUpdate();
//
//			if (a==1) {
//				System.out.println("Data inserted");
//			}
//
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
package tool;

import java.io.PrintWriter;

public class Page {
	public static void head(PrintWriter out) {
		out.println("<!DOCTYPE= html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset ='UTF-8'>");
		out.println("<title> </title>");
		out.println("</head>");
		out.println("<body>");

	}

	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}

	public static String utf() {
		final String utf = "UTF-8";
		return utf;
	}

	public static String charset() {
		final String ch = "text/html; charset=UTF-8";
		return ch;
	}

	public static String ps() {
		final String insert = "INSERT INTO dummy values(null,?,?)";
		return insert;
	}

	public static String DB_Dr() {
		// MySQL用JDBCドライバの完全修飾クラス名を定義する。
		final String JDBC_DRIVER = "ドライバクラス名";
		return JDBC_DRIVER;
	}

	public static String Book() {
		// 接続するMySQLデータベースのURLを定義する。
		final String DB_URL ="データベースURL";

		return DB_URL;
	}


}

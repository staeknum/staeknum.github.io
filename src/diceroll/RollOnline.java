package diceroll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;
/**
 *
 * @author STAEKNUM
 * class of Excec.
 * First of all, you started this class.
 *
 */

@WebServlet(urlPatterns = { "/diceroll/RollOnline" })
public class RollOnline extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType(Page.charset());
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding(Page.utf());

		Page.head(out);

		String setType =  request.getParameter("DiceType");
		String setQty = request.getParameter("countDiceQty");
		request.setAttribute("DiceType",setType);
		request.setAttribute("countDiceQty", setQty);

		RequestDispatcher dispatch = request.getRequestDispatcher("DiceResult.jsp");
		dispatch.forward(request, response);

		Page.footer(out);
	}
}
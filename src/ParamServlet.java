import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ParamServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String gender = request.getParameter("gender");
		String[] interest = request.getParameterValues("interest");
		String job = request.getParameter("job");
		String textarea = request.getParameter("textarea");

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<table cellpadding='10px' cellspacing='0' border='1px'>");
		out.print("<tr>");
		out.print("<td>아이디</td>");
		out.print("<td>" + id + "</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>성별</td>");
		out.print("<td>" + gender + "</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>관심 악세서리</td>");
		out.print("<td>");
		if (interest != null) {

			for (int i = 0; i < interest.length; i++) {
				if (i != interest.length - 1) {
					out.print(interest[i] + " , ");
				} else {
					out.print(interest[i]);
				}
			}
		} else {
			out.print("없음");

		}
		out.print("</td></tr>");
		out.print("<tr>");
		out.print("<td>직업</td>");
		out.print("<td>" + job + "</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.print("<td>가입인사</td>");
		out.print("<td>" + textarea + "</td>");
		out.print("</tr>");
	}

}

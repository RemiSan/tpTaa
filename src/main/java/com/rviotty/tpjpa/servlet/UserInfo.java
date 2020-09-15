package com.rviotty.tpjpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="userinfo",
urlPatterns={"/UserInfo"})
public class UserInfo extends HttpServlet {

	private static final long serialVersionUID = 1796858895545644976L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();


		out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>" +			
				" <LI>Name: "
				+ request.getParameter("name") + "\n" +
				" <LI>Mail: "
				+ request.getParameter("mail") + "\n" +
				"</UL>\n" +				
				"</BODY></HTML>");
	}
}

package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/get/add")  // 404에러가 나니까 이게 url써주는거
public class C1_get extends HttpServlet{ // HttpServlet을 상속받으면 servlet.
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
			int num1 = 1;
			int num2 = 2;
	
			res.setContentType("text/html; charset=utf-8"); //response의 헤더에 저장이됨.
			PrintWriter out = res.getWriter(); // response의 바디에 저장이됨.
			out.println("<h2>GET</h2>");
			out.printf("<p>%d + %d = %d</p>", num1, num2, num1 + num2);
		}
}
 
/*
	request type은 5가지
	get은 읽기
	post는 쓰기
	doGet은 서블릿이 받은 리퀘스트타입이 get일때 콜된다. 객체형태로 데이터가 정리되있으면된다.
	콜하는 주체는 톰캣이 콜을 한다. (자세히는 서블릿컨테이너)
	리턴값주면 서블릿컨테이너가 받는다. throw해도 서블릿컨테이너가 받는다.
	서블릿컨테이너 안에는 JRE가 다 들어가있다.
	달리표현하면 자바버츄얼머신이 do get한다 리턴값받는다 이런식.
	
	http는 늘 exception이 일어날상황이 있다. 그래서 throw를 쓴다.
	
	response의 내용을 {}안에 작성한다.
	
	서블릿이 하는일 : html코드를 만들어내는일.
	
	localhost : machine의 주소.
	localhost:80  -> 톰캣의 주소.
	localhost:80/servlet -> context path의 주소.
	
	text의 집합 : context
	여기서 c1_Get이 text고 나머지가 다 context이다.
	
	response에 담는 주소에는 context가 담기지않도록해야한다.
	
	절대주소 : context path가 포함된 주소.
	절대주소를 써야하는 경우 : 다른서버에 있는 주소를 나타낼때.
	상대주소 : context path가 포함안된 뒤의 주소.
	
	어노테이션에는 상대주소를 써놓으면 된다.
	url은 유일해야한다.
	
	http://localhost/servlet/ch01/1.get.html
	+
	get/add
	
	=	http://localhost/servlet/ch01/get/add
	
	1 + x = 3 
*/
 
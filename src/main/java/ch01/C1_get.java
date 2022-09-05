package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/get/add")  // 404������ ���ϱ� �̰� url���ִ°�
public class C1_get extends HttpServlet{ // HttpServlet�� ��ӹ����� servlet.
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
			int num1 = 1;
			int num2 = 2;
	
			res.setContentType("text/html; charset=utf-8"); //response�� ����� �����̵�.
			PrintWriter out = res.getWriter(); // response�� �ٵ� �����̵�.
			out.println("<h2>GET</h2>");
			out.printf("<p>%d + %d = %d</p>", num1, num2, num1 + num2);
		}
}
 
/*
	request type�� 5����
	get�� �б�
	post�� ����
	doGet�� ������ ���� ������ƮŸ���� get�϶� �ݵȴ�. ��ü���·� �����Ͱ� ������������ȴ�.
	���ϴ� ��ü�� ��Ĺ�� ���� �Ѵ�. (�ڼ����� ���������̳�)
	���ϰ��ָ� ���������̳ʰ� �޴´�. throw�ص� ���������̳ʰ� �޴´�.
	���������̳� �ȿ��� JRE�� �� ���ִ�.
	�޸�ǥ���ϸ� �ڹٹ����ӽ��� do get�Ѵ� ���ϰ��޴´� �̷���.
	
	http�� �� exception�� �Ͼ��Ȳ�� �ִ�. �׷��� throw�� ����.
	
	response�� ������ {}�ȿ� �ۼ��Ѵ�.
	
	������ �ϴ��� : html�ڵ带 ��������.
	
	localhost : machine�� �ּ�.
	localhost:80  -> ��Ĺ�� �ּ�.
	localhost:80/servlet -> context path�� �ּ�.
	
	text�� ���� : context
	���⼭ c1_Get�� text�� �������� �� context�̴�.
	
	response�� ��� �ּҿ��� context�� ������ʵ����ؾ��Ѵ�.
	
	�����ּ� : context path�� ���Ե� �ּ�.
	�����ּҸ� ����ϴ� ��� : �ٸ������� �ִ� �ּҸ� ��Ÿ����.
	����ּ� : context path�� ���Ծȵ� ���� �ּ�.
	
	������̼ǿ��� ����ּҸ� ������� �ȴ�.
	url�� �����ؾ��Ѵ�.
	
	http://localhost/servlet/ch01/1.get.html
	+
	get/add
	
	=	http://localhost/servlet/ch01/get/add
	
	1 + x = 3 
*/
 
package kr.ac.hansung.cse.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*") //root의 모든 request를 가로채겠다는
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //처리하고 싶은 내용
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println( ((HttpServletRequest) request).getRequestURL() );

        //filter를 만들었으면 이후의 filter로 넘겨줘야함, pass the request along the filter chains
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}

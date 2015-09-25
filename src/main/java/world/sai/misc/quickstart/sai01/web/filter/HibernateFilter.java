package world.sai.misc.quickstart.sai01.web.filter;

import world.sai.misc.quickstart.sai01.core.hibernate.HibernateUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by sai on 15. 9. 25..
 */
@WebFilter("/*")
public class HibernateFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Begin unit of work
        System.out.println("filter: ");
        try {
            HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
            chain.doFilter(request, response);
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        }catch(IOException | ServletException | RuntimeException e) {
            // Begin unit of work
            HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
        }finally {

        }
    }

    @Override
    public void destroy() {

    }
}

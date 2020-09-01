package com.amis.api.admin.config;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

@WebFilter(urlPatterns = "/*", filterName = "corsFilter")
public class CorsFilter implements Filter {

  @Autowired private CorsConfig corsConfig;

  @Override
  public void destroy() {}

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
      throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) res;
    response.setHeader("Access-Control-Allow-Origin", corsConfig.getAllowedOrigins());
    response.setHeader("Access-Control-Allow-Methods", corsConfig.getAllowedMethods());

    response.setHeader("Access-Control-Allow-Headers", corsConfig.getAllowedHeaders());
    response.setHeader("Access-Control-Allow-Credentials", "true");
    chain.doFilter(req, res);
  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {}
}

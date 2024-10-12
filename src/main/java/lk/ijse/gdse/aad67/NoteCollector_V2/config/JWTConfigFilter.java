package lk.ijse.gdse.aad67.NoteCollector_V2.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Configuration
public class JWTConfigFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String initToken = request.getHeader("Authorization");
        String userEmail;
        String extractedJwtToken;
        //Validate the token
        if(StringUtils.isEmpty(initToken) || !initToken.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
        }
        extractedJwtToken = initToken.substring(7);


        //Todo:extract Token


    }
}

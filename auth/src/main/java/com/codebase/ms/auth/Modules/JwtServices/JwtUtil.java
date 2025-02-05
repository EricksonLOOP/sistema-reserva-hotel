package com.codebase.ms.auth.Modules.JwtServices;

import com.codebase.ms.auth.Models.UserModel;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Component
public class JwtUtil {
    @Value("${jwtUtil.secret-key}")
    private String SECRET_KEY;
    @Value("${jwtUtil.access-token-validity}")
    private Integer ACCESS_TOKEN_VALIDITY;
    @Value("${jwtUtil.token-prefix}")
    private String TOKEN_PREFIX;
    private final JwtParser jwtParser;
    public JwtUtil(){
        this.jwtParser = Jwts.parserBuilder()
                .setSigningKey(SECRET_KEY)
                .build();
    }

    public String createToken(UserModel userModel){
        return null;
    }
    public Claims parseJwtClaims(String token){
        return null;
    }
    public Claims resolveClaims(HttpServletRequest request){
        return null;
    }
    public String resolveToken(HttpServletRequest request){
        return null;
    }
    public boolean validateClaims(Claims claims) throws AuthenticationException{
        return false;
    }
    public String getUser(Claims claims){
        return claims.getSubject();
    }
    private List<String> getRoles(Claims claims) {
        return (List<String>) claims.get("role");
    }

}

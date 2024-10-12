package lk.ijse.gdse.aad67.NoteCollector_V2.service.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.ijse.gdse.aad67.NoteCollector_V2.service.JWTService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.function.Function;
@Service
public class JWTServiceIMPL implements JWTService {
    @Value("${spring.jwtKey}")
    String jwtKey;
    @Override
    public String extractUserName(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    @Override
    public String generateToken(UserDetails user) {
        return "";
    }

    @Override
    public boolean validateToken(String token, UserDetails userDetails) {
        return false;
    }

    @Override
    public String refreshToken(String prevToken) {
        return "";
    }
    private <T> T extractClaim(String token, Function<Claims,T> claimsResolve) {
       final Claims claims = getClaims(token);
       return claimsResolve.apply(claims);
    }

    private Claims getClaims(String token) {
       return Jwts.parser().setSigningKey(getKey()).build().parseClaimsJwt(token)
                .getBody();
    }
    private Key getKey() {
        byte [] decodedJWT = Decoders.BASE64.decode(jwtKey);
        return Keys.hmacShaKeyFor(decodedJWT);
    }
}

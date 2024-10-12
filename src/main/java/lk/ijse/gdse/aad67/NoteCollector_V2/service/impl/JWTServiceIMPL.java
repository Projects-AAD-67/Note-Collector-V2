package lk.ijse.gdse.aad67.NoteCollector_V2.service.impl;

import lk.ijse.gdse.aad67.NoteCollector_V2.service.JWTService;
import org.springframework.security.core.userdetails.UserDetails;

public class JWTServiceIMPL implements JWTService {
    @Override
    public String extractUserName(String token) {
        return "";
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
}

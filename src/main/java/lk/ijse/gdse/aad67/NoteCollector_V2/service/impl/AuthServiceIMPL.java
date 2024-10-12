package lk.ijse.gdse.aad67.NoteCollector_V2.service.impl;

import lk.ijse.gdse.aad67.NoteCollector_V2.dto.impl.UserDTO;
import lk.ijse.gdse.aad67.NoteCollector_V2.secure.JWTAuthResponse;
import lk.ijse.gdse.aad67.NoteCollector_V2.secure.SignIn;
import lk.ijse.gdse.aad67.NoteCollector_V2.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceIMPL implements AuthService {
    @Override
    public JWTAuthResponse signIn(SignIn signIn) {
        return null;
    }

    @Override
    public JWTAuthResponse signUp(UserDTO userDTO) {
        return null;
    }

    @Override
    public JWTAuthResponse refreshToken(String accessToken) {
        return null;
    }
}

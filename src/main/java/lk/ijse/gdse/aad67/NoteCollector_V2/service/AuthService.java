package lk.ijse.gdse.aad67.NoteCollector_V2.service;

import lk.ijse.gdse.aad67.NoteCollector_V2.dto.impl.UserDTO;
import lk.ijse.gdse.aad67.NoteCollector_V2.secure.JWTAuthResponse;
import lk.ijse.gdse.aad67.NoteCollector_V2.secure.SignIn;

public interface AuthService {
   JWTAuthResponse signIn(SignIn signIn);
   JWTAuthResponse signUp(UserDTO userDTO);
   JWTAuthResponse refreshToken(String accessToken);
}

package lk.ijse.gdse.aad67.NoteCollector_V2.service.impl;
import lk.ijse.gdse.aad67.NoteCollector_V2.dao.UserDao;
import lk.ijse.gdse.aad67.NoteCollector_V2.dto.impl.UserDTO;
import lk.ijse.gdse.aad67.NoteCollector_V2.entity.impl.UserEntity;
import lk.ijse.gdse.aad67.NoteCollector_V2.secure.JWTAuthResponse;
import lk.ijse.gdse.aad67.NoteCollector_V2.secure.SignIn;
import lk.ijse.gdse.aad67.NoteCollector_V2.service.AuthService;
import lk.ijse.gdse.aad67.NoteCollector_V2.service.JWTService;
import lk.ijse.gdse.aad67.NoteCollector_V2.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceIMPL implements AuthService {
    private final UserDao userDao;
    private final Mapping mapping;
    private final JWTService jwtService;
    @Override
    public JWTAuthResponse signIn(SignIn signIn) {
        return null;
    }

    @Override
    public JWTAuthResponse signUp(UserDTO userDTO) {
      //Save user
        UserEntity savedUser = userDao.save(mapping.toUserEntity(userDTO));
      //Generate the token and return it
        var generatedToken = jwtService.generateToken(savedUser);
       return JWTAuthResponse.builder().token(generatedToken).build();
    }

    @Override
    public JWTAuthResponse refreshToken(String accessToken) {
        return null;
    }
}

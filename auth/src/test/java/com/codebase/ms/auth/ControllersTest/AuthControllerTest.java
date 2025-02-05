package com.codebase.ms.auth.ControllersTest;

import com.codebase.ms.auth.Controllers.AuthController;
import com.codebase.ms.auth.Services.AuthServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AuthController.class)
public class AuthControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private AuthServices authServices;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testLoginSucces() throws Exception{

    }

    @Test
    public void testRegisterSuccess() throws Exception{

    }
    @Test
    public void testLoginFailure() throws Exception{

    }
    @Test
    public void testRegisterFailure(){

    }
    @Test
    public void logoutSuccess(){

    }
}

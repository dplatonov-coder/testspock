package dplatonov.testspock.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getText() {
        return "Hello world!";
    }
}

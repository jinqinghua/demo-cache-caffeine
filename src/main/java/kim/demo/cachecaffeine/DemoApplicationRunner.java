package kim.demo.cachecaffeine;

import kim.demo.cachecaffeine.user.User;
import kim.demo.cachecaffeine.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationRunner implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            userService.createUser(User.builder().id(Long.valueOf(i)).name("name" + i).age(20 + i).build());
        }
    }
}
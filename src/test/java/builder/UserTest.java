package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testUser(){
        User user = User.builder().name("Lilia").age(18).occupation("student").build();
        assertEquals(user.toString(), "User(name=Lilia, age=18, gender=null, race=null, height=0, weight=0, occupations=[student])");
    }

}
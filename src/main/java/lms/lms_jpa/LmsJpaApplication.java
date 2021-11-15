package lms.lms_jpa;

import lms.lms_jpa.Domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsJpaApplication {

    public static void main(String[] args) {
        Member member = new Member();
        member.setName("A");
        SpringApplication.run(LmsJpaApplication.class, args);
    }

}

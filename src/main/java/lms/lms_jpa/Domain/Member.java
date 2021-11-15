package lms.lms_jpa.Domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


}

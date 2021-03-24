package basicjpa.studyjpabasic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootTest
@Transactional
class MemberTest {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory();

    EntityManager em = emf.createEntityManager();





    @Test
    public void memberTest(){
        Member setMember = new Member();
        setMember.setId(101L);
        setMember.setName("DDDDD");

        Member member = em.find(Member.class, 101L);
        member.setName("AAAA");

        em.clear();

        Assertions.assertThat(member.getName()).isEqualTo("AAAA");

    }

}
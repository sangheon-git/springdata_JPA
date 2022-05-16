package me.whiteship.demospringdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Repository
//@Transactional
// 가장 진보된 형태
public interface PostRepository extends JpaRepository<Post,Long> {

//    @PersistenceContext // 스프링코드를 최대한 노출시키지 않겠다.
//    EntityManager entityManager;
//    public Post add(Post post) {
//        entityManager.persist(post);
//        return post;
//    }
//
//    public void delete(Post post) {
//        entityManager.remove(post);
//    }
//
//    public List<Post> findAll() {
//        return entityManager.createQuery("SELECT p FROM Post As p", Post.class).getResultList();
//    }

}

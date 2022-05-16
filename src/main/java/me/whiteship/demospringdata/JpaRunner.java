package me.whiteship.demospringdata;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {
    // psql -U "keesun" -d springdata - 로그인시 입력

//    @PersistenceContext
//    EntityManager entityManager;

    @Autowired
    PostRepository PostRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
// ===================================================================
//        Account account = new Account();
//        account.setUsername("whiteship");
//        account.setPassword("hibernate");
//
//        Study study = new Study();
//        study.setName("Spring Data JPA");
//
//        account.addStudy(study);

//        Post post = new Post();
//        post.setTitle("Spring Data JPA 언제 보나...");
//
//        Comment comment = new Comment();
//        comment.setComment("이번 달 안에 다 보겠지?");
//        post.addComment(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setComment("응 아니야~");
//        post.addComment(comment1);
// ===================================================================
//        Session session = entityManager.unwrap(Session.class);
//        Post post = session.get(Post.class, 1L);
//        session.save(post);
//        System.out.println("===============================");
//        System.out.println(post.getTitle());
// ===================================================================
//        Comment comment = session.get(Comment.class, 3L);
//        session.save(comment);
//        System.out.println("===============================");
//        System.out.println(comment.getComment());
//        System.out.println(comment.getPost().getTitle());
// ===================================================================
//        post.getComments().forEach(c -> {
//            System.out.println("===============================");
//            System.out.println(c.getComment());
//            System.out.println(c.getPost().getTitle());
// ========================================================
//        });
        // entityManager.persist(account);
//        session.save(account);
//        session.save(study);
// ===================================================================
// TypedQuery를 이용한 title 조회해오기 query
//
//        TypedQuery<Post> query = entityManager.createQuery("select p from Post as p", Post.class);
//        List<Post> posts = query.getResultList();
//        posts.forEach(System.out::println);

// ===================================================================
//
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//
//        List<Post>posts = entityManager.createQuery(query).getResultList();
//        posts.forEach(System.out::println);
// ===================================================================
//        네이티드 sql을 실행하는 방법
//       List<Post> posts = entityManager.createNativeQuery("select * from Post", Post.class).getResultList();
//       posts.forEach(System.out::println);
// ===================================================================
        PostRepository.findAll().forEach(System.out::println);
    }
}

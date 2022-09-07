//DB 에 접근할수 있게 만들어주는 DB Layer 접근자임 JPA 에서는 인터페이스라고 보통 ibatis 나 myBats 등에서는 Dao 라고함
package com.jojoldu.book.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostsRepository extends JpaRepository<Posts,Long>{
}

package springbootexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootexample.jpa.GuestTextEntry;

@Repository
public interface GuestTextRepository extends JpaRepository<GuestTextEntry, Long> {

}

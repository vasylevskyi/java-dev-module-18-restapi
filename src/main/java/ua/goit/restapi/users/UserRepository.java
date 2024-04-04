package ua.goit.restapi.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.goit.restapi.notes.Note;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}

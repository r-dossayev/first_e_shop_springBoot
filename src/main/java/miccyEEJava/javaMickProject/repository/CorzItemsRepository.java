package miccyEEJava.javaMickProject.repository;


import miccyEEJava.javaMickProject.db.CorzItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorzItemsRepository extends JpaRepository<CorzItems, Long> {
}
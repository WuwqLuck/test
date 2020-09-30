package bolangit.test.Dao;

import bolangit.test.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentModel,String> {
}
